package String_task;

public class ConvertSecondOccurence {
    public static void main(String[] args) {
        String input = "bvrit college";
        int firstIndex = input.indexOf('l');
        int secondIndex = input.indexOf('l', firstIndex + 1);

        if (secondIndex != -1) {
            input = input.substring(0, secondIndex) + 
                    Character.toUpperCase(input.charAt(secondIndex)) + 
                    input.substring(secondIndex + 1);
        }

        System.out.println(input);
    }
}
