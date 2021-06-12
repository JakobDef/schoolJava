package at.jakob.maus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What color do you want your mouse to be?\n\n");
        String color = scanner.nextLine();

        Mouse mouse = new Mouse(new Deck(color), new Battery());

        while(true){
            System.out.println("What do you want to do?\n\n\t1. Turn power to "+ !mouse.getPowered() + "\n\t2. Left Click\n\t3. Right Click\n\t4. Scroll\n\t5. Change Deck\n\t6. Quit");
            int selection = scanner.nextInt();

            switch (selection){

                case 1:
                    mouse.setPowered(!mouse.getPowered());
                    break;
                case 2:
                    mouse.leftClick();
                    break;
                case 3:
                    mouse.rightClick();
                case 4:
                    System.out.println("How far do you want to scroll?\n\n");
                    mouse.scroll(scanner.nextInt());
                case 5:
                    System.out.println("What color do you want your new deck to be?\n\n");
                    mouse.changeDeck(new Deck(scanner.nextLine()));
                case 6:
                    System.exit(0);
                    break;
            }

        }


    }
}
