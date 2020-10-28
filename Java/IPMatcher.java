package Java;

import java.util.Scanner;

/**
 * IPMatcher
 */
public class IPMatcher {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    try (in) {
      while (in.hasNext()) {
        String IP = in.nextLine();
        System.out.println(IP.matches(new MyRegex().pattern));
      }
    }
  }
}

class MyRegex {
  String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}
