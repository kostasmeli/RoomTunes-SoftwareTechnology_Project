import java.util.Scanner;

public class UserLogin extends Launcher {
    private String Name;
    private String UserName;
    private String Password;
    private String EMail;
    private Boolean VIPStatus;
    private String Package;

    public UserLogin() {
    }

    public Boolean UserLoginForm() {
        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter UserName => ");
        String UserName = scanner.nextLine();

        System.out.print("Enter Password => ");
        String Password = scanner.nextLine();
        if ("user1".equals(UserName) && "password".equals(Password)) {
            System.out.println("User successfully logged-in");
            registration.setName("user");
            registration.setEMail("user@ceid.upatras.gr");
            registration.setVIPStatus(true);
            registration.setPassword("password");
            registration.setUserName("user1");
            registration.setPackage("3");
            return true;
        } else {
            System.out.println("Invalid UserName or Password ");
            return false;
        }
    }
}