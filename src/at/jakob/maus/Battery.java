package at.jakob.maus;

public class Battery {

    private float charge = 3.5f;

    public float getCharge() {
        return charge;
    }

    public void decrease(float amount){
        this.charge -= amount;
        if(this.charge < 2.9f) System.out.println("Warning:\tThe Battery charge is at " + this.charge + "V!");
    }

}
