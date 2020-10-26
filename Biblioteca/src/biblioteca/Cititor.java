package biblioteca;

import java.util.LinkedList;

public class Cititor {
	private String nume;
	private int nr_cititor;
	private int parola;
	public Cititor(String nume,int nr_cititor,int parola) {
		this.nume = nume;
		this.nr_cititor = nr_cititor;
		this.parola = parola;
	}
	public boolean imprumutaCarte(String carte,LinkedList<Carte> carti) {
		int len = carti.size();
		for(int i = 0;i<len;i++) {
			Carte c = carti.get(i);
			if(c.getNume().equals(carte) && c.getNr_exemplare() != 0) {
				c.setNr_exemplare(c.getNr_exemplare()-1);
				return true;				
			}
		}
		return false;
	}
	public void restituieCarte(String carte,LinkedList<Carte> carti) {
		int len = carti.size();
		for(int i = 0; i<len;i++) {
			Carte c = carti.get(i);
			if(c.getNume().equals(carte)) {
				c.setNr_exemplare(c.getNr_exemplare()+1);
			}
		}
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNr_cititor() {
		return nr_cititor;
	}
	public void setNr_cititor(int nr_cititor) {
		this.nr_cititor = nr_cititor;
	}
	public int getParola() {
		return parola;
	}
	public void setParola(int parola) {
		this.parola = parola;
	}
	
}
