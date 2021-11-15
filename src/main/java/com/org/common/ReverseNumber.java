package com.org.common;

public class ReverseNumber {

    public static void main(String args[]){
        System.out.println(new ReverseNumber().reverse(-18));
    }

    public int reverse(int x) {
        if (x == Integer.MIN_VALUE){
            // will overflow
            return 0;
        }
        else{
            int flag = 1;
            if (x < 0){
                flag = -1;
                x = -x;
                System.out.println(x);
            }
            int result = 0;
            while(x > 0){
                int digit = x % 10;
                int newresult = result * 10 + digit;
                if (result != (newresult - digit) / 10){
                    result = 0;
                    break;
                }
                result = newresult;
                x = x / 10;
            }
            result = result * flag;
            return result;
        }//else

    }//public int
}
