package Oct.task16102024;
import java.util.Scanner;
public class Task_16102024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter Your Name : ");
        String Name = sc.next();
        System.out.println("Please mention your Age :");
        int Age = Integer.parseInt(sc.next());
        System.out.println("What is your current Salary :");
        double salary = Double.parseDouble(sc.next());

        System.out.println(Name);
        System.out.println(Age);
    }
}