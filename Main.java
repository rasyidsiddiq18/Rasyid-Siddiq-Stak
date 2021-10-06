import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(25);
        String input = "f(x)=(2x+y)-(3+(2x-x)+20)";
        Scanner scn = new Scanner(input);
        System.out.println("Rumus Aljabar : " + input);

        scn.useDelimiter("");

        for (int i = 0; i < input.length(); i++) {
            String karakter = scn.next();
            if (karakter.equals("(")) {
                stack.push("(");
            } else if (karakter.equals(")")) {
                stack.pop();
            }
        }
        if (stack.nol()) {
            System.out.println("Valid");
        } else {
            System.out.println("Tidak Valid");
        }
    }
}
