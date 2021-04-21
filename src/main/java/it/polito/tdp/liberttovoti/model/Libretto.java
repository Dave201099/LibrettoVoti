package it.polito.tdp.liberttovoti.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti= new ArrayList<>();
	}

	public void add(Voto v) {
		
		this.voti.add(v);
	}
	
	public List<Voto> listaVotiUguali(int punteggio) {
		List<Voto>ris= new ArrayList<Voto>();
		for(Voto v: this.voti)
			if(v.getVoto()==punteggio)
				ris.add(v);
		return ris;
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto ris= new Libretto();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio) {
				ris.add(v);
			}
		}
		return ris;
	}
	
	@Override
	public String toString() {
		String s="";
		for(Voto v: this.voti) {
			s+=v.toString()+"\n";
		}
		return s;
	}

}
