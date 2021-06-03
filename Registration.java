import java.util.Scanner;

public class Registration {

    static Register register = new Register();

    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Name => ");
            String Name = scanner.nextLine();
            register.setName(Name);

            System.out.print("UserName => ");
            String UserName = scanner.nextLine();
            register.setUserName(UserName);

            System.out.print("Password => ");
            String Password = scanner.nextLine();
            register.setPassword(Password);

            System.out.print("E-Mail => ");
            String EMail = scanner.nextLine();
            register.setEMail(EMail);

            System.out.print("VIP True or False => ");
            Boolean VIPStatus = scanner.nextBoolean();
            register.setVIPStatus(VIPStatus);
        }
        System.out.println("Registration Successful");
    }

}
