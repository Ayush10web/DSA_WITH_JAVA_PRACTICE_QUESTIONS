package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class stringToHashMap {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         String str = sc.next();
            int n = str.length();
        
        // // Create a HashMap to store character frequencies
         Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // // Iterate over the characters of the string
         for (char c : str.toCharArray()) {
        //     // Update the frequency count in the HashMap
             charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
         }

        //     Print the character frequencies
             for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
        //     // int arr[] = new int[str.length()];
        //     // char character = entry.getKey();
        //     // int frequency = entry.getValue();
        //     //System.out.println(character + ": " + frequency);
             int frequency = entry.getValue();;
        //     // for (int i = 0; i < n; i++) {
        //     //     arr[i] = frequency;
        //     // }
             HashSet<Integer> hs = new HashSet<>();
             hs.add(frequency);
        //     // if(frequency > 1){
        //     //     System.out.println("false");
        //     // }else System.out.println("true");
        //     // System.out.println(Arrays.toString(arr));
        //     // System.out.println(isIsogram(arr, n));
             System.out.println(isIsogram(hs, n));

            String data = "Hello";
            System.out.println(isIsogram(data));
    }

    // public static boolean isIsogram(int []a, int final_sum){
    // int sum = Arrays.stream(a).sum();
    // if(sum == final_sum) return true;
    // return false;
    // }
    public static boolean isIsogram(HashSet<Integer> hSet, int n) {
        if (hSet.size() == n)
            return true;
        return false;
    }

    static boolean isIsogram(String data) {
        // Your code here
        int n = data.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : data.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {

            int frequency = entry.getValue();
            ;

            HashSet<Integer> hs = new HashSet<>();
            hs.add(frequency);

            if (hs.size() == n)
                return true;
        }
        return false;
    }
}
