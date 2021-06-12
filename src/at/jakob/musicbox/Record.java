package at.jakob.musicbox;

import java.util.List;

public class Record {

    private String name;
    private int id;
    private List<Title> titles;

    public Record(String name, int id, List<Title> titles){
        this.id = id;
        this.name = name;
        this.titles = titles;
    }

    public int getLength(){
        int length = 0;
        for(int i = 0; i < titles.size(); i++){
            length += titles.get(i).getLength();
        }
        return length;
    }

    public String getTitle(int id){
        return titles.get(id).getTitle();
    }

}
