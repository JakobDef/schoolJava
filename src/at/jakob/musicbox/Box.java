package at.jakob.musicbox;

public class Box {
    private Player player;
    private Magazine magazine;
    private Record loaded;

    public Box(Player player, Magazine magazine){
        this.player = player;
        this.magazine = magazine;
    }

    public void loadRecord(Record record){
        if(this.magazine.searchRecord(record.getName()) != null){
            this.loaded = record;
            System.out.println("Record loaded");
        }
        else{
            System.out.println("Record not found in magazine");
        }
    }

    public void removeRecord(){
        this.loaded = null;
        System.out.println("Record removed");
    }

    public void play(int id){
        if(loaded != null){
            try{
                player.play(loaded.getTitle(id));
            }
            catch (Exception e){
                System.out.println("Title not found");
            }
        }
        else{
            System.out.println("No Record loaded!");
        }
    }

}
