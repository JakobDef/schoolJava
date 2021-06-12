package at.jakob.handy;

import java.security.Timestamp;
import java.text.SimpleDateFormat;

public class file {
    private String extension;
    private int size;
    private String name;


    public file(int size) {
        this.extension = ".png";
        this.size = size;
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        this.name = timeStamp;
    }

    public int getSize() {
        return size;
    }

    public void getInfo(){
        System.out.println(name + extension + ": " + size + "kb");
    }

}
