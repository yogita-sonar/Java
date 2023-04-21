//WAP to take input a  alpha numeric string from user  and print the sum of digits that are available with in that entered string.
import java.util.Scanner;
public class SumOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an alphanumeric string: ");
        String str = in.nextLine();        
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Integer.parseInt(String.valueOf(ch));
            }
        }
        System.out.println("Sum of digits in the string: " + sum);
    }
}
