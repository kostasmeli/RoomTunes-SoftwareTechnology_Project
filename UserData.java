package testing;

import java.util.Scanner;
public class UserData {
    public void ChangeData (String args[]) {
        Register register = new Register();
        //edw na pairnei apo tin database

        Scanner sc = new Scanner(System.in);
        System.out.println("Ta stoixeia sas einai ta eksis:");
        System.out.println("Onoma:" + register.getName());
        System.out.println("Ta stoixeia sas einai ta eksis:");
        System.out.println("Username:" + register.getUserName());
        System.out.println("Ta stoixeia sas einai ta eksis:");
        System.out.println("Password:" + register.getPassword());

        System.out.println("Parakalo grapste poio pedio thelete na allaksete: Onoma, email, password ");
        String pedio = sc.nextLine();


        System.out.println("onoma kai epitheto ");

        System.out.println("email ");
        String email = sc.nextLine();
        System.out.println("username");
        String username = sc.nextLine();
        System.out.println("password ");
        String password = sc.nextLine();
        System.out.println("thelete na ginetai VIP? NAI i OXI");
        String answer = sc.nextLine();
        boolean VIP = true;
        // if(answer.contains("NAI")){
        //   boolean VIP (true);
        //}
        //if(answer.contains("OXI"))
        //  boolean VIP (false);
        //}
        System.out.println(fullname);


    }
}
