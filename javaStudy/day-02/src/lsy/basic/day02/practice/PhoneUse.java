package lsy.basic.day02.practice;

public class PhoneUse {
    public static void main(String[] args) {
        Phone numOne = new Phone();

        numOne.band = "Vivo";
        numOne.discount = 0.88;
        numOne.price = 8888;

        numOne.game("王者荣耀") ;
        int a = numOne.sumCal(10,30);
        numOne.sendMassage();
        System.out.println(a);
    }


}
