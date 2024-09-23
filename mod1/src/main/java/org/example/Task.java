package org.example;

public class Task {
    public static int minNum(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] subArr : arr) {
            for (int j : subArr) {
                min = Math.min(min, j);
            }
        }
        return min;
    }

    public static int getSumNums() {
        int summ = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                summ += i;
            }
        }
        return summ;
    }
}
