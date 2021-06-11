import java.util.Scanner;

public class Reservation extends Launcher{

public Reservation() {

        double poso;
        Scanner sc = new Scanner(System.in);
        Room room = new Room();
        int a = room.RoomNum();
        System.out.println("Anaferete tin imerominia kratisis se morfi 060621");
        String imerominia = sc.nextLine();

        System.out.println("Anaferete tin ora kratisis se morfi 1900 (gia 7 to apogeuma p.x.)");
        String ora = sc.nextLine();

        //room.ChooseRoom() na epistrefei to domatio

        System.out.println("H timi gia auto to domatio einai " + room.payment.GetPayment());
        System.out.println("Thelete kai Custom Playlist? Apantiste me nai i oxi");
        String custom = sc.nextLine();

        if (custom.equals("nai") || custom.equals("NAI")) {
        //check from Registration an einai VIP i apo Upgrade??
            //if den einai vip
            poso = room.payment.GetPayment() + 2;
            System.out.println("To teliko poso einai " + poso);
        }
        else {
            poso = room.payment.GetPayment();
     }
    System.out.println("To teliko poso einai " + poso);
    System.out.println("Choose Payment Method");
    System.out.println("A or a for Cash");
    System.out.println("B or b for Card");
    Scanner scanner = new Scanner(System.in);
    String Method = scanner.nextLine();
    room.payment.SetPayMethod(Method);
    while(Method.equals("A") || Method.equals("a") || Method.equals("B") || Method.equals("b")) {
        if (Method.equals("a") || Method.equals("A")) {
            System.out.println("You chose Cash");
            System.out.println("Reservation Successful");
            System.out.println("We will accept your payment on your visit!");
            break;
        } else if (Method.equals("b") || Method.equals("B")) {
            System.out.println("You chose Card");
            break;
        } else {
            System.out.println("Try again. Choose A or a for Cash and B or b for Card");
        }
    }
        //insert the cart's details for the payment
    if (room.payment.GetPayMethod().equals("b") || room.payment.GetPayMethod().equals("B")) {
        System.out.println("Please insert your Card Info");
        System.out.println("Please insert the Card Number");
        String CardNumbers = scanner.nextLine();
        System.out.println("Please insert your name as it appears on your card");
        String CardName = scanner.nextLine();
        System.out.println("Please insert your Card Expiration Date");
        String CardDate = scanner.nextLine();
        System.out.println("Please insert the 3 digit CVV number from the rear of your card");
        String CVV = scanner.nextLine();
        room.payment.SetCardInfo(CardNumbers, CardName, CardDate, CVV);
        System.out.println("Reservation Successful");
    }
    }
}
