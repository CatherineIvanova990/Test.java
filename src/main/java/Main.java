import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String calc(String input) throws Exception {
        Pattern pattern = Pattern.compile("\\s*([1-9]|10)\\s*([-+/*])\\s*([1-9]|10)\\s*");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            int firstNumb = Integer.parseInt(matcher.group(1));
            int secondNumb = Integer.parseInt(matcher.group(3));
            String symbol = matcher.group(2);
            switch (symbol) {
                case ("-"):
                    return Integer.toString(firstNumb - secondNumb);
                case ("+"):
                    return Integer.toString(firstNumb + secondNumb);
                case ("/"):
                    return Integer.toString(firstNumb / secondNumb);
                case ("*"):
                    return Integer.toString(firstNumb * secondNumb);
            }
        } else {
            throw new Exception("Выражение не соответствует условию");
        }
        return null;
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();
        System.out.println("Output:");
        System.out.println(calc(input));


    }
}
