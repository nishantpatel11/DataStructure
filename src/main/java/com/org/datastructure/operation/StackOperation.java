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

    public int push(){
        if(list.size() < 0)
            return -1;
        return list.remove(0);
    }
}
