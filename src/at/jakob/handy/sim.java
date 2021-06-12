package at.jakob.handy;

import java.nio.charset.Charset;
import java.util.Random;

public class sim {
    private String id;
    private String tel;

    public sim(String tel){
        byte[] array = new byte[10];
        new Random().nextBytes(array);
        String id = new String(array, Charset.forName("UTF-8"));

        this.id = id;
        this. tel = tel;
    }

    public void doCall(String tel){
        System.out.println("Calling " + tel + "...\n\n\n\n\n\n\nNo response :(");
    }


}
