
import java.util.Scanner;

public class YeartoDays {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Year : ");
        int n = scanner.nextInt();

        int total = n * 365 ;

        System.out.println(total);


    }
    
}
