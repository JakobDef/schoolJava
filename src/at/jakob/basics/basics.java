package at.jakob.basics;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float balance = 0f;
        boolean done = false;

        while(!done){
            System.out.println("Was wollen Sie tun?\n\n\t1. Einzahlen\n\t2. Abheben\n\t3. Kontostand\n\t4. Ende");
            int selection = scanner.nextInt();

            if(selection == 1){
                System.out.println("Geben Sie den Betrag für die Einzahlung ein:\n");
                float input = scanner.nextFloat();
                balance += input;
                System.out.println("Sie haben " + input + " Euro eingezahlt.");
            }
            else if(selection == 2){
                System.out.println("Geben Sie den Betrag für die Abhebung ein:\n");
                float input = scanner.nextFloat();
                balance -= input;
                System.out.println("Sie haben " + input + " Euro abgehoben.");
            }
            else if(selection == 3){
                System.out.println("Ihr Kontostand beträgt: " + balance + " Euro");
            }
            else if(selection == 4){
                System.out.println("Auf Wiedersehen!");
                break;
            }
            else{
                System.out.println("Versuchen Sie es erneut!");
            }
        }

    }
}
