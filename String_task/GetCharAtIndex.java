package String_task;

import java.util.Scanner;

public class GetCharAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < input.length()) {
            char character = input.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } else {
            System.out.println("Invalid index.");
        }
    }
}

