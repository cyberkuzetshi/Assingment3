package com.company;

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
        int remember = 0;
        int d = 2;
        int i = (size - 1) / d;
        while (i < size) {
            if ((int)key > (int)tree.get(i).key) {
                d *= 2;
                i += (size - 1) / d;
            } else if ((int)key == (int)tree.get(i).key) {
                remember = i;
                break;
            } else {
                d *= 2;
                i -= (size - 1) / d;
            }
        }
        return tree.get(remember).value;
    }

    public void delete(K key) {
        int remember = 0;
        int d = 2;
        int i = (size - 1) / d;
        while (i < size) {
            if ((int)key > (int)tree.get(i).key) {
                d *= 2;
                i += (size - 1) / d;
            } else if ((int)key == (int)tree.get(i).key) {
                remember = i;
                break;
            } else {
                d *= 2;
                i -= (size - 1) / d;
            }
        }
        tree.remove(remember);
    }

    public Iterable<K> iterator() {}
}
