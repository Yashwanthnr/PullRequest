
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();

        System.out.println("sum: "+ a+b);
    }
}
