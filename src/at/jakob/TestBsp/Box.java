package at.jakob.TestBsp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Box {
    private List<Ticket> tickets = new ArrayList<>();
    private Ticket inserted;

    public Ticket getTicket(){
        Random r = new Random();
        Ticket ticket = new Ticket(r.nextInt(1000001));

        this.tickets.add(ticket);
        return ticket;
    }

    public void displayTickets(){
        for(int i = 0; i < tickets.size(); i++){
            System.out.println(tickets.get(i).toString());
        }
    }

    public boolean insertTicker(int id){
        for(int i = 0; i < tickets.size(); i++){
            if(tickets.get(i).getId() == id){
                this.inserted = tickets.get(i);
                return true;
            }
        }
        return false;
    }

    public float getPrice(){
        if(this.inserted != null){
            return (new Date().getTime() - inserted.getStart()) / 1000; //sekunde kostet 1 Euro
        }
        else return -1.0f;
    }

    public float pay(float amount) {
        float price = getPrice();
        if (amount < price) return -1f;
        else if (amount == price) {
            this.inserted.setEnd(new Date().getTime());
            return 0;
        } else {
            this.inserted.setEnd(new Date().getTime());
            return amount - price;
        }
    }
}
