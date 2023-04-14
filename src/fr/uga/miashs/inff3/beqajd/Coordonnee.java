 package fr.uga.miashs.inff3.beqajd;

public class Coordonnee {
	private int ligne; //horizontalement
	private int colonne; //verticalement
	
	public Coordonnee(String ch) {
		char c=ch.charAt(0);
		this.colonne=c-'A';
		String s=ch.substring(1);
		this.ligne=Integer.parseInt(s)-1;
		}
	
	public Coordonnee(int l,int c) {
		ligne=l;
		colonne=c;
	}
	
	public int getLine() {
		return ligne;
	}
	
	public int getColonne() {
		return colonne;
	}
	
	public String toString() {
		int l=ligne + 1;
		char c=(char) (colonne+'A');
		return ""+ c + Integer.toString(l);
	}
	
	public boolean equals(Coordonnee o) {
		if ((o.ligne==this.ligne)&&(o.colonne==this.colonne)){
		return true;
	    }else return false;
	}
	
	public boolean voisine(Coordonnee o) {
		if (((this.ligne==o.ligne)&&((this.colonne-o.colonne)<=1)&&((this.colonne-o.colonne)>=-1)) 
		||
		((this.colonne==o.colonne)&&((this.ligne-o.ligne)<=1)&&((this.ligne-o.ligne)>=-1)))
		{
			return true;
		}else return false;
	}
	
	public int compareTo(Coordonnee o) {
		if ((o.ligne<this.ligne)||((o.ligne==this.ligne)&&(o.colonne<this.colonne))) {
			return (-1);
		}else {
			if((this.equals(o))==true) {
				return 0;
			}else return 1;
		}
	}
}
