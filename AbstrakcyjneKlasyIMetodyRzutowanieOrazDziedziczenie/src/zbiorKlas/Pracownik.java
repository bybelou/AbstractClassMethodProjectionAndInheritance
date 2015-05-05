package zbiorKlas;

import java.util.GregorianCalendar;

public class Pracownik extends Osoba{
	public Pracownik(String i, String n, GregorianCalendar d, Adres a, String o, double p){
		super(i,n,d,a,o);
		
		this.pensja = p;
	}

	public double pobierzPensje(){
		return this.pensja;
	}

	@Override
	protected String pobierzOpis() {
		return "Stanowisko: " + super.opisOsoby;
	}
	
	private double pensja;
}
