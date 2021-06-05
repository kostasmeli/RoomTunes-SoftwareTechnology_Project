import java.util.Scanner;
public class UserData extends Launcher {

    static Register register = new Register();

    public UserData() {
        //edw na pairnei apo tin database

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ta stoixeia sas einai ta eksis:");
            System.out.println("Onoma:" + register.getName());
            System.out.println("Ta stoixeia sas einai ta eksis:");
            System.out.println("Username:" + register.getUserName());
            System.out.println("Ta stoixeia sas einai ta eksis:");
            System.out.println("Password:" + register.getPassword());
            System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password, alliws an thelete na vgeite grapste exit ");
            String pedio = sc.nextLine();
            while (!pedio.equals("exit") && !pedio.equals("EXIT")) {
                if (pedio.equals("onoma")) {
                    System.out.println("Lipoumaste, auto to pedio den mporei na allaksei");
                    System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password, alliws an thelete na vgeite grapste exit ");
                }
                if (pedio.equals("email")) {
                    System.out.println("Dwste neo email");
                    String EMail = sc.nextLine();
                    register.setEMail(EMail);
                    System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password, alliws an thelete na vgeite grapste exit ");
                }
                if (pedio.equals("password")) {
                    System.out.println("Dwste neo password");
                    String Password = sc.nextLine();
                    register.setPassword(Password);
                    System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password, alliws an thelete na vgeite grapste exit ");
                }
                pedio = sc.nextLine();
            }
        }
    }
}