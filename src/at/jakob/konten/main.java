package at.jakob.konten;

public class main {

    public static void main(String[] args) {
        Konto konto = new Konto();
        Girokonto girokonto = new Girokonto(10);
        Sparbuch sparbuch = new Sparbuch(10, 3);

        konto.getSaldo();
        sparbuch.getSaldo();
        girokonto.getSaldo();
        konto.deposit(200);
        sparbuch.deposit(200);
        girokonto.deposit(200);
        konto.withdraw(69.69f);
        sparbuch.withdraw(69.69f);
        girokonto.withdraw(69.69f);

        konto.getSaldo();
        sparbuch.getSaldo();
        girokonto.getSaldo();
        konto.withdraw(210);
        sparbuch.withdraw(210);
        girokonto.withdraw(210);

    }


}
