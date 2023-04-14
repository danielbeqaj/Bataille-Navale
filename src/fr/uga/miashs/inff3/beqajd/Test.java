package fr.uga.miashs.inff3.beqajd;

public class Test {

	public static void main(String[] args) {
		
		/* TEST 1
		Coordonnee a=new Coordonnee("A5");
		Coordonnee b=new Coordonnee(0,0);
		if ((a.getLine()!=4)&&(a.getColonne()!=0)) {
			System.out.println("Pb 1 avec le constructeur Coordonnee");
		}
		if ((b.getLine()!=0)&&(b.getColonne()!=0)) {
			System.out.println("Pb 2 avec le constructeur Coordonnee");
		}
		*/
		
		
		/* TEST 2
		Coordonnee c=new Coordonnee("C6");
		if (!c.toString().equals("C6")) {
			System.out.println("PB 1 avec la methode toString");
		}
        */
		
		
		/* TEST 3
		Coordonnee d=new Coordonnee("A2");
		Coordonnee e=new Coordonnee("A2");
		if (!d.equals(e)) {
			System.out.println("PB 1 avec la methode equals");
		}
		*/
		
		
		/* TEST 4
		Coordonnee f=new Coordonnee("E4");
		Coordonnee g=new Coordonnee("D4");
		Coordonnee h=new Coordonnee("F4");
		Coordonnee i=new Coordonnee("E3");
		Coordonnee j=new Coordonnee("E5");
		if(!f.voisine(g)) {
			System.out.println("PB 1 avec la methode voisine");
		}
		if(!f.voisine(h)) {
			System.out.println("PB 2 avec la methode voisine");
		}
		if(!f.voisine(i)) {
			System.out.println("PB 3 avec la methode voisine");
		}
		if(!f.voisine(j)) {
			System.out.println("PB 4 avec la methode voisine");
		}
		if(j.voisine(g)) {
			System.out.println("PB 5 avec la methode voisine");
		}
	    */
		
		
		/*TEST 5
		Coordonnee k=new Coordonnee("E4");
		Coordonnee l=new Coordonnee("B2");
		Coordonnee m=new Coordonnee("B4");
		Coordonnee n=new Coordonnee("B6");
		Coordonnee o=new Coordonnee("E2");
		Coordonnee p=new Coordonnee("E6");
		Coordonnee q=new Coordonnee("G2");
		Coordonnee r=new Coordonnee("G4");
		Coordonnee s=new Coordonnee("G6");
		Coordonnee t=new Coordonnee("E4");
		if(!(k.compareTo(l)<0)) {
			System.out.println("PB 1 avec la methode compareTo");
		}
		if(!(k.compareTo(m)<0)) {
			System.out.println("PB 2 avec la methode compareTo");
		}
		if(k.compareTo(n)<0) {
			System.out.println("PB 3 avec la methode compareTo");
		}
		if(!(k.compareTo(o)<0)) {
			System.out.println("PB 4 avec la methode compareTo");
		}
		if(!(k.compareTo(p)>0)) {
			System.out.println("PB 5 avec la methode compareTo");
		}
		if(!(k.compareTo(q)<0)) {
			System.out.println("PB 6 avec la methode compareTo");
		}
		if(!(k.compareTo(r)>0)) {
			System.out.println("PB 7 avec la methode compareTo");
		}
		if(!(k.compareTo(s)>0)) {
			System.out.println("PB 8 avec la methode compareTo");
		}
		if(k.compareTo(t)!=0) {
			System.out.println("PB 9 avec la methode compareTo");
		}
	    */ 
		
		
		/* TEST 6
		Navire a=new Navire(new Coordonnee(0,0),3,true);
		if(!a.getCoordonneFin().equals("A3")) {
			System.out.println("PB 1 avec le constructeur Navire");
		}
		*/
		
		/*TEST 7
		Coordonnee c=new Coordonnee(0,0);
		Navire a=new Navire(c,3,true);
		System.out.println(a.toString());
		*/
		
		
		/*TEST 8
		Navire b=new Navire(new Coordonnee("B2"),4,false);
		Coordonnee d=new Coordonnee("C2");
		Navire e=new Navire(new Coordonnee("B4"),3,true);
		Coordonnee f=new Coordonnee("B5");
		Navire g=new Navire(new Coordonnee("B2"),4,false);
		Coordonnee h=new Coordonnee("F2");
		Navire i=new Navire(new Coordonnee("B4"),3,true);
		Coordonnee j=new Coordonnee("B3");
		Navire k=new Navire(new Coordonnee("B2"),4,false);
		Coordonnee l=new Coordonnee("D6");
		if(!b.contient(d)) {
			System.out.println("PB 1 avec la methode contient");
		}
		if(!e.contient(f)) {
			System.out.println("PB 2 avec la methode contient");
		}
		if(g.contient(h)) {
			System.out.println("PB 3 avec la methode contient");
		}
		if(i.contient(j)) {
			System.out.println("PB 4 avec la methode contient");
		}
		if(k.contient(l)) {
			System.out.println("PB 5 avec la methode contient");
		}
		*/
		
		/*TEST 9
		Navire aa=new Navire(new Coordonnee("C3"),3,false);
		Navire bb=new Navire(new Coordonnee("E2"),2,true);
		Navire cc=new Navire(new Coordonnee("E2"),2,true);
		Navire dd=new Navire(new Coordonnee("C3"),3,false);
		Navire ee=new Navire(new Coordonnee("E2"),2,true);
		Navire ff=new Navire(new Coordonnee("C3"),3,true);
		if(!aa.chevauche(bb)) {
			System.out.println("PB 1 avec la methode chevauche");
		}
		if(!cc.chevauche(dd)) {
			System.out.println("PB 2 avec la methode chevauche");
		}
		if(ee.chevauche(ff)) {
			System.out.println("PB 3 avec la methode chevauche");
		}
		*/
		
		/*Test 10
		Navire aaa=new Navire(new Coordonnee("F3"),2,true);
		Navire bbb=new Navire(new Coordonnee("F5"),2,true);
		if(!aaa.touche(bbb)) {
			System.out.println("PB avec la methode touche");
		}
		*/
		
		
		
		/*TEST 11
		GrilleNavale grilleTest=new GrilleNavale(100);
		Navire n1=new Navire(new Coordonnee(0,0),5,true);
		Navire n2=new Navire(new Coordonnee(0,0),5,false);
		Navire n3=new Navire(new Coordonnee(9,9),5,true);
		Navire n4=new Navire(new Coordonnee(7,7),2,true);
		if(!grilleTest.ajouteNavire(n1)) {
			System.out.println("PB 1 avec la methode ajouteNavire");
		}
		if(grilleTest.ajouteNavire(n2)) {
			System.out.println("PB 2 avec la methode ajouteNavire");
		}
		if(grilleTest.ajouteNavire(n3)) {
			System.out.println("PB 3 avec la methode ajouteNavire");
		}
		if(!grilleTest.ajouteNavire(n4)) {
			System.out.println("PB 4 avec la methode ajouteNavire");
		}
		*/
		
		/*Test 12
		GrilleNavale gn=new GrilleNavale(10);
		int [] taillesNavires=new int[] {5,4,3,3,2,2};
		gn.placementAuto(taillesNavires);
		//on a change l'attribut navires et nbNavires a public juste pour le test
		//System.out.print(gn.navires.toString());
		int i=0;
		while(i<gn.nbNavires) {
			System.out.println(gn.navires[i].toString());
			i++;
		}
		*/
		
		
		/*Test 13
		GrilleNavale gn=new GrilleNavale(10);
		//on a change l'attribut tirsRecus et nbTirsRecus a public juste pour le test
		//on a change aussi la methode estDansTirsRecus a public
		gn.tirsRecus=new Coordonnee [2];
		gn.tirsRecus[0]=new Coordonnee(0,0);
		gn.nbTirsRecus=1;
		Coordonnee c=new Coordonnee(0,0);
		if(!gn.estDansTirsRecus(c)) {
			System.out.println("PB avec la methode estDansTirsRecus");
		}
		*/
		
		/*Test 14
		GrilleNavale gn=new GrilleNavale(10);
		Coordonnee c1=new Coordonnee(0,0);
		Coordonnee c2=new Coordonnee(3,5);
		Coordonnee c3=new Coordonnee(0,0);
		if(!gn.ajouteDansTirsRecus(c1)) {
			System.out.println("PB1 avec la methode ajouteDansTirsRecus");
		}
		if(!gn.ajouteDansTirsRecus(c2)) {
			System.out.println("PB2 avec la methode ajouteDansTirsRecus");
		}
		if(gn.ajouteDansTirsRecus(c3)) {
			System.out.println("PB3 avec la methode ajouteDansTirsRecus");
		}
		*/
		
		
		/*Test 15
		GrilleNavale gn=new GrilleNavale(10);
		Navire n1=new Navire(new Coordonnee(0,0),5,true);
		gn.ajouteNavire(n1);
		gn.recoitTir(new Coordonnee(0,0));
		gn.recoitTir(new Coordonnee(4,0));
		if(!gn.estTouche(new Coordonnee(0,0))) {
			System.out.println("PB 1 avec la methode estTouche");
		}
		if(!gn.estTouche(new Coordonnee(4,0))) {
			System.out.println("PB 2 avec la methode estTouche");
		}
		*/
		
		/*Test 16
		GrilleNavale gn=new GrilleNavale(10);
		Navire n1=new Navire(new Coordonnee(0,0),5,true);
		gn.ajouteNavire(n1);
		gn.recoitTir(new Coordonnee(0,0));
		gn.recoitTir(new Coordonnee(4,0));
		gn.recoitTir(new Coordonnee(1,1));
		gn.recoitTir(new Coordonnee(4,5));
		if(gn.estALeau(new Coordonnee(0,0))) {
			System.out.println("PB 1 avec la methode estALeau");
		}
		if(gn.estALeau(new Coordonnee(4,0))) {
			System.out.println("PB 2 avec la methode estALeau");
		}
		if(!gn.estALeau(new Coordonnee(1,1))) {
			System.out.println("PB 3 avec la methode estALeau");
		}
		if(!gn.estALeau(new Coordonnee(4,5))) {
			System.out.println("PB 4 avec la methode estALeau");
		}
		*/
		
		
		
		
		
		
		
		
	    
		
	}

}
