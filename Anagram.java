
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase().replace(" ", "");

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().toLowerCase().replace(" ", "");

        if (s1.length() != s2.length()) {
            System.out.println("Not an Anagram");
        } else {
            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a, b)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        }

        sc.close();
    }
}
