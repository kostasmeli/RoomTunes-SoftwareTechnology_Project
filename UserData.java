package testing;

import java.util.Scanner;
public class UserData {
    public void ChangeData (String args[]) {
        DataBase DBObject = new DataBase()
        //edw na pairnei apo tin database
        Scanner sc = new Scanner(System.in);
        System.out.println("onoma kai epitheto ");
        String fullname = sc.nextLine();
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
