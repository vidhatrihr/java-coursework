import java.util.*;

class Ppa2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    evenDisplay(s1);
  }

  // Define evenDisplay(String) method here
  static void evenDisplay(String word) {
    for (int i = 0; i < word.length(); i++) {
      if (i % 2 == 0) {
        System.out.print(word.charAt(i));
      }
    }
  }
}
