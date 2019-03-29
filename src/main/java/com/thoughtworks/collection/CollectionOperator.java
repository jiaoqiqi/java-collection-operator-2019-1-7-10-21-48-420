package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left<right){
            for (int i = left; i <= right; i++) {
                result.add(i);
            }
        }else{
            for (int i = left; i >= right; i--) {
                result.add(i);
            }
        }
        return  result;
    }
    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left<right){
            for (int i = left; i <= right; i++) {
                if (i%2==0){
                    result.add(i);
                }
            }
        }else{
            for (int i = left; i >= right; i--) {
                if (i%2==0){
                    result.add(i);
                }
            }
        }
        return  result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int item : array) {
            if (item%2 == 0 ){
                result.add(item);
            }
        }
        return  result;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result = new ArrayList<>();
        for (int itemFirst : firstArray) {
            for (int itemSecond : secondArray) {
                if (itemSecond==(itemFirst)){
                    result.add(itemFirst);
                }

            }
        }
        return  result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result = new ArrayList<>();
        for (Integer itemFirst : firstArray) {
            result.add(itemFirst);
        }
        for (Integer itemSecond : secondArray) {
            if (!result.contains(itemSecond)){
                result.add(itemSecond);
            }
        }

        return  result;
    }}
