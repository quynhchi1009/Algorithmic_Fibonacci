import java.util.Scanner;

/**
 * Task. Given an integer π, find the πth Fibonacci number πΉπ.
 * Input Format. The input consists of a single integer π.
 * Constraints. 0 β€ π β€ 45.
 * Output Format. Output πΉπ.
 */
public class Fibonacci {
  private static long calc_fib(int n) {
//    if (n <= 1)
//      return n;
//    return calc_fib(n - 1) + calc_fib(n - 2);
    //Declare an array to store Fibonacci numbers.
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0
    int i;
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
    for (i = 2; i <= n; i++) {
       /* Add the previous 2 numbers in the series and store it */
      f[i] = f[i-1] + f[i-2];
    }
    return f[n];
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(calc_fib(n));
  }
}
