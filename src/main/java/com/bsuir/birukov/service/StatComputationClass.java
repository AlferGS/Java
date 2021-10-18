package com.bsuir.birukov.service;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import com.bsuir.birukov.entity.Number;
import com.bsuir.birukov.entity.Cache;

public class StatComputationClass {
    private static ArrayList<Integer> valuesArray = new ArrayList<>();

    public static String statComputation(Cache cache){
        setValuesArray(cache);
        return "\tmax - " + maxValue().toString() + "\tmin - " + minValue().toString() + "\taverage - " + averageValue(cache).toString();
    }

    private static void setValuesArray(Cache cache){
        for(Map.Entry<String,Number> e: cache.entrySetFunc()){ //Перенос всех значений из кэша в valuesArray для подсчёта min, max, average
            valuesArray.add(e.getValue().getNumber());
        }
    }
    public static Integer maxValue(){
        return valuesArray.stream()                            //Поиск большего значения в кэше
                .max(Integer::compareTo).get();
    }
    public static Integer minValue(){
        return valuesArray.stream()                            //Поиск меньшего значения в кэше
        .min(Integer::compareTo).get();
    }
    public static Integer averageValue(Cache cache){
//        valuesArray.stream().mapToInt((x) -> x).average()
        Integer averageValue = 0;                              //Поиск среднего значения в кэше
        for (Map.Entry<String,Number> e: cache.entrySetFunc()){
            averageValue += e.getValue().getNumber();
        }
        averageValue /= cache.cacheSize();                     // Sum / sizeof cache
        return averageValue;
    }
}