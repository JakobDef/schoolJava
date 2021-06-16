package at.jakob.musicbox;

import java.util.*;

import at.jakob.musicbox.gui.ConsoleGUI;
import at.jakob.musicbox.gui.GUI;
import at.jakob.musicbox.loaders.BoxLoader;
import at.jakob.musicbox.loaders.DBLoader;
import at.jakob.musicbox.loaders.DummyLoader;

public class main {
    public static void main(String[] args) {
        BoxLoader loader = new DummyLoader();
        Box box = loader.laodBox();

        GUI gui = new ConsoleGUI();
        gui.setBox(box);
        gui.start();

       
    }
}
