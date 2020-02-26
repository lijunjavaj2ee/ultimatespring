package com.jan;

import java.util.Arrays;
import java.util.Collections;

public class XiaohuiDemo {
    public static int count = 0;
    public static void main(String[] args) {
        int array[] = {12 , 1 , 3 , 46 , 5 , 0 ,- 3 , 12 , 35 , 16};
//        int array[] = new int[50000];
//        for (int i=0;i<array.length;i++) {
//            array[i] = (int) (Math.random()*array.length);
//        }
//        sort(array);
//        sort2(array);
        long start = System.currentTimeMillis();
        sort3(array);
        long end = System.currentTimeMillis();
        System.out.println(end-start+"毫秒");
//        sort4(array);
//        sort5(array);
//        Arrays.sort(array);
        //Collections.sort();

        System.out.println(Arrays.toString(array));

//        int[] array = new int[100];
//        for(int i=0;i<100;i++) {
//            array[i] = i;
//        }
//        long start = System.currentTimeMillis();
//
//        System.out.println(binarySearch(array,75));
//        System.out.println("查找次数："+count);
//        long end = System.currentTimeMillis();
//        long diff = end -start;
//        System.out.println(diff+"毫秒");
//        System.out.println(array.length);
    }

    private static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length;
        int mid;

        while (start <= end) {
            mid = start+(end-start)/2;
            if (array[mid] == target) {
                count++;
                return mid;
            } else if(array[mid] < target) {
                count++;
                start = mid+1;
            } else {
                count++;
//                if ((mid == 0) || (array[mid-1]!=target)) return mid;
//                else end = mid-1;
                end = mid -1;
            }
        }
        if (start < target && array[start]==target) return start;
        return -1;
    }

    private static void sort5(int[] array) {
        for (int i=0;i<array.length-1;i++) {
            int minIndex = i;
            for (int j=i+1;j<array.length;j++) {
                minIndex = array[minIndex] < array[j] ? minIndex:j;
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }

    private static void sort4(int[] array) {
        for (int i=0; i<array.length;i++) {
            int insertValue = array[i];
            int j = i-1;
            for (;j>=0 && insertValue<array[j];j--) {
                array[j+1] = array[j];
            }
            array[j+1] = insertValue;
        }
    }

    private static void sort3(int[] array) {
        if (array.length<=1) return;
//        int lastExchange = 0;
//        int sortBorder = array.length-1;

        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                    flag = true;
//                    lastExchange = array[i];
                }
            }
//        for (int i=0;i<array.length;i++) {
//            boolean flag = false;
//            for (int j=i+1;j<array.length-1;j++) {
//                if (array[i] > array[j]) {
//                    int tmp = array[j];
//                    array[j] = array[i];
//                    array[i] = tmp;
//                    flag = true;
//                    lastExchange = array[i];
//                }
//            }

//        for (int i = 0; i < array.length; i++) {
//            // 提前退出标志位
//            boolean flag = false;
//            for (int j = 0; j < sortBorder; j++) {
//                if (array[j] > array[j + 1]) {
//                    int tmp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = tmp;
//                    // 此次冒泡有数据交换
//                    flag = true;
//                    // 更新最后一次交换的位置
//                    lastExchange = j;
//                }
//            }
//            sortBorder = lastExchange;
            if (!flag) break;
        }


    }

        private static void sort2(int[] array) {
            for (int i=1; i<array.length;i++) {
                int insertValue = array[i];
                int j = i-1;
                for (;j>=0 && insertValue<array[j];j--) {
                    array[j+1] = array[j];
                }
                array[j+1] = insertValue;
            }
        }

        private static void sort(int[] array) {
            for (int i=1;i<array.length;i++) {
                int insertValue = array[i];
                int j = i-1;
                for (;j>=0 && insertValue<array[j];j--) {
                    array[j+1] = array[j];
                }
                array[j+1] = insertValue;
            }
        }
    }

