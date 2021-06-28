package at.jakob.TestBsp;

import java.util.Date;
import java.util.Random;

public class Ticket {
    private int id;
    private long start;
    private long end;

    public Ticket(int id){
        this.id = id;
        this.start = new Date().getTime();
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public int getId() {
        return id;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", start: " + start +
                ", end: " + end;
    }
}
