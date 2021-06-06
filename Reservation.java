import java.util.Scanner;

public class Reservation extends Launcher{
 public class Reservation {

     double poso;
     Scanner sc = new Scanner(System.in);
     Payment payment = new Payment();
     Room room = new Room();


     System.out.println("Anaferete tin imerominia kratisis se morfi 060621");
     imerominia = sc.nextLine();

     System.out.println("Anaferete tin ora kratisis se morfi 1900 (gia 7 to apogeuma p.x.)");
     ora = sc.nextLine();

     //room.ChooseRoom() na epistrefei to domatio

     System.out.println("H timi gia auto to domatio einai " + setPayment());
     System.out.println("Thelete kai Custom Playlist? Apantiste me nai i oxi");
     custom = sc.nextLine();

     if (custom.equals("nai")) {
//check from Registration an einai VIP i apo Upgrade??
         //if den einai vip
         poso = payment.GetPayment() + 2
         System.out.println("To teliko poso einai " + poso);
     }
     //else
System.out.println("To teliko poso einai " + GetPayment());



 }
}