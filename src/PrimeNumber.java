/**
 * Created by Andreas on 2018/11/15.
 */
import java.lang.Math;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        input = scanner.nextLine();
        int number = Integer.parseInt(input);
        if (isPrime(number)) {
            System.out.println(number+"是素数。");
        } else {
            System.out.println(number+"不是素数。");
        }

    }

    public static boolean isPrime(int n) {
        if (n<2) { return false; }
        if (n==2||n==3) { return true; }
        if (n%6!=1&&n%6!=5) { return false; }
        double m = Math.floor(Math.sqrt(n));
        for (int i=5;i<=m;i+=6) {
            if (n%(i)==0||n%(i+2)==0) {
                return false;
            }
        }
        return true;
    }
}
