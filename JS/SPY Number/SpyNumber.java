import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();

        int sum = 0, product = 1;

        while (num > 0 ){
            num = num % 10;
            sum += num;
            product *= num;
            num = num / 10;
        }

        if (sum == product) {
            System.out.println("Spy");
        }else {
            System.out.println("Not a spy");
        }

    }
}