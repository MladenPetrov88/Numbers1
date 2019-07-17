import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int dig3 = num % 10;
        int dig2 = num / 10 % 10;
        int dig1 = num / 100;

        for (int i = 1; i <= (dig1 + dig2); i++) {
            for (int j = 1; j <= (dig1 + dig3); j++) {
                if (num % 5 == 0) {
                    num -= dig1;
                } else if (num % 3 == 0) {
                    num -= dig2;
                }  else {
                    num += dig3;
                }
                System.out.printf("%d ",num);
            }
            System.out.println();
        }
    }
}