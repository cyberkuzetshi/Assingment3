package com.company;

public class MyHashTable<K, V> implements Hashh{
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

    }

    @Override
    public void put(Object key, Object value) {

    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public Object getKey(Object value) {
        return null;
    }
}
