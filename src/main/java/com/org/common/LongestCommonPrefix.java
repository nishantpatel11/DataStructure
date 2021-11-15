package com.org.common;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String [] str){

        if(str.length == 0)
            return "";

        String prefix = str[0];
        for(int i =1;i<str.length;i++)
            for(int j=0;j<prefix.length();j++){
                if(j == str[i].length() || prefix.charAt(j) != str[i].charAt(j)){
                    prefix = prefix.substring(0,j);
                    break;
                }
            }
        return prefix;
    }

    public static void main(String args[]){
        System.out.println(longestCommonPrefix(new String[]{"hello","hel","hell,held"}));
    }
}
