import java.util.*;

public class Gpa1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // Fill your code here
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        sum += Math.pow(j, 2);
      }
    }
    System.out.println(sum);
  }
}
