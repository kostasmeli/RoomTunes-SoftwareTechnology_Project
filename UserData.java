//stin ousia auti i klasi emfanizei sto xristi ta stoixeia tou kai tou dinei ti dinatotita na allaksei opoia thelei

import java.util.Scanner;

public class UserData extends Launcher {
    //kaleitai kai auti apo ti launcher
    private String Name;
    private String UserName;
    private String Password;
    private String EMail;
    private Boolean VIPStatus;
    private String Package;

    public UserData() {
        setEMail(getEMail());
        setPassword(getPassword());
    }

    public Boolean UserDataForm() {

        Scanner sc = new Scanner(System.in);

        //emfanizoume ta stoixeia tou xristi
        System.out.println("Ta stoixeia sas einai ta eksis:");
        System.out.println("Onoma:" + getName());

        System.out.println("Ta stoixeia sas einai ta eksis:");
        System.out.println("Username:" + getUserName());

        System.out.println("Ta stoixeia sas einai ta eksis:");
        System.out.println("Password:" + getPassword());


        //epeita zitame poio pedio epithumei na allaksei
        System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password h an thelete na vgeite patiste exit ");

        //apothikeuoume auto pou edwse o xristis
        String pedio = sc.nextLine();


        //ftiaksame mia while wste oso de dinei tin "entoli" exit o xristis na mporei na allaksei ta stoixeia tou
        while (!pedio.equals("exit") && !pedio.equals("EXIT")) {
            //gia to pedio onoma, opws exoyme pei kai sti sxediasi (use case, robustness, sequence) den epitrepoume na allaxthei
            if (pedio.equals("onoma")) {
                System.out.println("Lipoumaste, auto to pedio den mporei na allaksei");
                System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password h an thelete na vgeite patiste exit ");
            }
            //gia to pedio email
            if (pedio.equals("email")) {
                System.out.println("Dwste neo email");
                String EMail = sc.nextLine();
                setEMail(EMail);
                System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password h an thelete na vgeite patiste exit ");
            }
            //gia to pedio password
            if (pedio.equals("password")) {
                System.out.println("Dwste neo password");
                String Password = sc.nextLine();
                setPassword(Password);
                System.out.println("Parakalo grapste poio pedio thelete na allaksete: onoma, email, password h an thelete na vgeite patiste exit ");
            }

            pedio = sc.nextLine();
        }

        return true;
    }

    public String getName() {
        return this.Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getUserName() {
        return this.UserName;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public String getPassword() {
        return this.Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getEMail() {
        return this.EMail;
    }
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }
    public Boolean getVIPStatus() {
        return this.VIPStatus;
    }
    public void setVIPStatus(Boolean VIPStatus) {
        this.VIPStatus = VIPStatus;
    }
    public void setPackage(String Package) {
        this.Package = Package;
    }
    public String getPackage() {
        return Package;
    }
}