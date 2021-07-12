import java.util.*;

//https://www.geeksforgeeks.org/last-digit-of-sum-of-numbers-in-the-given-range-in-the-fibonacci-series/

/**
 * Task. Given an integer 𝑛, find the last digit of the sum 𝐹0 +𝐹1 +···+𝐹𝑛.
 * Input Format. The input consists of a single integer 𝑛.
 * Constraints. 0 ≤ 𝑛 ≤ 10^14.
 * Output Format. Output the last digit of 𝐹0 + 𝐹1 + · · · + 𝐹𝑛.
 */
public class FibonacciSumLastDigit {
  private static long getFibonacciSumNaive(long n) {
    if (n <= 1)
      return n;
//
//    long previous = 0;
//    long current  = 1;
//    long sum      = 1;
//
//    for (long i = 0; i < n - 1; ++i) {
//      long tmp_previous = previous;
//      previous = current;
//      current = tmp_previous + current;
//      sum += current;
//    }
//
//    return sum % 10;
    int f0 = 0;
    int f1 = 1;
    // Pisano period for % 10 is 60
    int rem = (int) (n % 60);
    // Checking the remainder
    if(rem == 0)
      return 0;
    // The loop will range from 2 to two terms after the remainder
    for(int i = 2; i < rem + 3; i++) {
      int f = (f0 + f1) % 60;
      f0 = f1;
      f1 = f;
    }
    int s = f1 - 1;
    return s;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    long s = getFibonacciSumNaive(n);
    System.out.println(s % 10);
  }
}
