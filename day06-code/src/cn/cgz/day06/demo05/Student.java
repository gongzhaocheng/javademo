package cn.cgz.day06.demo05;

/**
 * @author chenggongzhao
 * @des 一个标准的类通常有以下四部分
 *
 * 1. 所有的成员变量都用private关键字修饰
 * 2. 为每一对成员变量编写一对Getter、Setter方法
 * 3. 编写一个无参数的构造器
 * 4. 编写一个全参数的构造器
 *
 * 这样标准的类也叫 JavaBean
 * @create 2019-07-07-18:43
 */
public class Student {

    private int age;
    private String name;


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
