package String_task;

public class WordCount {
    public static void main(String[] args) {
        String input = "Enter your string here";
        int wordCount = input.split("\\s+").length;
        System.out.println("Number of words: " + wordCount);
    }
}
