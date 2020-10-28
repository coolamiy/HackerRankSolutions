import java.util.*;

class Solution {

  static void minimumBribes(int[] A) {
    int n = A.length;
    int cnt = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (A[i] != (i + 1)) {
        if (((i - 1) >= 0) && A[i - 1] == (i + 1)) {
          cnt++;
          // swap(A[i], A[i-1]);
          int temp = 0;
          temp = A[i];
          A[i - 1] = A[i];
          A[i] = temp;

        } else if (((i - 2) >= 0) && A[i - 2] == (i + 1)) {
          cnt += 2;
          A[i - 2] = A[i - 1];
          A[i - 1] = A[i];
          A[i] = i + 1;
        } else {
          System.out.println("Too chaotic");
          return;
        }
      }
    }
    System.out.println(cnt);

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int t = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int tItr = 0; tItr < t; tItr++) {
      int n = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      int[] q = new int[n];

      String[] qItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < n; i++) {
        int qItem = Integer.parseInt(qItems[i]);
        q[i] = qItem;
      }

      minimumBribes(q);
    }

    scanner.close();
  }
}
