import java.util.*;

/**
 * find the last digit of 𝑛-th Fibonacci number
 */
public class FibonacciLastDigit {
  private static int getFibonacciLastDigitNaive(int n) {
    if (n <= 1)
      return n;
    int previous = 0;
    int current  = 1;
    int tempt;
    // keep the track of the last digit, other digits don't matter.
    for (int i = 0; i < n - 1; ++i) {
      tempt = (previous + current) % 10;
      previous = current;
      current = tempt;
    }
    return current;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int c = getFibonacciLastDigitNaive(n);
    System.out.println(c);
  }
}
