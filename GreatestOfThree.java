import java.util.Scanner;
public class GreatestOfThree{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        int num_1 =sc.nextInt();

        System.out.println("enter Second number :");
        int num_2 =sc.nextInt();

        System.out.println("enter third number :");
        int num_3 =sc.nextInt();

        if(num_1 > num_2 && num_1 > num_3){
            System.out.println("greatest number is :" +num_1);

        }else if(num_2 > num_1 && num_2 > num_3){
            System.out.println("greatest number is :" +num_2);
        }else{
            System.out.println("greatest number is :" +num_3);
        }
    }
}