import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {

        System.out.println("Enter valure");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a % 2==0){
            System.out.println("Entered number is Even ");
        }else{
            System.out.println("Entered number is Odd");
        }

    }
        }