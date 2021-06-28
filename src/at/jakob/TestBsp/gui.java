package at.jakob.TestBsp;

import java.util.Scanner;
import java.util.Vector;

public class gui {

    private Box box;


    public gui(Box box){
        this.box = box;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Was wollen Sie machen?\n\n1. Ticket lösen\n2. Ticket scannen\n3. Preis anzeigen\n4. Bezahlen\n5. Alle Tickets anzeigen");
            int s = scanner.nextInt();
            String buffer = scanner.nextLine();

            switch(s){
                case 1:
                    System.out.println(box.getTicket().toString());
                    break;
                case 2:
                    System.out.println("Ticket ID:");
                    int id = scanner.nextInt();
                    if(box.insertTicker(id)){
                        System.out.println("Ticket inserted");
                    }
                    else System.out.println("Wrong Id!");
                    break;
                case 3:
                    float price = box.getPrice();
                    if(price == -1.0f){
                        System.out.println("No Ticket inserted");
                    }
                    else System.out.println(price + "€");
                    break;
                case 4:
                    System.out.println("Wie viel wollen Sie einwerfen?");
                    int amount = scanner.nextInt();

                    float ruckgeld = box.pay(amount);
                    if(ruckgeld == -1f){
                        System.out.println("Zu wenig");
                    }
                    else {
                        System.out.println(ruckgeld + "€ Rückgeld");
                    };
                    break;
                case 5:
                    box.displayTickets();
                    break;
                default:
                    break;
            }
        }
    }

}
