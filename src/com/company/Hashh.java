package com.company;

public interface Hashh<K, V> {
    public void put(K key, V value);
    public V get(K key);
    public V remove(K key);
    public boolean contains(V value);
    public K getKey(V value);
}
