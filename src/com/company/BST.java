package com.company;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;

public class BST<K extends Comparable<K>, V>{
    private int size = 0;
    LinkedList<Node> tree;

    private class Node implements Comparator<Node> {
        private K key;
        private V value;
        private Node left, right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compare(Node o1, Node o2) {
            if(keyToIndex(o1.key) > keyToIndex(o2.key)){
                return 1;
            }
            else if (keyToIndex(o1.key) == keyToIndex(o2.key)) {
                return 0;
            }
            else {
                return -1;
            }
        }
    }

    public BST(){
        this.tree = new LinkedList<>();
    }

    public int keyToIndex(K key) {
        for(int i = 0; i < size; i++) {
            if (tree.get(i).key == key) {
                return i;
            }
        }
        return size;
    }

    public void put(K key, V value) {
        Node node = new Node(key, value);
        tree.add(node);
        tree.sort(node);
    }

    public V get(K key) {
    }

    public void delete(K key) {
    }

    public Iterable<K> iterator() {}
}
