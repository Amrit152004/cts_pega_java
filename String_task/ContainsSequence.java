package String_task;

import java.util.Scanner;

public class ContainsSequence {
    public static void main(String[] args) {
        String str = "welcome to carrertuner";
        String sequence = "match";

        if (str.contains(sequence)) {
            System.out.println("The string contains the sequence: " + sequence);
        } else {
            System.out.println("The string does not contain the sequence: " + sequence);
        }
    }
}
