package at.jakob.konten;

public class Sparbuch extends Girokonto {
    private int lock;


    public Sparbuch(float interestRate, int lock) {
        super(interestRate);
        super.name = "Sparbuch";
        this.lock = lock;
    }

    @Override
    public void getSaldo() {
        super.getSaldo();
        this.lock--;
    }

    @Override
    public void deposit(float amount) {
        super.deposit(amount);
        this.lock--;
    }

    @Override
    public void withdraw(float amount) {
        if(lock <= 0) super.withdraw(amount);
        else System.out.println(name + ": You can't withdraw any money yet! Please wait another " + lock + " Year(s)!");
        interestCount++;
        if(interestCount % 2 == 0) this.interest();
    }
}
