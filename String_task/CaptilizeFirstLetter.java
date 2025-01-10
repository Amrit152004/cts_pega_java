package String_task;

import java.util.Scanner;

public class CaptilizeFirstLetter {
    public static void main(String[] args) {
        String s = "java standard edition";
        String[] words = s.split(" ");
        StringBuilder capitalizedString = new StringBuilder();

        for (String word : words) {
            capitalizedString.append(Character.toUpperCase(word.charAt(0)))
                             .append(word.substring(1))
                             .append(" ");
        }

        String result = capitalizedString.toString().trim();
        System.out.println("Capitalized String: " + result);
    }
}

