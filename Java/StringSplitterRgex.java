import java.util.Arrays;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.replaceAll("[^\\p{Alpha}]+", " ").trim();
        System.out.println(s);
        String[] s1 = s.split(" ");
        int size = (s.isEmpty()) ? 0 : s1.length;
        System.out.println(size);
        Arrays.stream(s1).forEach(System.out::println);
        scan.close();
    }
}
