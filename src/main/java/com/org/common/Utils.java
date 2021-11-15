package com.org.common;

import java.util.ArrayDeque;
import java.util.Deque;

public class Utils {

    void permutation(String str, String ans){
        if(str.isEmpty())
            System.out.println(ans);

        for(int i=0;i<str.length();i++)
            permutation(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i));
    }

    Deque  de = new ArrayDeque();

    void display(){}
}
