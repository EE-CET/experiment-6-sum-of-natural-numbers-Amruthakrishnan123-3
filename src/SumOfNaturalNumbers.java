import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of first N natural numbers
    public static int NumberSum(int n) {
        // Using the formula (n * (n + 1)) / 2
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read N using Scanner
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            
            // Call NumberSum(N) and store the result
            int result = NumberSum(N);
            
            // Print the result
            System.out.println(result);
        }
        
        sc.close();
    }
}