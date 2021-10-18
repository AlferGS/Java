package com.bsuir.birukov.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Data
@Component
public class Cache {
    private Map<String, Number> cacheMap;

    public Cache() {
        this.cacheMap = new HashMap<>();
    }

    public void addCacheValue(String notConvertedInteger, Number numberAfterConverting) {
        cacheMap.put(notConvertedInteger, numberAfterConverting);
    }

    public Number getValue(String notConvertedInteger){ return cacheMap.get(notConvertedInteger); }

    public boolean searchKey(String notConvertedInteger){
        return cacheMap.containsKey(notConvertedInteger);
    }

    public Set<Map.Entry<String, Number>> entrySetFunc() { return cacheMap.entrySet();  }

    public int cacheSize(){ return cacheMap.size(); }

    public void deleteByID (String numberID) { cacheMap.remove(numberID);   }
}
