package no.hvl.data102;

import no.hvl.data102.adt.CDarkivADT;

public class CDarkivKlient {
	public static void main(String[] args) {
		
		CDarkivADT cda = Fil.lesFraFil("Test.txt");
		//CDarkivADT cda = new CDArkiv(5);
		Meny meny = new Meny(cda);
		meny.start();
		Fil.skrivTilFil(cda, "Test.txt");
	
	}
}
