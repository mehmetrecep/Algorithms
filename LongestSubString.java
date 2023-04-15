
package DataStructureX.Algorthims;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }
    public static int lengthOfLongestSubstring(String s){

        int a_point = 0;
        int b_point = 0;
        int maxLength = 0;

        HashSet<Character> characters = new HashSet<>();

        while(b_point < s.length()){
            if(!characters.contains(s.charAt(b_point))){
                characters.add(s.charAt(b_point));
                b_point++;
                maxLength = Math.max(characters.size(),maxLength);
            }else {
                characters.remove(s.charAt(a_point));
                a_point++;

            }
        }
        return maxLength;
    }
}

