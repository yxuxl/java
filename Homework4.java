import java.util.Scanner;

public class Homework4 {

    static int gcdRecursive(int m, int n) {
        if (n == 0)
            return m;
        else
            return gcdRecursive(n, m % n);
    }

    static int gcdIterative(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int resultRecursive = gcdRecursive(m, n);
        System.out.println("두 수의 최대공약수는 " + resultRecursive + "입니다.(재귀호출)");

        int resultIterative = gcdIterative(m, n);
        System.out.println("두 수의 최대공약수는 " + resultIterative + "입니다.(반복문)");

        sc.close();
    }
}

