package org.example.entity;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<String, String> context = new HashMap<>();

    public void add(String key, String value) {
        context.put(key, value);
    }

    public String get(String key) {
        return context.get(key);
    }
}
