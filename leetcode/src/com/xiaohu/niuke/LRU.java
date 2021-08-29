package com.xiaohu.niuke;

import java.util.*;


/**
 * @author 小胡哥哥
 * NO BB show your code
 * <p>
 * <p>
 * 设计LRU缓存结构， 该结构在构造时确定大小， 假设大小为K， 并有如下两个功能。
 * set(key,value):将记录(key,value)插入该结构。
 * get(key):返回key对应的value值。
 * 【 要求】
 * 1.set和get方法的时间复杂度为O(1)
 * 2.某个key的set或get操作一旦发生， 认为这个key的记录成了最常使用的
 * 3.当缓存的大小超过K时， 移除最不经常使用的记录， 即set或get最久远的
 */

public class LRU {
    public static void main(String[] args) {
        MyCache<String, Integer> cache1 = new MyCache<>(3);
        cache1.set("a", 1);
        cache1.set("b", 2);
        cache1.set("c", 3);
        System.out.println(cache1.get("b"));
        System.out.println(cache1.get("a"));
        cache1.set("d", 5);
        cache1.set("dd", 6);

        System.out.println(cache1.get("c"));
        System.out.println(cache1.get("dd"));
        System.out.println(cache1.get("d"));

    }

    static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> pre;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    static class NodeDoubleLinkedList<K, V> {
        private Node<K, V> head;
        private Node<K, V> tail;

        public NodeDoubleLinkedList() {
            this.head = null;
            this.tail = null;
        }

        /**
         * 添加一个元素
         */
        public void addNode(Node<K, V> newNode) {

            if (newNode == null) {
                return;
            }
            //链表没有元素，第一个添加元素节点
            if (this.head == null) {
                this.head = newNode;
                //链表中有节点
            } else {
                this.tail.next = newNode;
                newNode.pre = this.tail;
            }
            this.tail = newNode;

        }

        /**
         * 进行操作之后，将其放置在尾结点之后
         * 分离node节点分离，然后将重新连接
         */
        public void moveNodeToTail(Node<K, V> node) {
            if (this.tail == null) {
                return;
            }
            //当前操作结点为头结点
            if (this.head == node) {
                this.head = node.next;
                this.head.pre = null;
            } else {
                //当前node是中间结点,防止越界，最后一个节点截止
                if (node.next != null) {
                    node.pre.next = node.next;
                    node.next.pre = node.pre;
                }
            }
            node.pre = this.tail;
            node.next = null;
            this.tail.next = node;
            this.tail = node;
        }

        /**
         * 删除头部结点
         */

        public Node<K, V> removeHead() {
            if (this.head == null) {
                return null;
            }
            Node<K, V> node = this.head;
            //结点只有一个元素，取出后将头尾结点置为空
            if (this.head == this.tail) {
                this.head = null;
                this.tail = null;
            } else {
                this.head = node.next;
                node.next.pre = this.head;
                node.next = null;
                this.head.pre = null;
            }
            return node;
        }
    }

    static class MyCache<K, V> {
        private HashMap<K, Node<K, V>> keyMap;
        private NodeDoubleLinkedList<K, V> nodeList;
        private int capacity;

        public MyCache(int capacity) {
            if (capacity < 1) {
                throw new RuntimeException("should be more than 0");
            }
            this.keyMap = new HashMap<>();
            this.nodeList = new NodeDoubleLinkedList<>();
            this.capacity = capacity;
        }

        public V get(K key) {
            if (this.keyMap.containsKey(key)) {
                Node<K, V> kvNode = this.keyMap.get(key);
                this.nodeList.moveNodeToTail(kvNode);
                return kvNode.value;
            }
            return null;
        }

        public void set(K key, V value) {
            //找到key代表修改
            if (this.keyMap.containsKey(key)) {
                Node<K, V> kvNode = this.keyMap.get(key);
                kvNode.value = value;
                this.nodeList.moveNodeToTail(kvNode);
                //未找到，代表添加结点
            } else {
                if (this.keyMap.size() == this.capacity + 1) {
                    this.removeMoustCache();
                }
                Node<K, V> node = new Node<>(key, value);
                this.keyMap.put(key, node);
                this.nodeList.addNode(node);

            }
        }

        /**
         * 超过容量删除操作最早的结点,也就是头结点
         */
        private void removeMoustCache() {
            Node<K, V> head = this.nodeList.removeHead();
            this.keyMap.remove(head.key);
        }
    }
}
