package zbiorKlas;

import java.util.GregorianCalendar;

public abstract class Osoba {
	public Osoba(String i, String n, GregorianCalendar d, Adres a, String o){
		this.imie = i;
		this.nazwisko = n;
		this.dataUrodzenia = d;
		this.adres = a;
		this.opisOsoby = o;
		
		nadajId();
	}
	public Osoba(String i, String n, String o){
		this(i, n, null, null, o);
	}
	public Osoba(String i, String n, GregorianCalendar k, String o){
		this(i, n, k, null, o);
	}
	public Osoba(String i, String n, Adres a, String o){
		this(i, n, null, a, o);
	}
	
	private void nadajId(){
		this.id = Osoba.nastepnyId;
		Osoba.nastepnyId++;
	}

	protected abstract String pobierzOpis();
	protected String opisOsoby;

	public void ustawImie (String i){
		this.imie = i;
	}
	public void ustawNazwisko (String n){
		this.nazwisko = n;
	}
	public void ustawDateUrodzenia (GregorianCalendar d){
		this.dataUrodzenia = d;
	}
	public void ustawAdres (Adres a){
		this.adres = a;
	}
	
	public String pobierzDane(){
		String zwroc;
		zwroc = "ID: " + this.id
				+ "\nIMIE: " + this.imie
				+ "\nNAZWISKO: " + this.nazwisko;
		if (dataUrodzenia != null)
			zwroc = zwroc + "\nDATA URODZENIA: " + this.dataUrodzenia.getTime();
		if (adres != null)
			zwroc = zwroc + "\nADRES:\n" + this.adres.pobierzAdres();
		
		return "[" + getClass().getName() + "]\n" + zwroc;
	}

	private String imie;
	private String nazwisko;
	private GregorianCalendar dataUrodzenia;
	private Adres adres;
	private int id;
	static int nastepnyId=1;
}
