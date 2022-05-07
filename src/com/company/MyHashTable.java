package com.company;

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

    private HashNode<K, V> chainArray[];
    private int M = 11;
    private int size;

    private int hash(K key){
        return 0;
    }

    public void put(K key, V value) {

    }

    public V get(K key) {
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
