package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for (Integer[] item : array) {
            for (Integer listItem : item) {
                result.add(listItem);
            }
        }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for (Integer[] item : array) {
            for (Integer listItem : item) {
                if (!result.contains(listItem)){
                    result.add(listItem);
                }
            }
        }
        return result;
    }
}
