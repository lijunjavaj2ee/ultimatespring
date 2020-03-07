package com.algorithm;

import java.util.HashMap;

public class LRUCache {
    private Node head;
    private Node end;
    private int limit;
    private HashMap<String,Node> hashMap;
    public LRUCache(int limit) {
        this.limit = limit;
        hashMap = new HashMap<>();
    }

    public String get(String key) {
        Node node = hashMap.get(key);
        if (node == null) {
            return null;
        }
        refreshNode(node);
        return node.value;
    }

    public void put(String key,String value) {
        Node node = hashMap.get(key);
        if (node == null) {
            if (hashMap.size() >= limit) {
                String oldKey = removeNode(head);
                hashMap.remove(oldKey);
                System.out.println(oldKey+"被删除hashMap.remove");
            }
            node = new Node(key,value);
            addNode(node);
            hashMap.put(key,node);
            System.out.println(key+"被添加");
        } else {
            node.value = value;
            refreshNode(node);
        }
    }

    private void addNode(Node node) {
        if (end != null) {
            end.next = node;
            node.pre = end;
            node.next = null;
        }
        end = node;
        if (head == null) {
            head = node;
        }
    }

    private void refreshNode(Node node) {
        if (node == end) {
            return;
        }
        removeNode(node);
        addNode(node);
    }
    public void remove(String key) {
        Node node = hashMap.get(key);
        removeNode(node);
        hashMap.remove(key);
        System.out.println(key+"被删除remove()");
    }

    private String removeNode(Node node) {
        if (node == end) {
            end = end.pre;
        } else if (node == head) {
            head = head.next;
        } else {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        return node.key;
    }
}
