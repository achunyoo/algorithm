package com.chun.highFrequency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 集合
 * @author: chun
 **/

public class Collection {
    public static void main(String[] args) {
        // 创建一个 ArrayList\LinkedList
        List<String> list = new ArrayList<>();
        List<Integer> link  = new LinkedList<>();


        // 添加元素
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");


        // 获取元素
        System.out.println("Element at index 1: " + list.get(1));

        // 删除元素
        list.remove("Banana");

        // 遍历
        for (String fruit : list) {
            System.out.println(fruit);
        }

        //判断是否包含
        boolean contains = list.contains("Apple");
        System.out.println(contains);

        //获取数量
        System.out.println(list.size());

        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        //重复元素会被忽略
        set.add("apple");
        set.add(null);
        set.remove("banana");

        set.contains("apple");
        set.size();
        Iterator<String> iterator = set.iterator();

        // 遍历集合
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            // 在遍历过程中删除元素（可选）
            if ("banana".equals(element)) {
                iterator.remove(); // 安全删除 "banana"
            }
        }

        System.out.println(set);


        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>(){
            {
                put("one", 1);
                put("two", 2);
            }
        };
        boolean one = map.containsKey("one");
        Set<String> values = map.keySet();

        map.put("one", 1);
        map.put("two", 2);
        map.get("one");
        map.remove("one");

        // 获取, 如果key不存在，则返回默认值
        map.getOrDefault("three", 3);
        map.size();
        System.out.println(map.get("one"));
        System.out.println(map.values());


    }
}
