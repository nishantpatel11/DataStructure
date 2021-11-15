package com.org.common;

import java.util.ArrayList;
import java.util.List;

public class PermutationExample {

    public static void main(String args[]){

    }

    public static List<List<Integer>> permutate(int nums[]){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> ds = new ArrayList<Integer>();
        boolean [] freq = new boolean[nums.length];
        permutate(nums,ans,ds,freq);
        return ans;
    }

    private static void permutate(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] freq) {
        if(ds.size() == nums.length){
            ans.add(ds);
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                permutate(nums,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}
