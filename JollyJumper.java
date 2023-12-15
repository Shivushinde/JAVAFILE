import java.util.Scanner;

public class JollyJumper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the sequence: ");
        int n = scanner.nextInt();

        int[] sequence = new int[n];

        System.out.println("Enter the elements of the sequence:");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        boolean isJolly = isJollyJumper(sequence);

        if (isJolly) {
            System.out.println("The sequence is a Jolly Jumper.");
        } else {
            System.out.println("The sequence is not a Jolly Jumper.");
        }
    }

    public static boolean isJollyJumper(int[] sequence) {
        int n = sequence.length;
        boolean[] differences = new boolean[n];

        for (int i = 1; i < n; i++) {
            int diff = Math.abs(sequence[i] - sequence[i - 1]);

            // Check if the difference is in the valid range
            if (diff < 1 || diff >= n || differences[diff]) {
                return false;
            }

            differences[diff] = true;
        }

        // Check if all differences from 1 to n-1 are present
        for (int i = 1; i < n; i++) {
            if (!differences[i]) {
                return false;
            }
        }

        return true;
    }
}
