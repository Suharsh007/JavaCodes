import java.util.*;

class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i != 0; i = i / 10) {
            int rem = i % 10;
            System.out.print(rem + " ");
        }
        sc.close();
    }
}