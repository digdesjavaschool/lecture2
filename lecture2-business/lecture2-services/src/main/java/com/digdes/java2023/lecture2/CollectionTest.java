package com.digdes.java2023.lecture2;

import java.util.*;

public class CollectionTest {
    public void testList() {
        List<String> collection = new LinkedList<>();
        collection.add("Иван");
        collection.add("Алексей");
        collection.add("Роман");
        collection.add("Иван");
        System.out.println(collection);
    }

    public void testMap() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Иван", 2);
        map.put("Алексей", 1);
        map.put("Роман", 3);
        map.put("Борис", 8);
        System.out.println(map);
    }

    public void testSet() {
        Set<String> collection = new TreeSet<>();
        collection.add("Иван");
        collection.add("Алексей");
        collection.add("Роман");
        collection.add("Иван");
        System.out.println(collection);
    }
}
