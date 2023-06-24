import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        System.out.println("enter value");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1 ; i<=10 ; i++){
            System.out.print(a );
            System.out.print("X");
            System.out.print(i);
            System.out.print("=");
            System.out.println(i*a);
        }
    }
}