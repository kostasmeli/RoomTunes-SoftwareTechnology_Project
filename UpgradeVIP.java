import java.util.Scanner;

public class UpgradeVIP extends Launcher{

    static Register register = new Register();
    static Payment payment = new Payment();

    /* έλεγχος για τα προσωπικά στοιχεία, όσο τα στοιχεία δεν επαληθεύονται η do-while θα τα ζητάει από το χρήστη να τα ξαναβάλει.*/
    public UpgradeVIP() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Fill in your details");

            System.out.println("Fill in your Name:");
            String myname = input.nextLine();

            System.out.println("Fill in your Username:");
            String myusername = input.nextLine();

            System.out.println("Fill in your Password:");
            String mypassword = input.nextLine();
            while (input.hasNext()) {
                if (register.getPassword().equals(mypassword) && register.getName().equals(myname) && register.getUserName().equals(myusername)) {
                    break;
                } else {
                    System.out.println("Input Data don't match registered Data. Try again.");

                    System.out.println("Fill in your Name:");
                    myname = input.nextLine();

                    System.out.println("Fill in your Username:");
                    myusername = input.nextLine();

                    System.out.println("Fill in your Password:");
                    mypassword = input.nextLine();
                }
            }
            /* εμαφανίζει στο χρήστη τις προσφορές */
            System.out.println("Choose VIP Package");
            System.out.println("1. 3 months 30 euros");
            System.out.println("2. 6 months 50 euros");
            System.out.println("3. 12 months 80 euros");
            System.out.println("Type exit to leave without upgrading to VIP");
            String Package = input.nextLine();
            register.setPackage(Package);
            while (input.hasNext()) {
                Package = input.nextLine();
                register.setPackage(Package);
                if (Package.equals("1"))
                    break;
                if (Package.equals("2"))
                    break;
                if (Package.equals("3"))
                    break;
                if (Package.equals("exit") || Package.equals("EXIT"))
                    break;
            }
            /* ανάλογα με το πακέτο προσφαορών που έχει επιλέξει γίνεται η χρέωση και ο χρήστης επιλέγει αν θα πληρώσει με κάρτα ή μετρητά*/
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
                register.setVIPStatus(false);
                System.out.println("Upgrade to VIP failed");
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
                    break;
                } else if (Method.equals("b") || Method.equals("B")) {
                    System.out.println("You chose Card");
                    break;
                } else {
                    System.out.println("Try again. Choose A or a for Cash and B or b for Card");
                }
            }
            /* ζητείται από το χρήστη να δώσει τα στοιχεία της κάρτας του για να προχωρήσει στην πληρωμή*/
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
                register.setVIPStatus(true);
                System.out.println("Upgrade to VIP successful.");
            }
        }
    }
}
