package zbiorKlas;

import java.util.GregorianCalendar;

public class Aplikacja {

	public static void main(String[] args) {
		//(String i, String n, GregorianCalendar d, Adres a, String o, double p)
		//(String m, String u, String k, String nb, String nl)
		Pracownik p1 = new Pracownik("Kamil", "Kuæ",
										new GregorianCalendar(1987,04-1,14),
										new Adres("Kotuñ", "£¹kowa", "08-130", "4"),
										"IT Engineer", 8500);
		
		//(String i, String n, GregorianCalendar d, Adres a, String k)
		Student s1 = new Student("Piotr", "Kulma",
									new GregorianCalendar(1987,06-1,04),
									new Adres("Miñsk Mazowiecki", "Chrobrego", "05-300", "21"),
									"Informatyka");
		
		Kierownik k1 = new Kierownik("Agnieszka", "Tomczuk",
										new GregorianCalendar(1990,06-1,15),
										new Adres("£osice", "S³owackiego", "08-200", "11a"),
										"Szefowa", 9000);

		System.out.println(p1.opisOsoby);
		System.out.println(s1.opisOsoby);
		System.out.println(k1.opisOsoby);
		
		System.out.println("-------------------------------");
		
		System.out.println(p1.pobierzOpis());
		System.out.println(s1.pobierzOpis());
		System.out.println(k1.pobierzOpis());

		System.out.println("-------------------------------");

		//Osoba[] listaOsob = new Osoba[3];
		Osoba[] listaOsob = {p1,s1,k1};
		
		System.out.println(listaOsob[0].pobierzDane());
		System.out.println(listaOsob[0].pobierzOpis());
		System.out.println(((Pracownik)listaOsob[0]).pobierzPensje());
		System.out.println("------------");
		System.out.println(listaOsob[1].pobierzDane());
		System.out.println(listaOsob[1].pobierzOpis());
		System.out.println("------------");
		System.out.println(listaOsob[2].pobierzDane());
		System.out.println(listaOsob[2].pobierzOpis());
		System.out.println(((Pracownik)listaOsob[2]).pobierzPensje());
		System.out.println("------------");
		//dodanie bonusu
		if (listaOsob[2] instanceof Kierownik){
			Kierownik kTemp = (Kierownik) listaOsob[2];
			kTemp.ustawBonus(777);
			listaOsob[2] = kTemp;
			System.out.println(listaOsob[2].pobierzDane());
			System.out.println(listaOsob[2].pobierzOpis());
			System.out.println(((Pracownik)listaOsob[2]).pobierzPensje());
		}
	}
}
