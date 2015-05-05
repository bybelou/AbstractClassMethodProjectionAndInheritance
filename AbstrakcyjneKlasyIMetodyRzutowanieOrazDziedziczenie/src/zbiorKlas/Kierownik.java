package zbiorKlas;

import java.util.GregorianCalendar;

public class Kierownik extends Pracownik{
	public Kierownik(String i, String n, GregorianCalendar d, Adres a, String o, double p){
		super(i, n, d, a, o, p);
	}
	
	public void ustawBonus(double b){
		this.bonus = b;
	}
	
	public double pobierzPensje(){
		double p = super.pobierzPensje()+bonus;
		return p;
	}
	
	private double bonus = 0;
}
