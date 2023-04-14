package fr.uga.miashs.inff3.beqajd;

public class Navire {
	private Coordonnee debut;
	private Coordonnee fin;
	private Coordonnee[] partiesTouchees;
	private int nbTouchees;
	
	public Navire(Coordonnee debut, int longueur, boolean estVertical) {
		this.debut=debut;
		if (estVertical==true) {
			fin=new Coordonnee((debut.getLine() + longueur -1),(debut.getColonne()));
		}
		if (estVertical==false) {
			fin= new Coordonnee((debut.getLine()),(debut.getColonne() + longueur - 1));
		}
		this.partiesTouchees=new Coordonnee[100];
		
	}
	
	
	public String toString() {
		String s=",coordonnees touchees:";
		if(nbTouchees!=0) {
			int i=0;
			while(i<nbTouchees) {
				s=s+partiesTouchees [i];
				i++;
			}
		}else {
			s="";
		}	
		
		return("debut "+debut.toString()+",fin "+fin.toString()+s);
	}
	
	public Coordonnee getDebut() {
		return debut;
	}
	
	public Coordonnee getFin() {
		return fin;
	}
	
	public boolean contient(Coordonnee c) {
		if((debut.getLine()==c.getLine())&&(fin.getLine()==c.getLine())) { //navire horizontale
		  if((c.getColonne()>=debut.getColonne())&&(c.getColonne()<=fin.getColonne())) {
			  return true;
			  }else return false;
		}else {
			if((debut.getColonne()==c.getColonne())&&(fin.getColonne()==c.getColonne())) { //navire verticale
				if((c.getLine()>=debut.getLine())&&(c.getLine()<=fin.getLine())) {
					  return true;
					  }else return false;
			}return false;
		}
			
	}
	
	 private static boolean intersectionNonVide(int d1, int f1, int d2, int f2) {
		 if((d1==d2)&&(f1==f2)) {
			 return true;
		 }else if((d1<=d2)&&(d2<=f1)) {
			 return true;
		 }else if((d1<=f2)&&(f2<=f1)) {
			 return true;
		 }else if((d2<d1)&&(f2>f1)) {
			 return true;
		 }else if((d1<d2)&&(f1>f2)) {
			 return true;
		 }else return false;
	 }
	 
	 public boolean chevauche(Navire n) {
		if ((intersectionNonVide(this.debut.getLine(),this.fin.getLine(),n.debut.getLine(),n.fin.getLine())) 
			&& (intersectionNonVide(this.debut.getColonne(),this.fin.getColonne(),n.debut.getColonne(),n.fin.getColonne()))){
			return true;
		}else return false;
	 }
	 

	 public boolean touche(Navire n) {	 
		 
		int cpt=0;
		if ((intersectionNonVide(this.debut.getLine(),this.fin.getLine(),n.debut.getLine(),n.fin.getLine()))&&(Math.abs(n.debut.getColonne()-fin.getColonne())==1)) {
			cpt++;
		}else if((intersectionNonVide(this.debut.getColonne(),this.fin.getColonne(),n.debut.getColonne(),n.fin.getColonne()))&&(Math.abs(n.debut.getLine()-fin.getLine())==1)) {
			cpt++;
		}
		if(cpt==1) {
			return true;
		}else return false;
		
	 } 
	 
	 public boolean estTouche(Coordonnee c) {
		 int i=0;
		 while((i<nbTouchees)&&(!partiesTouchees [i].equals(c))) {
			i++; 
		 }
		 if(i==nbTouchees) {
			 return false;
		 }else return true;
	 }
	 
	 public boolean recoitTir(Coordonnee c) {
		 if (this.contient(c)) {
			 int i=0;
			 while((i<nbTouchees)&&(!partiesTouchees [i].equals(c))){
				 i++;
			 }
			 if(i==nbTouchees) {
				 partiesTouchees [i]=c;
				 nbTouchees++;
				 return true;
			 } else return false;
		 }	 else return false;
	 }
	 
	 public boolean estTouche() {
		 if (nbTouchees>0) {
			 return true;
		 }else return false;
	 }
	 
	 public boolean estCoule() {
		 if (nbTouchees==partiesTouchees.length) {
			 return true;
		 }else return false;
	 }
	 
	  
}
