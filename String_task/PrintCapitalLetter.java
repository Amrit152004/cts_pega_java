package String_task;

public class PrintCapitalLetter {
    public static void main(String[] args) {
        String input = "Your String Here";
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.print(c);
            }
        }
    }
}
