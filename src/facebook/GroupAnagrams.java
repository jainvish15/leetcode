package facebook;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String [] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return result;
        }
        Map<String,List<String>> sortedKeys = new HashMap<>();
        for(String word:strs) {
            char [] strArr = word.toCharArray();
            Arrays.sort(strArr);
            String copy = new String(strArr);
            if (!sortedKeys.containsKey(copy)) {
                sortedKeys.put(copy,new ArrayList<>());
            }
            List<String> val = sortedKeys.get(copy);
            val.add(word);
            sortedKeys.put(copy,val);
        }
        for(Map.Entry<String,List<String>> entry:sortedKeys.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
    public static void main(String [] args) {
        String [] arr =   {""};
        List<List<String>> res = groupAnagrams(arr);
        res.forEach(k-> {
            System.out.println(k.toString());
        });
    }

}
