import java.util.*;

/**
 * Task. Given two integers ๐ and ๐, find their greatest common divisor.
 * Input Format. The two integers ๐, ๐ are given in the same line separated by space.
 * Constraints. 1 โค ๐, ๐ โค 2ยท10^9.
 * Output Format. Output GCD(๐, ๐).
 */
public class GCD {
  private static int gcd_naive(int a, int b) {
//    int current_gcd = 1;
//    for(int d = 2; d <= a && d <= b; ++d) {
//      if (a % d == 0 && b % d == 0) {
//        if (d > current_gcd) {
//          current_gcd = d;
//        }
//      }
//    }
//    return current_gcd;
    if (b == 0) {
      return a;
    }
    return gcd_naive(b, a % b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(gcd_naive(a, b));
  }
}
