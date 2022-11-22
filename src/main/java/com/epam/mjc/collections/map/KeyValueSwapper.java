package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String, Integer> myMap = new HashMap<>();
        sourceMap.forEach((key, value) -> {
            if (!myMap.containsKey(value)) {
                myMap.put(value, key);
            } else {
                if (key < myMap.get(value))
                    myMap.put(value, key);
            }
        });
        return myMap;
    }
}
