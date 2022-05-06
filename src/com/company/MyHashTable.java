package com.company;

public class MyHashTable <T extends Comparable<T>>{
    public class Item implements Comparable<T>{
        T data;
        int key;

        @Override
        public int compareTo(T o) {
            return 0;
        }
        int size = 0;
    }
}
