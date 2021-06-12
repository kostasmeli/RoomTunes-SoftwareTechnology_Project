import java.util.Scanner;

public class Room{

    //stin ousia auti i klasi kaleitai apo ti Reservation kai exei ta dwmatia

    static Payment payment = new Payment();
    //epistrefei episis kai tin timi tou kathe dwmatiou


    public int RoomNum() {
        //orizoume ton pinaka kai to i
        int[] numRoom;
        int i = 0;

        // desmeuoume mnimi gia 5 akeraious
        numRoom = new int[4];

        // Arxikopoioume to prwto stoixeio
        numRoom[0] = 1;

        // epeita to deutero
        numRoom[1] = 2;

        //kai ta ypoloipa
        numRoom[2] = 3;
        numRoom[3] = 4;

        System.out.println("To RoomTunes diathetei ta eksis dwmatia");
        //me autin ti for ektipwnoume ola ta dwmatia gia na ta dei o xristis kai na mporei na dialeksei meta
        for (i = 0; i < numRoom.length; i++) {
            System.out.println("Domatio noumero " + " : " + numRoom[i]);
        }
        Scanner sc1 = new Scanner(System.in);

        //zitame apo to xristi na dialeksei to dwmatio pou thelei
        System.out.println("Dialekste ena apo ta domatia mas");
        int num = sc1.nextInt();


        //me mia while elegxoume tin epilogi pou ekane o xristis kai oso dinei domatia pou den einai diathesima, tou zitame na epileksei alla
        while(num!=1 || num!=3) {
            //me tis if ton enimerwnoume gia tin epilogi tou kai gia to poso kostizei to domatio
            if (num == 1) {
                System.out.println("Epileksate to Dwmatio 1");
                System.out.println("To domatio pou epileksate kostizei 50€");
                payment.SetPayment(50.0);
                return num;
            } else if (num == 2) {
                //exoume thesei ws mi diathesimo auto to dwmatio
                System.out.println("Lipoumste, to domatio 2 den einai diathesimo");
                System.out.println("Dwste allo dwmatio");
                num = sc1.nextInt();
            } else if (num == 3) {
                System.out.println("Epileksate to Dwmatio 3");
                System.out.println("To domatio pou epileksate kostizei 80€");
                payment.SetPayment(80.0);
                return num;
            } else if (num == 4) {
                //exoume thesei ws mi diathesimo auto to dwmatio
                System.out.println("Lipoumste, to domatio 4 den einai diathesimo");
                System.out.println("Dwste allo dwmatio");
                num = sc1.nextInt();
            } else if (num != 1 && num != 2 && num != 3 && num != 4) {
                //me autin tin periptwsi elegxoume oti de tha dwsei kapoio akiro arithmo o xristis
                System.out.println("O arithmos pou dosate den einai egkiros");
                System.out.println("Dialekste ena apo ta domatia mas");
                num = sc1.nextInt();
            }
        }
        System.out.println("Dialeksate to Dwmatio " + num);
        return num;
        //epistrefetai to noumero domatiou pou epelekse o xristis alla kai stin payment oi times twn dwmatiwn
    }
}