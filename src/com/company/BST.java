package com.company;


public class BST<K extends Comparable<K>, V>{
    private int size = 0;

    private class Node {
        private K key;
        private V value;
        private Node left, right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value) {
    }

    public V get(K key) {
    }

    public void delete(K key) {
    }

    public Iterable<K> iterator() {}
}
