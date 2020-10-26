package lsy.practice.demo02;

public class StudentUse {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(10);
        System.out.println(stu.getAge());
        stu.setName("刘思远");
        System.out.println(stu.getName());
        stu.setHeight(65.89);
        System.out.println(stu.getHeight());

        System.out.println("============================");

        Student stu1 = new Student();
        stu1.setHeight(90.00);
        stu1.setName("林蕊");
        stu1.setAge(200);

        System.out.println(stu1);
        System.out.println(stu1.getHeight());
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
    }
}
