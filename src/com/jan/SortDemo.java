package com.jan;

public class SortDemo {
    public static void main(String[] args) {
        int[] arrays = {9,0,6,1,8,3,2,7,5,4};
        insertionSort(arrays,arrays.length);
//        bubbleSort(arrays,arrays.length);
        for (int arr:arrays
             ) {
            System.out.println(arr);
        }

    }

    /**
     *
     * @param a
     * @param n
     */
    private static void insertionSort(int[] a, int n) {
        if (n <= 1) return;
        int count = 0;
        for (int i=1;i<n;++i) {
            int value = a[i];
            int j = i - 1;
            for (;j >=0;--j) {
                if (a[j] > value) {
                    a[j+1] = a[j];
                } else {
                    break;
                }
            }
            a[j+1] = value;
            System.out.println("数据交换次数："+ ++count);
        }
    }

    private static void bubbleSort(int[] a, int n) {
        if (n<1) return;
        int count = 0;
        for (int i = 0; i < n; ++i) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; ++j) {
                if (a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                    //++count;
                    System.out.println("数据交换次数："+ ++count);
                }
            }
            if (!flag) break;
        }
    }

}
