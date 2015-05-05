package zbiorKlas;

public class Adres {
	public Adres(String m, String u, String k, String nb, String nl){
		this.miejscowosc = m;
		this.ulica = u;
		this.kodPocztowy = k;
		this.nrBudynku = nb;
		this.nrLokalu = nl;
	}

	public Adres(String m, String u, String k, String nb){
		//wywolanie pe³nego konstruktora
		//nr mieszkania nie jest konieczny, wiec podstawiam '""'
		this(m, u, k, nb, "");
	}

	public void ustawMiejscowosc (String m){
		this.miejscowosc = m;
	}
	public void ustawUlice (String u){
		this.ulica = u;
	}
	public void ustawKodPocztowy (String k){
		this.kodPocztowy = k;
	}
	public void ustawNumerBudynku (String nb){
		this.nrBudynku = nb;
	}
	public void ustawNumerLokalu (String nl){
		this.nrLokalu = nl;
	}
	
	public String pobierzAdres(){
		if (this.nrLokalu.equals(""))
			//jesli nie podano nr lokalu
			return "ul. " + this.ulica + " " + this.nrBudynku
					+ "\n" + this.kodPocztowy + " " + this.miejscowosc;
		else
			//jesli podano nr lokalu
			return "ul. " + this.ulica + " " + this.nrBudynku + "/" + this.nrLokalu
					+ "\n" + this.kodPocztowy + " " + this.miejscowosc;
	}

	private String miejscowosc;
	private String ulica;
	private String kodPocztowy;
	private String nrBudynku;
	private String nrLokalu;//nieobowiazkowy
}
