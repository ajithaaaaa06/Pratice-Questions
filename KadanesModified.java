public class KadanesModified {

    public static void kadanes(int numbers[]) {

        // Check if all numbers are negative
        boolean allNegative = true;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                allNegative = false;
                break;
            }
        }

        // If all numbers are negative
        if (allNegative) {
            System.out.println("-1");
            return;
        }

        // Kadane's Algorithm
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {

            currSum = currSum + numbers[i];

            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("Maximum sum is: " + maxSum);
    }

    public static void main(String[] args) {

        int numbers[] = {-2, -3, -4, -1, -5};

        kadanes(numbers);
    }
}