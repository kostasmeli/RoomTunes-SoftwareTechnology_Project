import java.util.Scanner;

public class Registration extends Launcher {

    static Register register = new Register();
    static Payment payment = new Payment();

    public Registration() {
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

            if (register.getVIPStatus() == true) {
                System.out.println("Choose VIP Package");
                System.out.println("1. 3 months 30 euros");
                System.out.println("2. 6 months 50 euros");
                System.out.println("3. 12 months 80 euros");
                System.out.println("Type exit to leave without upgrading to VIP");
                String Package = scanner.nextLine();
                register.setPackage(Package);
                while (scanner.hasNext()) {
                    Package = scanner.nextLine();
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
                    System.out.println("Upgrade to VIP failed.");
                } else {
                    System.out.println("Choose 1, 2 or 3. If you want to leave without upgrading to VIP type exit");
                }

                while (scanner.hasNext()) {
                    if (Package.equals("exit") || Package.equals("EXIT")) {
                        break;
                    }
                    String Method = scanner.nextLine();
                    payment.SetPayMethod(Method);
                    if (Method.equals("a") || Method.equals("A")) {
                        System.out.println("You chose Cash");
                        System.out.println("Registration Successful");
                        System.out.println("We will accept your payment on your first visit!");
                        break;
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
                    String CardNumbers = scanner.nextLine();
                    System.out.println("Please insert your name as it appears on your card");
                    String CardName = scanner.nextLine();
                    System.out.println("Please insert your Card Expiration Date");
                    String CardDate = scanner.nextLine();
                    System.out.println("Please insert the 3 digit CVV number from the rear of your card");
                    String CVV = scanner.nextLine();
                    payment.SetCardInfo(CardNumbers, CardName, CardDate, CVV);
                    System.out.println("Registration Successful");
                }
            }
        }
    }
}