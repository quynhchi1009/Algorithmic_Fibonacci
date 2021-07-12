import java.util.*;

/**
 * Task. Given two integers 𝑎 and 𝑏, find their least common multiple.
 * Input Format. The two integers 𝑎 and 𝑏 are given in the same line separated by space.
 * Constraints. 1 ≤ 𝑎, 𝑏 ≤ 10^7 .
 * Output Format. Output the least common multiple of 𝑎 and 𝑏.
 */
public class LCM {
  private static long lcm_naive(int a, int b) {
//    for (long l = 1; l <= (long) a * b; ++l)
//      if (l % a == 0 && l % b == 0)
//        return l;
//    return (long) a * b;
    return (long)(a / gcd_naive(a, b)) * b;
  }

  private static long gcd_naive(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd_naive(b, a % b);
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(lcm_naive(a, b));
  }
}
