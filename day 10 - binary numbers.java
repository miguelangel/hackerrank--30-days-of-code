import java.util.*;

public class Solution {

    public static void main(String[] args) {
		int maxConsecutives = 0; // Max number of consecutive 1s

        Scanner in =  new Scanner(System.in);
        try {
            int number = in.nextInt();
    		int curConsecutives = 0; // Current number of consecutive 1s
            while (number > 0) {
                // Check if last digit is equals to 1
                if ((number & 1) == 1) {
                    curConsecutives++;
                } else {
                    // Update max consecutive 1s when needed
                    if (curConsecutives > maxConsecutives) {
                        maxConsecutives = curConsecutives;
                    }

                    curConsecutives = 0;
                }

                // Update last digit of 'number' by dividing by two (right shift)
                number = number >> 1;
            }

            // Update max consecutive 1s when needed
            if (curConsecutives > maxConsecutives) {
                maxConsecutives = curConsecutives;
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