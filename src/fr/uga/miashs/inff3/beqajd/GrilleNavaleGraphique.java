package fr.uga.miashs.inff3.beqajd;

import java.awt.Color;

public class GrilleNavaleGraphique extends GrilleNavale{
	private GrilleGraphique grilleGraphique;
	
	public GrilleNavaleGraphique(int taille) {
		super(taille);
		grilleGraphique=new GrilleGraphique(taille);
	}
	
	public GrilleGraphique getGrilleGraphique() {
		return grilleGraphique;
		
	}
	
	public boolean ajouteNavire(Navire n) {
		if(super.ajouteNavire(n)) {
		super.ajouteNavire(n);
		grilleGraphique.colorie(n.getDebut(), n.getFin(), Color.GREEN);
		return true;
		}else return false;
	}
	
	public boolean recoitTir(Coordonnee c) {
		if(super.recoitTir(c)) {
			super.recoitTir(c);
			grilleGraphique.colorie(c, Color.RED);
			return true;
			}else return false;

	}
	
	

}
