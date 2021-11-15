package com.org.datastructure.generic;

import java.util.concurrent.CompletableFuture;

public class GenericInterfaceImpl implements GenericInterface{

    @Override
    public Object getMessage(Object o, Object o2, Object o3) {

        CompletableFuture <String> future = CompletableFuture.supplyAsync(() -> "Hello");

        return o.hashCode() + " : " + o2.hashCode() + " : " + o3.hashCode();
    }



    public static void main(String [] args){
        System.out.println(" : "+ new GenericInterfaceImpl().getMessage("H1", "H2","H3"));
    }
}
