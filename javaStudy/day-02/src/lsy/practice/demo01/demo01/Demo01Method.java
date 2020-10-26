package lsy.practice.demo01.demo01;

public class Demo01Method {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int max =  getMax(array);
        System.out.println(max);
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }

        }
        return max;
    }
}
