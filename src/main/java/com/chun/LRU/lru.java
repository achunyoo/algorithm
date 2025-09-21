package com.chun.LRU;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: chun
 **/

public class lru {
    private static class Node{
        int key;
        int value;
        Node pre;
        Node next;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private static Node dummy = new Node(0,0);//虚拟头结点
    private static  Map<Integer,Node> keyToNode = new HashMap<>();

    public lru(int capacity){
        this.capacity = capacity;
        dummy.next = dummy.pre = dummy;
    }

    public int get(int key){
        Node node = getNode(key);
        return 0;
    }

    public static Node getNode(int key){
        if(!keyToNode.containsKey(key)){
            return null;

        }
        Node node = keyToNode.get(key);
        remove(node);
        pushFront(node);
        return  node;
    }

    public static void remove(Node node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public static void pushFront(Node node){
        node.next = dummy.next;
        node.pre = dummy;
        dummy.next.pre = node;
        dummy.next = node;
    }

    public void put(int key,int value){
        Node node = getNode(key);
        if(node != null){
            node.value = value;
            remove(node);
            pushFront(node);
            return;
        }
        if(keyToNode.size() == capacity){
            Node tail = dummy.pre;
            remove(tail);
            keyToNode.remove(tail.key);
        }
        node = new Node(key,value);
        pushFront(node);
        keyToNode.put(key,node);
    }


    public static void main(String[] args) {

    }
}

