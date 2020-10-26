package lsy.basic.demo01;

public class Demo03ArrayUse {
    public static void main(String[] args) {
        int [] arrayA = new int [100];
        for (int i = 0; i < 5; i++) {
            arrayA[i] = i;
        }
        for (int i = 0; i < 56; i++) {
            System.out.println(arrayA[i]);
        }
    }
}
