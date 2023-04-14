package fr.uga.miashs.inff3.beqajd;

import java.util.Arrays;

public class GrilleNavale {
	public Navire[] navires; //Le tableau des navires contenus dans la grille
	public int nbNavires; //Le nombre de navires contenus dans navires
	private int tailleGrille;//Taille de la grille, la grille est carrée
	private Coordonnee [] tirsRecus;//Tableau des tirs recus
	private int nbTirsRecus;//Nombre de tirs contenus dans tirRecus
	

	public GrilleNavale(int taille) {
		tailleGrille=taille;
		navires=new Navire[0];
		nbNavires=0;
		tirsRecus=new Coordonnee[0];
		nbTirsRecus=0;
	}
	
	public boolean ajouteNavire (Navire n) { //bug: navires chevauchent l'un l'autre
		if((n.getDebut().getLine()>tailleGrille-1)||(n.getDebut().getColonne()>tailleGrille-1)
				||(n.getFin().getLine()>tailleGrille-1)||(n.getFin().getColonne()>tailleGrille-1)) {
			return false;
		}else {
			int i=0;
			while((i<nbNavires)&&(!navires[i].chevauche(n))) {
				i++;
			}
			if(i<nbNavires) {
				//cas ou navire chevauche une autre
				return false;
			}else {
				//cas ou navire ne chevauche pas une autre
				int j=0;
				while((j<nbNavires)&&(!navires[j].touche(n))) {
					j++;
				}
				if(j<nbNavires) {
					//cas ou navire ne chevauche pas une autre,mais elle touche une navire
					return false;
				}else {
					//ajouter la navire
					if(navires.length==nbNavires) {
						navires=Arrays.copyOf(navires,navires.length+5);
						navires[nbNavires]=n;
						nbNavires++;
						return true;
					}else {
						navires[nbNavires]=n;
						nbNavires++;
						return true;
					}
				}
			}
		}
	}
	
	public void placementAuto(int[] taillesNavires) {
		Coordonnee debut=new Coordonnee(0,0);
		boolean estVerticale=false;
		Navire navire=new Navire(debut,0,estVerticale);
		
		int i=0;
		while (i<taillesNavires.length) {
			do {
				int n=(int)(Math.random()*11);
				if(n%2==0) {
					 estVerticale=true;
				}
				
				if(estVerticale) {
					do {
						int ligne=(int)(Math.random()*(this.tailleGrille));
						int colonne=(int)(Math.random()*(this.tailleGrille));
						debut=new Coordonnee(ligne,colonne);
					}while((debut.getLine() + taillesNavires[i] -1)>=tailleGrille);
				}	
				
				if(!estVerticale) {
					do {
						int ligne=(int)(Math.random()*(this.tailleGrille));
						int colonne=(int)(Math.random()*(this.tailleGrille));
						debut=new Coordonnee(ligne,colonne);
					}while((debut.getColonne() + taillesNavires[i]-1)>=tailleGrille);
				}	
			  
				navire=new Navire(debut,taillesNavires[i],estVerticale);		    
			}while(!ajouteNavire(navire));
			i++;
		}
	}
	
	private boolean estDansGrille(Coordonnee c) {
		if((c.getLine()<tailleGrille)&&(c.getColonne()<tailleGrille)) {
			return true;
		}else return false;
	}
	
	
	
	private boolean estDansTirsRecus(Coordonnee c) {
		int i=0;
		while((i<nbTirsRecus)&&(!tirsRecus[i].equals(c))) {
			i++;
		}
		if(i<nbTirsRecus) {
			return true;
		}else return false;	
		
	}
	
	 private boolean ajouteDansTirsRecus(Coordonnee c) {
		if((estDansGrille(c))&&(!estDansTirsRecus(c))) {
			nbTirsRecus++;
			tirsRecus=Arrays.copyOf(tirsRecus,nbTirsRecus);
			tirsRecus[nbTirsRecus-1]=c;
			return true;
		}else return false;
	}
	
	public boolean recoitTir(Coordonnee c) {
		boolean res=false;
		if(ajouteDansTirsRecus(c)) {
			int i=0;
			while(i<nbNavires) {
				if(navires[i].recoitTir(c)) {
					res=true;
				}
				i++;
			}
		}
		return res;
	}
	
	public boolean estTouche(Coordonnee c) {
		int i=0;
		while((i<nbNavires)&&(!navires[i].estTouche(c))) {
			i++;
		}
		if(i<nbNavires) {
			return true;
		}else return false;
	}
	
	public boolean estALeau(Coordonnee c) {
		int i=0;
		while((i<nbTirsRecus)&&(!tirsRecus[i].equals(c))) {
			i++;
		}
		int j=0;
		while((j<nbNavires)&&(!navires[j].contient(c))){
			j++;
		}
		if((i<nbTirsRecus)&&(j==nbNavires)) {
			return true;
		}else return false;
	}
	
	public boolean perdu() {
		int i=0,cpt=0;
		while(i<nbNavires) {
			if(navires[i].estCoule()) {
				cpt++;
			}
			i++;
		}
		if(cpt==nbNavires) {
			return true;
		}else return false;
	}
	
	public int getTaille() {
		return tailleGrille;
	}
	
	public boolean estCoule(Coordonnee c) {
		int i=0;
		while((i<nbNavires)&&(!navires[i].contient(c))){
			i++;
		}
		if(i<nbNavires) {
			//cas ou la navire contient la coordonnee c
			if(navires[i].estCoule()) {
				return true;
			}else return false;
		}else {
			//cas ou aucune navire ne contient pas la coordonnee c
			return false;
		}
		
	}
	
	
	
}
