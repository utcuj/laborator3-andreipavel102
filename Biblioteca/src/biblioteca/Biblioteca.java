package biblioteca;
import java.util.*;
public class Biblioteca {
	private boolean exit;
	private int pagina;
	LinkedList<Carte> carti = new LinkedList<Carte>();
	LinkedList<Angajat> angajati = new LinkedList<Angajat>();
	LinkedList<Cititor> cititori = new LinkedList<Cititor>();
	Angajat angajat;
	Cititor cititor;
	Scanner scanner = new Scanner(System.in);
	public Biblioteca() {
		exit = false;
		pagina = 1;
		
		Carte c1 = new Carte("Strainul","Albert Camus",20,290);
		Carte c2 = new Carte("Un veac de singuratate","Gabriel Garcia Marquez",25,385);
		Carte c3 = new Carte("De veghe in lanul de secara","J.D. Salinger",13,300);
		Carte c4 = new Carte("O mie noua sute optzeci si patru","George Orwell",20,290);
		Carte c5 = new Carte("Mitul lui Sisif","Albert Camus",16,150);
		Carte c6 = new Carte("Procesul","Franz Kafka",9,323);
		Carte c7 = new Carte("Castelul","Franz Kafka",12,287);
		
		carti.add(c1);
		carti.add(c2);
		carti.add(c3);
		carti.add(c4);
		carti.add(c5);
		carti.add(c6);
		carti.add(c7);
		
		Angajat a1 = new Angajat("Popescu Mirela",986512,7546);
		Angajat a2 = new Angajat("Popescu Danela",981241,9012);
		
		Cititor cit1 = new Cititor("Mircea Mircea",116509,6123);
		Cititor cit2 = new Cititor("Mircea Mircea",613229,7132);
		Cititor cit3 = new Cititor("Mircea Mircea",914321,9432);
		Cititor cit4 = new Cititor("Mircea Mircea",661432,1132);
		
		cititori.add(cit1);
		cititori.add(cit2);
		cititori.add(cit3);
		cititori.add(cit4);
		
		angajati.add(a1);
		angajati.add(a2);
	}
	public void x() {
		while(exit == false) {
			switch(pagina) {
				case 1:
					primaPagina();
					break;
				case 2:
					aDouaPagina();
					break;
				case 3:
					aTreiaPagina();
					break;
				case 4:
					aPatraPagina();
					break;
				case 5:
					aCinceaPagina();
					break;
				case 6:
					aSaseaPagina();
					break;
				case 7:
					aSapteaPagina();
					break;
				case 8:
					aOptaPagina();
					break;
				case 9:
					aNouaPagina();
					break;
				case 10:
					aZeceaPagina();
					break;
			}
		}
	}
	public void primaPagina() {
		System.out.printf("%s\n%s\n%s\n","1.Angajat","2.Cititor","3.Exit");
		int x = scanner.nextInt();
		if(x == 1)
			pagina = 2;
		if(x == 2)
			pagina = 7;
		if(x == 3)
			exit = true;
	}
	public boolean verificaAngajat(int nr,int parola) {
		int len = angajati.size();
		for(int i = 0;i<len;i++) {
			if(nr == angajati.get(i).getNr_angajat() && parola ==  angajati.get(i).getParola()) {
				angajat = angajati.get(i);
				return true;
			}
				
		}
		return false;
	}
	public void aDouaPagina() {
		boolean ok = false;
		while(ok == false) {
			System.out.println("Numar angajat = ");
			int nr = scanner.nextInt();
			System.out.println("Parola angajat = ");
			int parola = scanner.nextInt();
			ok = verificaAngajat(nr,parola);
			if(ok == true) {
				pagina = 3;
				break;
			}
			System.out.println("Numarul sau parola sunt gresite");
		}
	}
	public void aTreiaPagina() {
		System.out.printf("%s\n%s\n%s\n%s","1.Adauga Carte","2.Adauga Exemplar","3.Elimina exemplar","4.Inapoi");
		int x = scanner.nextInt();
		if(x == 1)
			pagina = 4;
		if(x == 2)
			pagina = 5;
		if(x == 3)
			pagina = 6;
		if(x == 4)
			pagina = 1;
	}
	public void aPatraPagina() {
		System.out.println("Nume = ");
		String nume = scanner.nextLine();
		nume = scanner.nextLine();
		System.out.println("Autor = ");
		String autor = scanner.nextLine();
		System.out.println("Numar exemplare = ");
		int nrEx = scanner.nextInt();
		System.out.println("Numar pagini = ");
		int nrPag = scanner.nextInt();
		angajat.adaugaCarte(nume, autor, nrEx, nrPag, carti);
		pagina = 3;
		System.out.println("Cartea a fost adaugata");
		
	}
	public Carte gasesteCarte(String nume) {
		int len = carti.size();
		for(int i=0;i<len;i++) {
			if(carti.get(i).getNume().equals(nume)) {
				return carti.get(i);
			}	
		}
		System.out.println("Cartea nu se afla in biblioteca");
		return null;
		
	}
	public void aCinceaPagina() {
		System.out.println("Nume = ");
		String nume = scanner.nextLine();
		nume = scanner.nextLine();
		System.out.println("Numar exemplare = ");
		int nr = scanner.nextInt();
		Carte carte = gasesteCarte(nume);
		if(carte != null) {
			System.out.println("Exemplarele au fost adaugate");
			angajat.adaugaExemplare(nr, carte);
		}	
		pagina = 3;
	}
	public void aSaseaPagina() {
		System.out.println("Nume = ");
		String nume = scanner.nextLine();
		nume = scanner.nextLine();
		System.out.println("Numar exemplare = ");
		int nr = scanner.nextInt();
		Carte carte = gasesteCarte(nume);
		if(carte != null) {
			System.out.println("Exemplarele au fost eliminate");
			angajat.stergeExemplare(nr, carte);
		}
		pagina = 3;
	}
	public void printAll() {
		int len = carti.size();
		for(int i=0;i<len;i++) {
			System.out.println(carti.get(i));
		}
	}
	public boolean verificaCititor(int nr,int parola) {
		int len = cititori.size();
		for(int i = 0;i<len;i++) {
			if(nr == cititori.get(i).getNr_cititor() && parola ==  cititori.get(i).getParola()) {
				cititor = cititori.get(i);
				return true;
			}
				
		}
		return false;
	}
	public void aSapteaPagina() {
		boolean ok = false;
		while(ok == false) {
			System.out.println("Numar cititor = ");
			int nr = scanner.nextInt();
			System.out.println("Parola cititor = ");
			int parola = scanner.nextInt();
			ok = verificaCititor(nr,parola);
			if(ok == true) {
				pagina = 8;
				break;
			}
			System.out.println("Numarul sau parola sunt gresite");
		}
	}
	public void aOptaPagina() {
		System.out.printf("%s\n%s\n%s\n","1.Imprumuta carte","2.Restituie Carte","3.Inapoi");
		int x = scanner.nextInt();
		if(x == 1)
			pagina = 9;
		if(x == 2)
			pagina = 10;
		if(x == 3)
			pagina = 1;
	}
    public void aNouaPagina() {
    	System.out.println("Nume = ");
		String nume = scanner.nextLine();
		nume = scanner.nextLine();
		if(cititor.imprumutaCarte(nume, carti) == false) {
			System.out.println("Cartea nu este disponibila");
		}
		pagina = 8;
    }
    public void aZeceaPagina() {
    	System.out.println("Nume = ");
		String nume = scanner.nextLine();
		nume = scanner.nextLine();
		cititor.restituieCarte(nume, carti);
		pagina = 8;
    }
}

