package at.jakob.musicbox;

public class Title {
    private String title;
    private int length;

    public Title(String title, int length){
        this.title = title;
        this.length = length;
    }


    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }
}
