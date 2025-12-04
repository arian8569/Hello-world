import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = input.nextLine();

        System.out.print("Enter Your age: ");
        String age = input.nextLine();

        System.out.print("Enter Your nationality: ");
        String nl = input.nextLine();

        System.out.print("Enter Your phone number: ");
        String pn = input.nextLine();

        System.out.print("Enter Your email: ");
        String email = input.nextLine();

        System.out.print("Enter Your address: ");
        String address = input.nextLine();

        System.out.print("your ID is " + name + age + nl + pn + email + address);
        System.out.println(":)");


    }
}
