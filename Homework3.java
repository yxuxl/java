import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 정수를 입력하시겠습니까? ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println(n + "개의 정수를 입력하세요 (공백으로 구분):");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);

        sc.close();
    }
}
