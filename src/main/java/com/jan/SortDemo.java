package com.jan;

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        int[] arrays = {9,0,6,1,8,3,2,7,5,4};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arrays));
//        int[] arrays = new int[10000];
//        for (int i=0;i<arrays.length;i++) {
//            arrays[i] = (int) (Math.random()*10000);
//        }
        long start = System.currentTimeMillis();
        // 9次
        insertionSort(arrays,arrays.length);
        bubbleSort(arrays,arrays.length);
        long end = System.currentTimeMillis();
//        System.out.println("运行时间："+ (end-start)+" 毫秒");
        // 23次
//        bubbleSort(arrays,arrays.length);
        System.out.println("\n\n"+"排序后：");
        System.out.println(Arrays.toString(arrays));

    }

    /**
     * 插入排序
     * @param 数组
     * @param 数组的长度
     */
    private static void insertionSort(int[] a, int n) {
        if (n <= 1) return;
        int count = 0;
        for (int i=1;i<n;i++) {
            // 第二个
            int value = a[i];
            // j是有序区最后一个元素的下标，
            int j = i - 1;
            // 从右向左比较元素的同时，进行元素复制
            for (;j >=0;j--) {
                if (a[j] > value) {
                    // j+1 未排序区第一个元素
                    a[j+1] = a[j];
                } else {
                    break;
                }
            }

            // 插入的值插入适当位置
            a[j+1] = value;
            System.out.print(Arrays.toString(a));
            System.out.println("数据交换次数："+ ++count);
        }
    }

    /**
     * 冒泡排序
     * @param 数组
     * @param 数组的长度
     */
    private static void bubbleSort(int[] a, int n) {
        if (n<1) return;
//        int count = 0;
        for (int i = 0; i < n; ++i) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; ++j) {
                if (a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                    //++count;

                    System.out.println(Arrays.toString(a));
//                    System.out.println("数据交换次数："+ ++count);
                }
            }
            if (!flag) break;
        }
    }

}
