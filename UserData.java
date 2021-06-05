import java.util.Scanner;
public class UserData extends Launcher{
    public UserData () {
        Register register = new Register();
        //edw na pairnei apo tin database

        Scanner sc = new Scanner(System.in);
        System.out.println("Ta stoixeia sas einai ta eksis:");
        System.out.println("Onoma:" + register.getName());
        System.out.println("Ta stoixeia sas einai ta eksis:");
        System.out.println("Username:" + register.getUserName());
        System.out.println("Ta stoixeia sas einai ta eksis:");
        System.out.println("Password:" + register.getPassword());

        System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password ");
        String pedio = sc.nextLine();

        while(pedio.equals("onoma")) {
            System.out.println("Lipoumaste, auto to pedio den mporei na allaksei");
            System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password ");
            pedio = sc.nextLine();

            if(pedio.equals("email")) {
                System.out.println("Dwste neo email");
                String EMail = sc.nextLine();
                register.setEMail(EMail);
            }

            if(pedio.equals("password")) {
                System.out.println("Dwste neo password");
                String Password = sc.nextLine();
                register.setPassword(Password);
            }

        }

        if(pedio.equals("email")) {
            System.out.println("Dwste neo email");
            String EMail = sc.nextLine();
            register.setEMail(EMail);
        }

        if(pedio.equals("password")) {
            System.out.println("Dwste neo password");
            String Password = sc.nextLine();
            register.setPassword(Password);
        }

    }
}