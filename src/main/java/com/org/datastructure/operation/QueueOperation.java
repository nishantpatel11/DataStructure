package com.org.datastructure.operation;

import java.util.HashMap;
import java.util.Map;

public class QueueOperation {

    public static void main(String [] args){
        StringBuffer sb = new StringBuffer("");
        StringBuffer sb1 = new StringBuffer("");

        System.out.println(sb1.compareTo(sb));
        Map<String,String> map = new HashMap<>();

        map.put("H1","V1");
        map.put("H2","V2");
        map.put("H3","V3");
        map.put("H4","V4");
        map.put("H5","V5");
        map.put("H6","V6");
        map.put("H7","V7");
        map.put("H8","V8");
        map.put("H9","V9");
        map.put("H10","V10");

        map.putIfAbsent("H19", "Bal");

        String str ="Hello";
        for(int i = 0; i< str.length();i++){
            map.putIfAbsent(str.charAt(i)+"", 1 +"");
            map.computeIfPresent(str.charAt(i)+"",(k,v)->(Integer.parseInt(v)+1)+"" );
        }
        map.entrySet().forEach(System.out::println);
    }
}
