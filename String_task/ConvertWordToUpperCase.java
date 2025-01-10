package String_task;

public class ConvertWordToUpperCase {
    public static void main(String[] args) {
        String s = "kashyap Cognizant";
        String wordToConvert = "kashyap";
        String convertedWord = wordToConvert.toUpperCase();

        s = s.replace(wordToConvert, convertedWord);
        System.out.println(s);
    }
}

