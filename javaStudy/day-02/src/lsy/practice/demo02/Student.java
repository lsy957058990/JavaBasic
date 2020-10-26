package lsy.practice.demo02;

public class Student {
    private int age;
    String name;
    private double height;

    public void setAge(int age){
        if(age>=0 && age<=100){
            this.age = age;
        }

        else{
            System.out.println("年龄数据错误");
        }
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
