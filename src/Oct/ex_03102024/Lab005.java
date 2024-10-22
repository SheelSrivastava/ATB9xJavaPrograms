package Oct.ex_03102024;
import java.util.*;
public class Lab005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namestay");
            break;
            case 3:
                System.out.println("Bonjour");
                break;
            default :
                System.out.println("exit");

        }
    }
}
