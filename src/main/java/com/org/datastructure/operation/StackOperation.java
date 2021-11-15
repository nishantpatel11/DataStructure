package com.org.datastructure.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackOperation {

    List <Integer> list = new ArrayList<Integer>();

    public int size(){
        return list.size();
    }

    public void push(int data){
        if(list.size() > 0)
            list.add(data);
    }

    public static void main(String args[]){
        String str = new String("Hello");
        String str1 = new String("Hello");
        System.out.println(str == str1);
        System.out.println(str.equals(str1));
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.equals(str));
        StringBuffer sb1 = new StringBuffer("");

        sb1.equals(sb);
//        sb1 == str;
//        str == sb;


    }

    public int push(){
        if(list.size() < 0)
            return -1;
        return list.remove(0);
    }
}
