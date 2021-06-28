package at.jakob.handy;

import java.util.Scanner;
import java.util.Vector;

public class gui {
    private handy handy;

    public void run(){
        createPhone();
        Scanner scanner = new Scanner(System.in);
        String buffer;
        while(true) {


        System.out.println("Was wollen Sie tun?\n\n1. Foto machen\n2. Anrufen\n3. Freien Speicher anzeigen\n4. Alle Files anzeigen");
        int a = scanner.nextInt();
        buffer = scanner.nextLine();
            switch (a) {
                case 1:
                    handy.takePicture();
                    break;
                case 2:
                    System.out.println("Welche Nummer wollen Sie anrufen?");
                    String tel = scanner.nextLine();
                    handy.makeCall(tel);
                    break;
                case 3:
                    System.out.println(handy.getFreeSpace()+"kb");
                    break;
                case 4:
                    Vector<file> images = handy.getAllImages();
                    for(int i = 0; i < images.size(); i++){
                        images.get(i).getInfo();
                    }
                    break;
            }
        }

    }

    public void createPhone(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welche Farbe soll Ihr Handy haben?");
        String color = scanner.nextLine();

        System.out.println("Welche Telefonnummer wollen Sie haben?");
        String tel = scanner.nextLine();

        System.out.println("Welche Auflösung soll die Kamera haben?\t(1-5)");
        int res = scanner.nextInt();
        String buffer = scanner.nextLine();

        System.out.println("Wie groß soll die Speicherkarte sein? (100-5000)");
        int size = scanner.nextInt();
        buffer = scanner.nextLine();

        this.handy = new handy(color, new sim(tel), new camera(res), new sd(size));
    }


}
