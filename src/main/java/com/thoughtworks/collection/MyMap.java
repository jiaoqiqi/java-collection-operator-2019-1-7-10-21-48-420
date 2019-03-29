package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
        "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();
        for (Integer item : array) {
            result.add(item * 3);
        }
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        for (Integer item : array) {
            result.add(letters[item - 1]);
        }
        return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();
        for (Integer item : array) {
            if (item < 26) {
                result.add(letters[item - 1]);
            } else {
                String s = Integer.toString(item, 26);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    int index = Integer.parseInt(s.charAt(i) + "");
                    if (index == 0) {

                        sb.replace(s.length() - 2, s.length(), letters[Integer.parseInt(s.charAt(i - 1) + "") - 2]);
                        sb.append(letters[25]);
                    } else {
                        sb.append(letters[Integer.parseInt(s.charAt(i) + "") - 1]);
                    }
                }
                result.add(sb.toString());
            }

        }
        return result;
    }

    public List<Integer> sortFromBig() {
        Integer[] newArray = (Integer[]) array.toArray();
        for(int i =0;i<newArray.length-1;i++) {
            for(int j=0;j<newArray.length-i-1;j++) {
                if(newArray[j]<newArray[j+1]) {
                    int temp = newArray[j];

                    newArray[j]=newArray[j+1];

                    newArray[j+1]=temp;
                }
            }
        }
        return  Arrays.asList(newArray);
    }

    public List<Integer> sortFromSmall() {
        Integer[] newArray = (Integer[]) array.toArray();
        for(int i =0;i<newArray.length-1;i++) {
            for(int j=0;j<newArray.length-i-1;j++) {
                if(newArray[j]>newArray[j+1]) {
                    int temp = newArray[j];

                    newArray[j]=newArray[j+1];

                    newArray[j+1]=temp;
                }
            }
        }
        return  Arrays.asList(newArray);
    }
}
