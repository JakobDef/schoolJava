package at.jakob.maus;



public class Mouse {

    private boolean powered;
    private int angle = 0;
    private Deck deck;
    private Battery battery;

    public Mouse(Deck deck, Battery battery){
        this.deck = deck;
        this.battery = battery;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }

    public boolean getPowered(){
        return this.powered;
    }

    public void leftClick(){
        if(this.powered){
            System.out.println("The left Button was clicked. I am " + this.deck.getColor() + "!");
            this.battery.decrease(0.1f);
        }
        else System.out.println("The mouse is powered off...");
    }

    public void rightClick(){
        if(this.powered){
            System.out.println("The right Button was clicked. I am " + this.deck.getColor() + "!");
            this.battery.decrease(0.1f);
        }
        else System.out.println("The mouse is powered off...");
    }

    public void scroll(int angle){
        if(this.powered){
            this.angle += angle;

            this.battery.decrease(0.1f * angle/30);

            System.out.println("The current angle is " + this.angle);

            if(this.angle < 0) this.angle += 360;
            else if(this.angle > 360) this.angle -= 360;
        }
        else System.out.println("The mouse is powered off...");
    }

    public void changeDeck(Deck deck){
        this.deck = deck;
    }

}
