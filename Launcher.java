import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Press R or r to Register");
            System.out.println("Press VIP or vip to Upgrade to VIP");
            System.out.println("Press DATA or data to see or modify user data");
            System.out.println("Press RES or res to make a reservation");
            System.out.println("Press EXIT or exit to leave");
            String scan = scanner.nextLine();
            while (!scan.equals("exit") && !scan.equals("EXIT")) {
                if (scan.equals("R") || scan.equals("r")) {
                    new Registration();
                }
                if (scan.equals("VIP") || scan.equals("vip")) {
                    new upgradeVIP();
                }
                if (scan.equals("DATA") || scan.equals("data")) {
                    new UserData();
                }
                if (scan.equals("RES") || scan.equals("res")) {
                    new Reservation();
                }
                scan = scanner.nextLine();
            }
        }
    }
}

