package lsy.basic.day02;

import java.util.Arrays;

public class Demo02ArrayReverse {

    public static void main(String[] args) {

        int [] arrayA = { 1, 2, 3, 4 };
        int begin = 0, end = arrayA.length-1;
        int t;

        while(end > begin){
            t = arrayA[begin];
            arrayA[begin] = arrayA[end];
            arrayA[end] = t;

            begin++;
            end--;
        }

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
        System.out.println(Arrays.toString(arrayA));
    }
}
