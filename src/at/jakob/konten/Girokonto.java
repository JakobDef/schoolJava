package at.jakob.konten;

public class Girokonto extends Konto {

    protected float interestRate;
    protected int interestCount = 0;

    public Girokonto(float interestRate){
        super.name = "Girokonto";
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(float amount) {
        super.deposit(amount);
        interestCount++;
        if(interestCount % 2 == 0) this.interest();
    }

    @Override
    public void withdraw(float amount) {
        super.withdraw(amount);

        interestCount++;
        if(interestCount % 2 == 0) this.interest();
    }

    protected void interest(){
        super.saldo *= 1 + (this.interestRate/100);

        System.out.println(name + ": You have recieved interest!");

    }

}
