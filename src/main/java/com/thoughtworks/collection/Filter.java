package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> result = new ArrayList<>();
        for (Integer item : array) {
            if (item%2 == 0){
                result.add(item);
            }
        }
        return  result;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result = new ArrayList<>();
        for (Integer item : array) {
            if (item%3 == 0){
                result.add(item);
            }
        }
        return  result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<>();
        for (Integer itemFirst : firstList) {
            if (secondList.contains(itemFirst)){
                result.add(itemFirst);
            }
        }
        return result;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> result = new ArrayList<>();
        for (Integer item : array) {
            if (!result.contains(item)){
                result.add(item);
            }
        }
        return  result;
    }
}