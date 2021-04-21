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
	
	@Override
	public String toString() {
		String s="";
		for(Voto v: this.voti) {
			s+=v.toString()+"\n";
		}
		return s;
	}

}
