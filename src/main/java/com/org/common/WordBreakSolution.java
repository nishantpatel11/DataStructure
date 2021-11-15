package com.org.common;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class WordBreakSolution {

    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new LinkedList<String>();
        if (s == null || s.length() == 0 || wordDict == null) {
            return result;
        }
        HashMap<Integer, List<Integer>> pointers = new HashMap<Integer, List<Integer>>();
        List<Integer> tmp = new LinkedList<Integer>();
        tmp.add(-1);
        pointers.put(-1, tmp);
        for (int j = 0; j < s.length(); j ++) {
            pointers.put(j, new LinkedList<Integer>());
            for (int i = 0; i <= j; i ++) {
                if (pointers.get(i - 1).size() > 0 && wordDict.contains(s.substring(i, j + 1))) {
                    pointers.get(j).add(i);
                }
            }
        }
        generate(s, result, s.length() - 1, pointers, "");
        return result;
    }
    private void generate(String s, List<String> result, int index, HashMap<Integer, List<Integer>> pointers, String suffix) {
        List<Integer> nexts = pointers.get(index);
        if (pointers.size() == 0) {
            return;
        }
        if (index == -1) {
            result.add(suffix.substring(0, suffix.length() - 1));
            return;
        }
        for (Integer next:nexts) {
            generate(s, result, next - 1, pointers, s.substring(next, index + 1) + " " + suffix);
        }
    }
}
