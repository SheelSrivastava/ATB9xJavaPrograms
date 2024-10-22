package Oct.ex_03102024;
import java.util.*;
public class Lab004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if (button == 1){
            System.out.println("Print Hello");
        }else if (button==2) {
            System.out.println("Print Namaste");
        }else if  (button ==3){
            System.out.println("Print Bonjour");
            }else {
            System.out.println("Print Invalid button");

        }
    }
}
