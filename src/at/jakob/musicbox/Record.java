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

    public String getName() {
        return name;
    }

    public int getLength(){
        int length = 0;
        for(int i = 0; i < titles.size(); i++){
            length += titles.get(i).getLength();
        }
        return length;
    }

    public Title getTitle(int id){
        return titles.get(id);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + " " + this.getLength();
    }

}
