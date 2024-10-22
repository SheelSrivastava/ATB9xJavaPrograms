package Oct.ex_03102024;
import java.util.*;
public class ProgramforIFELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double age = sc.nextDouble();
        if (age >= 18) {
            System.out.println("Candidate has car driving Licence permission");
        } else {
            System.out.println( "Candidate has No car driving Licence permission");
        }
    }
}
