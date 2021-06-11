import java.util.Scanner;

public class UpgradeVIP extends Launcher{
    private String Name;
    private String UserName;
    private String Password;
    private String EMail;
    private Boolean VIPStatus;
    private String Package;

    public UpgradeVIP() {
        setPackage(getPackage());
        setVIPStatus(getVIPStatus());
    }

    /* έλεγχος για τα προσωπικά στοιχεία, όσο τα στοιχεία δεν επαληθεύονται η do-while θα τα ζητάει από το χρήστη να τα ξαναβάλει.*/
    public Boolean UpgradeVIPForm() {
        Payment payment = new Payment();
        Registration registration = new Registration();

        Scanner input = new Scanner(System.in);
        System.out.println("Fill in your details");

        System.out.println("Fill in your Name:");
        String myname = input.nextLine();

        System.out.println("Fill in your Username:");
        String myusername = input.nextLine();

        System.out.println("Fill in your Password:");
        String mypassword = input.nextLine();
        System.out.println("Are you sure you want to become a VIP? Type yes if you are or anything else if not.");
        String ans = input.nextLine();
        if (!ans.equals("YES") && !ans.equals("yes")) {
            setVIPStatus(false);
            return false;
        }
        while (!ans.equals("YES") || !ans.equals("yes")) {
            if ("password".equals(mypassword) && "user".equals(myname) && "user1".equals(myusername)) {
                System.out.println("Input Data match registered Data!");
                break;
            }   else {
                System.out.println("Input Data don't match registered Data. Try again.");

                System.out.println("Are you sure you still want to become a VIP? Type yes if you are or anything else if not.");
                ans = input.nextLine();
                if(!ans.equals("YES") || !ans.equals("yes")) {
                    setVIPStatus(false);
                    return false;
                }
                System.out.println("Fill in your Name:");
                myname = input.nextLine();

                System.out.println("Fill in your Username:");
                myusername = input.nextLine();

                System.out.println("Fill in your Password:");
                mypassword = input.nextLine();
            }
        }
        System.out.println("Choose VIP Package");
        System.out.println("1. 3 months 30 euros");
        System.out.println("2. 6 months 50 euros");
        System.out.println("3. 12 months 80 euros");
        System.out.println("Type exit to leave without upgrading to VIP");
        String Package = "0";
        while (input.hasNext()) {
            Package = input.nextLine();
            setPackage(Package);
            if (Package.equals("1"))
                break;
            if (Package.equals("2"))
                break;
            if (Package.equals("3"))
                break;
            if (Package.equals("exit") || Package.equals("EXIT")) {
                setVIPStatus(false);
                return false;
            }
        }
        if (Package.equals("1")) {
            payment.SetPayment(30.0);
            System.out.println("The Total Amount is " + payment.GetPayment() + " euros");
            System.out.println("Choose Payment Method");
            System.out.println("A or a for Cash");
            System.out.println("B or b for Card");
        } else if (Package.equals("2")) {
            payment.SetPayment(50.0);
            System.out.println("The Total Amount is " + payment.GetPayment() + " euros");
            System.out.println("Choose Payment Method");
            System.out.println("A or a for Cash");
            System.out.println("B or b for Card");
        } else if (Package.equals("3")) {
            payment.SetPayment(80.0);
            System.out.println("The Total Amount is " + payment.GetPayment() + " euros");
            System.out.println("Choose Payment Method");
            System.out.println("A or a for Cash");
            System.out.println("B or b for Card");
        } else if (Package.equals("exit") || Package.equals("EXIT")) {
            setVIPStatus(false);
            System.out.println("Upgrade to VIP failed");
            return false;
        } else {
            System.out.println("Choose 1, 2 or 3. If you want to leave without upgrading to VIP type exit");
        }

        while (input.hasNext()) {
            if (Package.equals("exit") || Package.equals("EXIT")) {
                break;
            }
            String Method = input.nextLine();
            payment.SetPayMethod(Method);
            if (Method.equals("a") || Method.equals("A")) {
                System.out.println("You chose Cash");
                System.out.println("Upgrade Successful");
                System.out.println("We will accept your payment on your next visit!");
                setVIPStatus(true);
                return true;
            } else if (Method.equals("b") || Method.equals("B")) {
                System.out.println("You chose Card");
                break;
            } else {
                System.out.println("Try again. Choose A or a for Cash and B or b for Card");
            }
        }
        if (payment.GetPayMethod().equals("b") || payment.GetPayMethod().equals("B")) {
            System.out.println("Please insert your Card Info");
            System.out.println("Please insert the Card Number");
            String CardNumbers = input.nextLine();
            System.out.println("Please insert your name as it appears on your card");
            String CardName = input.nextLine();
            System.out.println("Please insert your Card Expiration Date");
            String CardDate = input.nextLine();
            System.out.println("Please insert the 3 digit CVV number from the rear of your card");
            String CVV = input.nextLine();
            payment.SetCardInfo(CardNumbers, CardName, CardDate, CVV);
            setVIPStatus(true);
            System.out.println("Upgrade to VIP successful.");
            return true;
        }
        return false;
    }
    public String getName() {
        return Name;
    }
    public String getUserName() {
        return UserName;
    }
    public String getPassword() {
        return Password;
    }
    public String getEMail() {
        return EMail;
    }
    public Boolean getVIPStatus() {
        return VIPStatus;
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
