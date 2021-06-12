package at.jakob.handy;

import java.util.Vector;

public class sd {
    private int capacity;
    private int used;
    private Vector<file> images;

    public void saveFile(file pic){
        if(pic.getSize() > (capacity - used)) System.out.println("Nicht genügend Speicherplatz");
        else {
            images.add(pic);
            used += pic.getSize();
            System.out.println("Picture Saved!");
        }
    }

    public int getFreeSpace(){
        return (capacity-used);
    }

}
