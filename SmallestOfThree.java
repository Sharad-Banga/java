import java.util.Scanner;
public class SmallestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int a = sc.nextInt();

        System.out.println("Enter second number :");
        int b = sc.nextInt();

        System.out.println("Enter third number :");
        int c = sc.nextInt();

        sot(a,b,c);
    }

    private static void sot(int a, int b, int c) {

        if(a<b && a<c){
            System.out.println("smallest number is :"+a);
        }else if(b<a && b<c){
            System.out.println("smallest number is :"+b);
        }else{
            System.out.println("smallest number is :"+c);
        }
    }
}
