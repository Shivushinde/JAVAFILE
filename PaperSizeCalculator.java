public class PaperSizeCalculator {
    public static void main(String[] args) {
        int N = 3; // Replace with the desired Nth paper size

        double lengthA0 = 1189;
        double breadthA0 = 841;

        double[] result = calculatePaperSize(N, lengthA0, breadthA0);

        System.out.println("Length of A" + N + " paper: " + result[0]);
        System.out.println("Breadth of A" + N + " paper: " + result[1]);
    }

    public static double[] calculatePaperSize(int N, double lengthA0, double breadthA0) {
        double lengthN = lengthA0 / Math.pow(2, N / 2.0);
        double breadthN = breadthA0 / Math.pow(2, N / 2.0);

        return new double[]{lengthN, breadthN};
    }
}
