import java.util.Scanner;

public class Room{

    //stin ousia auti i klasi kaleitai apo ti Reservation kai exei ta dwmatia

    static Payment payment = new Payment();
    //epistrefei episis kai tin timi tou kathe dwmatiou


    public int RoomNum() {
        int[] numRoom;
        int i = 0;

        // allocating memory for 5 integers.
        numRoom = new int[4];

        // initialize the first elements of the array
        numRoom[0] = 1;

        // initialize the second elements of the array
        numRoom[1] = 2;

        //kai ta ypoloipa
        numRoom[2] = 3;
        numRoom[3] = 4;

        for (i = 0; i < numRoom.length; i++)
            System.out.println("Domatio noumero " + " : " + numRoom[i]);

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Dialekste ena apo ta domatia mas");
        int num = sc1.nextInt();
        //zitame apo to xristi na dialeksi to dwmatio pou thelei

        while(num!=1 || num!=3) {
            if (num == 1) {
                System.out.println("Epileksate to Dwmatio 1");
                payment.SetPayment(50.0);
                return num;
            } else if (num == 2) {
                System.out.println("Lipoumste, to domatio 2 den einai diathesimo");
                System.out.println("Dwste allo dwmatio");
                num = sc1.nextInt();
            } else if (num == 3) {
                System.out.println("Epileksate to Dwmatio 3");
                payment.SetPayment(80.0);
                return num;
            } else if (num == 4) {
                System.out.println("Lipoumste, to domatio 4 den einai diathesimo");
                System.out.println("Dwste allo dwmatio");
                num = sc1.nextInt();
            } else if (num != 1 && num != 2 && num != 3 && num != 4) {
                System.out.println("O arithmos pou dosate den einai egkiros");
                System.out.println("Dialekste ena apo ta domatia mas");
                num = sc1.nextInt();
            }
        }
        System.out.println("Dialeksate to Dwmatio " + num);
        return num;
    }
}