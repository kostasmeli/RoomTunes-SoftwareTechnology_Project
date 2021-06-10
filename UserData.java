//stin ousia auti i klasi emfanizei sto xristi ta stoixeia tou kai tou dinei ti dinatotita na allaksei opoia thelei

import java.util.Scanner;
public class UserData extends Launcher {
//kaleitai kai auti apo ti launcher

    static Register register = new Register();

    public UserData() {
        //edw na pairnei apo tin database

        try (Scanner sc = new Scanner(System.in)) {
            //emfanizoume ta stoixeia tou xristi ta opoia pairnei apo ti register
            System.out.println("Ta stoixeia sas einai ta eksis:");
            System.out.println("Onoma:" + register.getName());
            System.out.println("Ta stoixeia sas einai ta eksis:");
            System.out.println("Username:" + register.getUserName());
            System.out.println("Ta stoixeia sas einai ta eksis:");
            System.out.println("Password:" + register.getPassword());
            //oi times edw lamvanontai apo ti register opws fainetai

            //epeita zitame poio pedio epithumei na allaksei
            System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password, alliws an thelete na vgeite grapste exit ");
            //apothikeuoume auto pou edwse o xristis
            String pedio = sc.nextLine();

            //ftiaksame mia while wste oso de dinei tin "entoli" exit o xristis na mporei na allaksei ta stoixeia tou
            while (!pedio.equals("exit") && !pedio.equals("EXIT")) {

                //gia to pedio onoma, opws exoyme pei kai sti sxediasi (use case, robustness, sequence) den epitrepoume na allaxthei
                if (pedio.equals("onoma")) {
                    System.out.println("Lipoumaste, auto to pedio den mporei na allaksei");
                    System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password, alliws an thelete na vgeite grapste exit ");
                }
                //gia to pedio email
                if (pedio.equals("email")) {
                    System.out.println("Dwste neo email");
                    String EMail = sc.nextLine();
                    //theloume to neo email na apothikeutei kai sti register:
                    register.setEMail(EMail);
                    System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password, alliws an thelete na vgeite grapste exit ");
                }
                //gia to pedio password
                if (pedio.equals("password")) {
                    System.out.println("Dwste neo password");
                    String Password = sc.nextLine();
                    //theloume to neo password na apothikeutei kai sti register:
                    register.setPassword(Password);
                    System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password, alliws an thelete na vgeite grapste exit ");
                }
                pedio = sc.nextLine();
            }
        }
    }
}