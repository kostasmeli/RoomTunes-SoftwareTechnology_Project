import java.util.Scanner;

public class Launcher {

    private static Object Registration;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext() && !scanner.equals("exit")) {
            if (scanner.equals("R") || scanner.equals("r")) {
                new Registration();
            }
            if (Registration && scanner.equals("U") || scanner.equals("u)")) {
                new upgradeVIP();
            }//if (scanner.equals("M") || scanner.equals("m")){
            //new Reservation();
                //}
            }
        }
    }
}
