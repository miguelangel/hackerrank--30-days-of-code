import java.util.*;

public class Solution {

    public static void main(String[] args) {
		int maxConsecutives = 0; // Max number of consecutive 1s

        Scanner in =  new Scanner(System.in);
        try {
            int number = in.nextInt();
    		int curConsecutives = 0; // Current # of consecutive 1s
            while (number > 0) {
                curConsecutives = ++curConsecutives * (number & 1); // Update # consecutive 1s by checking with last digit
                maxConsecutives = Math.max(curConsecutives, maxConsecutives); // Update result
                number = number >> 1; // Divide by two, updating last digit
            }
        } catch(Exception e) {
            ;
        } finally {
            if (in != null) {
                in.close();
            }
        }

        System.out.println(maxConsecutives);
    }
}