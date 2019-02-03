package Pangram;

import java.util.*;

public class MissingLetters {

    private final int A = 97;
    private final int Z = 122;

    public String getMissingLetters(String sentence) {

        Set<Integer> uniqueASCII = new HashSet<>();

        for (char character : sentence.toLowerCase().toCharArray()) {
            if (character >= A && character <= Z) {
                uniqueASCII.add((int) character);

                if (uniqueASCII.size() == 26) {
                    break;
                }
            }
        }

        StringBuilder missingLetters = new StringBuilder();

        for (int i = A; i <= Z; i++) {
            if (!uniqueASCII.contains(i)){
                missingLetters.append((char) i);
        }
    }
        return missingLetters.toString();
    }

    public static void main(String[] args){

        String case1 = "A quick brown fox jumps over the lazy dog";
        String case2 = "A slow yellow fox crawls under the proactive dog";
        String case3 = "Lions, and tigers, and bears, oh my!";
        String case4 = "";

        MissingLetters missingLetters = new MissingLetters();
        System.out.println(case1);
        System.out.println("Returns: " + missingLetters.getMissingLetters(case1));
        System.out.println(case2);
        System.out.println("Returns: " + missingLetters.getMissingLetters(case2));
        System.out.println(case3);
        System.out.println("Returns: " + missingLetters.getMissingLetters(case3));
        System.out.println(case4);
        System.out.println("Returns: " + missingLetters.getMissingLetters(case4));
    }
}
