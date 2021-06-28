package at.jakob.musicbox.gui;

import java.util.List;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

import at.jakob.musicbox.Box;
import at.jakob.musicbox.Record;
import at.jakob.musicbox.gui.exceptions.MagazineFullException;

public class ConsoleGUI implements GUI {
    private Box box;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {
        System.out.println("Willkommen");
        while (true) {
            System.out.println("1 List Songs");
            System.out.println("2 Add Record Song");
            int selection = scanner.nextInt();
            scanner.nextLine();
            switch (selection) {
                case 1:
                    List<Record> records = this.box.getMagazine().getRecords();
                    for (Record record : records) {
                        System.out.println(record);
                    }
                    break;
                case 2 :
                    System.out.println("Enter REcord name");
                    String name = scanner.nextLine();
                    try {
                        box.getMagazine().addRecord(new Record(name,1,null));
                    } catch (MagazineFullException e) {
                       System.out.println("Housten we have a problem:" + e.getLocalizedMessage());
                    }
                    break;

                default:
                    break;
            }

        }

    }

    @Override
    public void setBox(Box box) {
        this.box = box;

    }

}
