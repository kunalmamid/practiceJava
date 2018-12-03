import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Anagram {

    public static void isAnagram(String s1, String s2){
        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0; i< c1.length ; i++)
            if (c1[i] != c2[i]) System.out.println("Not Anagrams");

            System.out.println("They Are Anagrams");

    }

    public static void isAnagramwithMaps(String s1, String s2) {
        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();

        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        Map<Character, Integer> mp2 = new HashMap<Character, Integer>();

        for (int i = 0; i < c1.length; i++) {
            if (mp.containsKey(c1[i])) {
                mp.put(c1[i], mp.get(c1[i])+ 1);
            } else {
                mp.put(c1[i], 1);
            }
        }

        for (int j = 0; j < c2.length; j++) {
            if (mp2.containsKey(c2[j])) {
                mp2.put(c2[j], mp2.get(c2[j]) + 1);
            } else {
                mp2.put(c2[j], 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        if (mp.equals(mp2)){
            System.out.println("Maps Equal: Anagram");
        } else {
            System.out.println("Not Anagrams:maps not equal");
        }

    }


    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String s1 = scan.nextLine().trim();
        String s2 = scan.nextLine().trim();

        if (s1.length() != s2.length()){
            System.out.println("Strings are not anagram");
        } else {

            isAnagramwithMaps(s1, s2);
        }
    }
}
