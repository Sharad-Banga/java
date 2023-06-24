import java.util.Scanner;
import java.util.Scanner;
public class WeekDays{
    public static void main(String[] args) {

        System.out.println("Enter number from 1 to 7 , to print week day .");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch(num){

            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println(" tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("please enter valid value(i.e. from 1 to 7)");
                break;
        }
    }
}