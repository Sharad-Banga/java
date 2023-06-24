import java.util.Scanner;
public class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        float a = sc.nextInt();

        System.out.println(" Enter second number ");
        float b = sc.nextInt();

        System.out.println("Enter third number :");
        float c = sc.nextInt();

        avg(a,b,c);
    }

    public static void avg(float a, float b,float c){

        float d = (a+b+c)/3;

        System.out.println("Average of the numbers are :"+d);
    }
}
