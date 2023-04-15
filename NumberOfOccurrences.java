package DataStructureX.Algorthims;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        String[] input = {"1", "1","1","1","3","4", "5", "6", "7"," 7", "7", "8", "8"};
        String inpt = "1, 1, 1, 1, 3, 4, 5, 6, 7, 7, 7, 8, 8";
        System.out.println(numberOf(input));
        //System.out.println(Arrays.toString(numberOcc(input)));
        HashMap<String, Integer> numbers = occurrence(inpt);
        for(String num : numbers.keySet()){
            System.out.println(num + " occurs " + numbers.get(num) + " times.");
        }

    }
    public static Map numberOf(String[] input){
        HashMap<String, Integer> map = new HashMap<>();
        int num = 0;
        for(int i = 0; i < input.length;i++){
            for(int j = 0; j < input.length; j++){
                if(input[i]==input[j]){
                    num++;
                }
            map.put(input[i],num);
            }
            num = 0;
        }
        return map;
    }
    public static int[] numberOcc(String[] input){
        int[] number = new int[input.length];
        int num = 0;
        int index = 0;
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input.length; j++){
                if(input[i].equals(input[j])){
                    ++num;
                }
            }
            number[index]=num;
            num = 0;
            index++;
        }
        return number;
    }
    public static HashMap<String, Integer> occurrence(String numbers){
        // Split the input string by space delimiter
        String[] arr = numbers.split(", ");

        // Create a HashMap to store the count of each value
        HashMap<String, Integer> counts = new HashMap<>();

        // Loop through the array and count the occurrences of each value
        for (String num : arr) {
            if (counts.containsKey(num)) {
                counts.put(num, counts.get(num) + 1);
            } else {
                counts.put(num, 1);
            }
        }
        // Return the counts HashMap
        return counts;
    }


}
