package com.thoughtworks.collection;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
//        throw new NotImplementedException();
        int result = 0;
        if (leftBorder > rightBorder) {
            leftBorder = leftBorder ^ rightBorder;
            rightBorder = leftBorder ^ rightBorder;
            leftBorder = leftBorder ^ rightBorder;
        }
        for (int i = leftBorder; i <= rightBorder; i++) {
            result = i % 2 == 0 ? result + i : result;
        }
        return result;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sumOfOdds = 0;
        if (leftBorder > rightBorder) {
            leftBorder = leftBorder ^ rightBorder;
            rightBorder = leftBorder ^ rightBorder;
            leftBorder = leftBorder ^ rightBorder;
        }
        for (int i = leftBorder; i <= rightBorder; i++) {
            sumOfOdds = i % 2 == 1 ? sumOfOdds + i : sumOfOdds;
        }
        return sumOfOdds;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        //求数组中每个元素的3倍加2的和
        int sumTripleAndAddTwo = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sumTripleAndAddTwo += arrayList.get(i) * 3 + 2;
        }
        return sumTripleAndAddTwo;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
//        求数组中奇数元素的3倍加2，偶数元素不变的数组
        List<Integer> tripleOfOddAndAddTwo = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Integer item = arrayList.get(i);
            tripleOfOddAndAddTwo.add(item % 2 == 1 ? item * 3 + 2 : item);

        }
        return tripleOfOddAndAddTwo;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        //求数组中奇数元素的3倍加5的和
        int sumOfProcessedOdds = 0;
        for (Integer item : arrayList) {
            sumOfProcessedOdds += item % 2 == 1 ? item * 3 + 5 : 0;
        }
        return sumOfProcessedOdds;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        // //求数组中所有偶数组成的数组的中位数
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                evenList.add(arrayList.get(i));
            }
        }
        int evenListSize = evenList.size();
        if (evenListSize % 2 == 0) {
            return (evenList.get(evenListSize / 2 - 1) + evenList.get(evenListSize / 2)) / 2;
        } else {
            return evenList.get(evenListSize / 2);
        }
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        //求数组中所有偶数的平均数
        int count = 0;
        int sum = 0;
        for (Integer item : arrayList) {
            sum += item % 2 == 0 ? item : 0;
            count += item % 2 == 0 ? 1 : 0;
        }
        return sum / count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        // 求数组中所有偶数组成的数组是否包含某特定的数specialElment
        List<Integer> evenList = new ArrayList<>();
        for (Integer item : arrayList) {
            if (item % 2 == 0) {
                evenList.add(item);
            }
        }
        return evenList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        //去除数组中所有偶数组成的数组的重复数
        List<Integer> evenList = new ArrayList<>();
        for (Integer item : arrayList) {
            if (item % 2 == 0) {
                evenList.add(item);
            }
        }
        return evenList;

    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (Integer item : arrayList) {
            if (item % 2 == 0) {
                evenList.add(item);
            } else {
                oddList.add(item);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Integer evenItem : evenList) {
            result.add(evenItem);
        }
        for (int i = oddList.size()-1; i>=0; i--) {
            result.add(oddList.get(i));

        }


        return result;


    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        // 数组中前一个元素和后一个元素的和的3倍的数组
        List<Integer> processedList = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            processedList.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);

        }
        return processedList;
    }
}
