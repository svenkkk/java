package com.java1995;

/**
 * Created by sven on 2016/4/28.
 */
public class TestStudent {

    public static void main(String[] args){

        Student s=new Student();
        s.name="��λ����";
        s.stuno="250";
        s.sex="��";
        s.age=30;
        System.out.println("������"+ s.name);
        System.out.println("���룺"+ s.stuno);
        System.out.println("�Ա�"+ s.sex);
        System.out.println("���䣺"+ s.age);

        s.study();

    }
}
