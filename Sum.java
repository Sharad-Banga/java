import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int a = sc.nextInt();

        System.out.println("Enter second number :");
        int b = sc.nextInt();

        sum(a,b);
    }

    public static void sum(int a, int b){
        int c = a+b;
        System.out.println("Sum is :"+c);
    }
}
