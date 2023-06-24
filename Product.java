import java.util.Scanner;
public class Product{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int a = sc.nextInt();

        System.out.println("Enter second number :");
        int b = sc.nextInt();

        multi(a,b);
    }

    public static void multi(int a, int b){
        int c = a*b;
        System.out.println("Sum is :"+c);
    }
}
