import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStrings = in.nextInt();

        for (int i = 0; i < numberOfStrings; i++) {
            String currentString = in.next();

            for (int j = 0; j < currentString.length(); j = j+2) {
                System.out.print(currentString.charAt(j));
            }
            System.out.print(" ");

            for (int j = 1; j < currentString.length(); j = j+2) {
                System.out.print(currentString.charAt(j));
            }

            System.out.println();
        }
    }
}