package com.company;

import java.util.ArrayList;

public class MyHashTable<K, V>{
    public class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    private ArrayList<HashNode<K, V>> chainArray;
    private int M = 11;
    private int size;

    public MyHashTable() {
        this.chainArray = new ArrayList<>(M);
    }

    public MyHashTable(int s) {
        size = s;
        this.chainArray = new ArrayList<>(size);
    }

    private int hash(K key){
        return 0;
    }

    public void put(K key, V value) {
        HashNode newNode = new HashNode(key, value);
        for(int i = 0; i < size; i++) {
            if(chainArray.get(i).getKey() == key) {
                chainArray.get(i).next = newNode;
                chainArray.get(i).next.next = null;
            } else {
                chainArray.add(newNode);
            }
        }
        size++;
    }

    public V get(K key) {
        for(int i = 0; i < size; i++) {
            if (chainArray.get(i).getKey() == key) {
                return chainArray.get(i).getValue();
            }
        }
        System.out.println("not found, sorry <3");
        return null;
    }

    public V remove(K key) {
        return null;
    }

    public boolean contains(V value) {
        return false;
    }

    public K getKey(V value) {
        return null;
    }
}
