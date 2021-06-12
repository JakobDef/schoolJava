package at.jakob.musicbox;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private List<Record> records = new ArrayList<>();

    public void addRecord(Record rec){
        if(this.records.size() < 50){
            this.records.add(rec);
        }
        else System.out.println("Magazine is full!");
    }

    public void removeRecord(Record rec){
        try{
            this.records.remove(rec);
            System.out.println(rec.getName() + " was removed.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public int getSumOfMusic(){
        int length = 0;
        for(int i = 0; i < this.records.size(); i++){
            length += this.records.get(i).getLength();
        }
        return length;
    }

    public Record searchRecord(String name){
        for(int i = 0; i < this.records.size(); i++){
            if(this.records.get(i).getName() == name){
                return this.records.get(i);
            }
        }
        return null;
    }

}
