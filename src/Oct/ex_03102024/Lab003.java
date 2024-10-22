package Oct.ex_03102024;
import java.util.*;
public class Lab003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        if (a == b){
            System.out.println( "Print a is equal to b");
        } else if (a > b) {
            System.out.println( "Print a is greater than b");

        } else {
            System.out.println("Print a is less than b");
        }
    }
}


