package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int i, max;
        Integer[] A = (Integer[]) arrayList.toArray();
        max = A[0];
        for (i = 0; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
        }
        return  max;
    }

    public double getMinimum() {
        int i, min;
        Integer[] A = (Integer[]) arrayList.toArray();
        min = A[0];
        for (i = 0; i < A.length; i++) {
            if(A[i]<min)
                min=A[i];
        }
        return  min;
    }

    public double getAverage() {
        int count=0;
        int sum = 0;
        for (Integer item : arrayList) {
            count++;
            sum+=item;
        }
        return  sum*1.0/count;
    }

    public double getOrderedMedian() {
        double median;
        Integer[] array = (Integer[]) arrayList.toArray();
        Arrays.sort(array);
        if (array.length%2 ==0){
            median = (array[array.length/2] + array[array.length/2-1])/2.0;
        }else{
            median = array[array.length/2-1];
        }
        return median;
    }

    public int getFirstEven() {
        int firtstEven = arrayList.get(0);
        for (Integer item : arrayList) {
            if (item%2 == 0){
                firtstEven =  item;
                break;
            }
        }
        return firtstEven;
    }

    public int getIndexOfFirstEven() {
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0){
                index = i;
                break;
            }

        }
        return index;
    }

    public boolean isEqual(List<Integer> array) {
        String arrayStr = String.valueOf(array);

        String arrayListStr = String.valueOf(arrayList);

        if( arrayStr.equals(arrayListStr) ){

            return true;
        }
        else {
            return false;
        }
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        for (Integer item : arrayList){
            singleLink.addTailPointer(item);
        }
        if (arrayList.size() % 2 == 0){
            double number1 = Double.parseDouble(singleLink.getNode(arrayList.size() / 2).toString());
            double number2 = Double.parseDouble(singleLink.getNode(arrayList.size() / 2 + 1).toString());
            return (number1 + number2) / 2;
        }else{
            return Double.parseDouble(singleLink.getNode(arrayList.size() / 2 + 1 ).toString());
        }
    }

    public int getLastOdd() {
        int firtstEven = arrayList.get(0);
        for (Integer item : arrayList) {
            if (item%2 == 1){
                firtstEven =  item;
            }
        }
        return firtstEven;
    }

    public int getIndexOfLastOdd() {
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 1){
                index = i;
            }

        }
        return index;
    }
}
