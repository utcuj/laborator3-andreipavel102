package biblioteca;

import java.util.LinkedList;

public class Angajat {
	private String nume;
	private int nr_angajat;
	private int parola;
	public Angajat(String nume,int nr_angajat,int parola) {
		this.nume = nume;
		this.nr_angajat = nr_angajat;
		this.parola = parola;
	}
	public void adaugaCarte(String nume,String autor,int nr_exemplare,int nr_pagini,LinkedList<Carte> carti) {
		Carte noua = new Carte(nume,autor,nr_exemplare,nr_pagini);
		carti.add(noua);
	}
	public void adaugaExemplare(int nr_exemplare,Carte carte) {
		carte.setNr_exemplare(carte.getNr_exemplare()+nr_exemplare);
	}
	public void stergeExemplare(int nr_exemplare,Carte carte) {
		if(nr_exemplare>carte.getNr_exemplare())
			carte.setNr_exemplare(0);
		else
			carte.setNr_exemplare(carte.getNr_exemplare()-nr_exemplare);
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNr_angajat() {
		return nr_angajat;
	}
	public void setNr_angajat(int nr_angajat) {
		this.nr_angajat = nr_angajat;
	}
	public int getParola() {
		return parola;
	}
	public void setParola(int parola) {
		this.parola = parola;
	}
	
}
