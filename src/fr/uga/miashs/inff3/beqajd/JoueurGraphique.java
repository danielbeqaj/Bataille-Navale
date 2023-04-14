package fr.uga.miashs.inff3.beqajd;

import java.awt.Color;

public  class JoueurGraphique extends Joueur{
	GrilleNavaleGraphique grilleDeJeu;
	GrilleGraphique grilleDeTirs;
	
	public JoueurGraphique(GrilleNavaleGraphique grilleDeJeu,GrilleGraphique grilleDeTirs) {
		super(grilleDeJeu.getTaille());
		this.grilleDeJeu=grilleDeJeu;
		this.grilleDeTirs=grilleDeTirs;
	}
	
	@Override
	protected void retourAttaque(Coordonnee c, int etat) {
		if(etat==Joueur.TOUCHE) {
			grilleDeTirs.colorie(c,Color.RED);
		}else if(etat==Joueur.A_L_EAU) {
			grilleDeTirs.colorie(c,Color.BLUE);
		}
	}

	@Override
	protected void retourDefense(Coordonnee c, int etat) {
	}

	@Override
	public  Coordonnee choisirAttaque() {
		return grilleDeTirs.getCoordonneeSelectionnee();
	}

	@Override
	public int defendre(Coordonnee c) {
		this.grilleDeJeu.recoitTir(c);
		if(this.grilleDeJeu.estTouche(c)) {
			return Joueur.TOUCHE;
		}else if(this.grilleDeJeu.estCoule(c)) {
			return Joueur.COULE;
		}else if(this.grilleDeJeu.estALeau(c)) {
			return Joueur.A_L_EAU;
		}else if(this.grilleDeJeu.perdu()) {
			return Joueur.GAMEOVER;
		}else return 0;
		
	}

}
