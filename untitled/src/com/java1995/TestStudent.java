package com.java1995;

/**
 * Created by sven on 2016/4/28.
 */
public class TestStudent {

    public static void main(String[] args){

        Student s=new Student();
        s.name="各位老总";
        s.stuno="250";
        s.sex="男";
        s.age=30;
        System.out.println("姓名："+ s.name);
        System.out.println("号码："+ s.stuno);
        System.out.println("性别："+ s.sex);
        System.out.println("年龄："+ s.age);

        s.study();

    }
}
