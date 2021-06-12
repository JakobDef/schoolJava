package at.jakob.musicbox;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Player player = new Player();
        Magazine magazine = new Magazine();

        List<Title> noel = new ArrayList<>();
        noel.add(new Title("Noel1", 69));
        noel.add(new Title("Noel2", 420));
        noel.add(new Title("Noel3", 1100));
        noel.add(new Title("Noel4", 300));
        noel.add(new Title("Noel5", 271));
        noel.add(new Title("Noel6", 241));

        Record recNoel = new Record("Noel Hermann", 1, noel);

        List<Title> maurice = new ArrayList<>();
        maurice.add(new Title("maurice's Blues", 9));
        Record recMaurice = new Record("Maurice Stinks", 2, maurice);

        magazine.addRecord(recNoel);
        magazine.addRecord(recMaurice);

        System.out.println(magazine.getSumOfMusic());

        magazine.removeRecord(recNoel);

        System.out.println(magazine.getSumOfMusic());

        System.out.println(magazine.searchRecord("Maurice Stinks").getLength());

        Box box = new Box(player, magazine);
        box.loadRecord(recNoel);
        box.loadRecord(recMaurice);
        box.play(2);
        box.play(0);
    }
}
