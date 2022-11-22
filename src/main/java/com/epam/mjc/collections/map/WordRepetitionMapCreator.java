package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> myMap = new HashMap<>();

        String[] words = sentence.toLowerCase().split("[\\s\\r\\.,]");

        for (String word : words) {
            if (word.length() > 0) {
                if (myMap.containsKey(word)) {
                    myMap.put(word, myMap.get(word) + 1);
                } else {
                    myMap.put(word, 1);
                }
            }
        }
        return myMap;
    }
}
