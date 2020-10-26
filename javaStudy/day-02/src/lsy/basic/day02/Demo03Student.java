package lsy.basic.day02;
// import 包名称.类名称;

//  创建 格式
//  类名称 对象名 = new 类名称 ()
//  ClassSimulate stu = new Student();

//  使用成员变量：对象名.成员变量名

public class Demo03Student {
    public static void main(String[] args) {
        ClassSimulate stu = new ClassSimulate();
        stu.eat();

        System.out.println(stu.age);
        System.out.println(stu.name);
    }
}
