package zbiorKlas;

import java.util.GregorianCalendar;

public class Student extends Osoba{
	public Student(String i, String n, GregorianCalendar d, Adres a, String k){
		super(i, n, d, a, k);
		
		this.kierunek = k;
	}

	@Override
	public String pobierzOpis() {
		// TODO Auto-generated method stub
		return "Kierunek studiów: " + this.kierunek;
	}
	
	private String kierunek;
}
