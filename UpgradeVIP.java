
import java.util.Scanner;

public class upgradeVIP extends Register {
    
 private String myname, myusername,input, mypassword;
 private Boolean VIPStatus;
    
 static Register myregister = new Register();
 static Payment myPayment=new Payment();
  /* έλεγχος για τα προσωπικά στοιχεία, όσο τα στοιχεία δεν επαληθεύονται η do-while θα τα ζητάει από το χρήστη να τα ξαναβάλει.*/
   do
   {
    System.out.println("fill in your details");
    
    System.out.println("fill in your name:");
    Scanner input=new Scanner(System.in);
    String myname=input.next();
    
    System.out.println("fill in your Username:");
    Scanner input=new Scanner(System.in);
    String myusername=input.next();
    
    System.out.println("fill in your Password:");
    Scanner input=new Scanner(System.in);
    String mypassword=input.next();
    
}while (mypassword.equals(register.getPassword()) && (myname.equals(register.getName()) && (myusername.equals(register.getUserName))
VIPStatus = true;
register.setVIPStatus(VIPStatus);
System.out.println("Upgrate to VIP successful, please continue with the payment.");
Payment mypayment= new Payment();
 
        }
