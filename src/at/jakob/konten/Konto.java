package at.jakob.konten;

public class Konto {
    protected float saldo;
    protected String name = "Konto";


    public void getSaldo() {
        System.out.println(name + ": Current saldo is " + this.saldo + "€!");
    }

    public void deposit(float amount){
        this.saldo += amount;
        System.out.println(name + ": You successfully deposited " + amount + "€!");

    }

    public void withdraw(float amount){
        if(this.saldo < amount) System.out.println(name + ": You don't have enough money to withdraw this amount.");
        else {
            saldo -= amount;
            System.out.println(name + ": Withdrawal completed!");
        }
    }


}
