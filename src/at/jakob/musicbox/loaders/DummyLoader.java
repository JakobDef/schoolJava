package at.jakob.musicbox.loaders;

import java.util.ArrayList;
import java.util.List;

import at.jakob.musicbox.Box;
import at.jakob.musicbox.Magazine;
import at.jakob.musicbox.Player;
import at.jakob.musicbox.Record;
import at.jakob.musicbox.Title;
import at.jakob.musicbox.gui.exceptions.MagazineFullException;

public class DummyLoader implements BoxLoader{

    @Override
    public Box laodBox() {
        Player player = new Player();
        Magazine magazine = new Magazine();

        List<Title> songsOfNoel = new ArrayList<>();
        songsOfNoel.add(new Title("Noel1", 69));
        songsOfNoel.add(new Title("Noel2", 420));
        songsOfNoel.add(new Title("Noel3", 1100));
        songsOfNoel.add(new Title("Noel4", 300));
        songsOfNoel.add(new Title("Noel5", 271));
        songsOfNoel.add(new Title("Noel6", 241));

        Record recNoel = new Record("Noel Hermann", 1, songsOfNoel);

        List<Title> songsOfMaurice = new ArrayList<>();
        songsOfMaurice.add(new Title("maurice's Blues", 9));
        Record recMaurice = new Record("Maurice Stinks", 2, songsOfMaurice);

        
        try {
            magazine.addRecord(recMaurice);
            magazine.addRecord(recNoel);
        } catch (MagazineFullException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        Box box = new Box(player,magazine);
        return box;
    }
    
}
