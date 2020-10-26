package biblioteca;

public class Carte {
	private String nume;
	private String autor;
	private int nr_exemplare;
	private int nr_pagini;
	@Override
	public String toString() {
		return "Carte [nume=" + nume + ", autor=" + autor + ", nr_exemplare=" + nr_exemplare + ", nr_pagini="
				+ nr_pagini + "]";
	}
	public Carte(String nume,String autor,int nr_exemplare,int nr_pagini) {
		this.nume = nume;
		this.autor = autor;
		this.nr_exemplare = nr_exemplare;
		this.nr_pagini = nr_pagini;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNr_exemplare() {
		return nr_exemplare;
	}
	public void setNr_exemplare(int nr_exemplare) {
		this.nr_exemplare = nr_exemplare;
	}
	public int getNr_pagini() {
		return nr_pagini;
	}
	public void setNr_pagini(int nr_pagini) {
		this.nr_pagini = nr_pagini;
	}
	
}
