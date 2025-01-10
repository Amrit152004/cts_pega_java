package String_task;

import java.util.Scanner;

public class EndsWithCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the ending string: ");
        String endingString = scanner.nextLine();

        if (mainString.endsWith(endingString)) {
            System.out.println("The main string ends with the ending string.");
        } else {
            System.out.println("The main string does not end with the ending string.");
        }
    }
}
