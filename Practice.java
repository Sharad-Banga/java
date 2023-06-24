import java.util.Scanner;
public class Practice{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        double x = sc.nextDouble();

        System.out.println("Enter second number :");
        double y = sc.nextDouble();
        //to check if both numbers are equal till first three decimal places.

        x = x*1000;
        y = y*1000;


        if(x == y){
            System.out.println("Both numbers are same till first three decimal places ");
        }else{
            System.out.println("Both numbers are not equal tilll first three decimal places ");
        }


    }
}