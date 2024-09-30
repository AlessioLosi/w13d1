package Classi;
public class ContoCorrente {
public String titolare;
public int Movimenti;
public final int maxMovimenti = 50;
public double saldo;
public ContoCorrente (String titolare, double saldo) {
    this.titolare = titolare;
    this.saldo = saldo;
    this.Movimenti = 0;
}
public void preleva(double x) {
    if (Movimenti < maxMovimenti) saldo = saldo - x;
    else saldo = saldo - x - 0.50;
    if(saldo<0)throw new BancaException("il conto è in rosso");
    Movimenti++;}
    public double restituisciSaldo() {
        return saldo;
    }
}
