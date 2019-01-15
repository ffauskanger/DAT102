package no.hvl.data102;

import no.hvl.data102.adt.CDarkivADT;

public class CDArkiv implements CDarkivADT {

	// Instansvariabler
	private CD[] cdTabell;
	private int antall;
	
	//Konstruktører
	
	public CDArkiv(int n)
	{
			cdTabell = new CD[n];
			antall = 0;
	}
	
	// Metoder
	
	
	@Override
	// Returnere en tabell av CD-er
	public CD[] hentCDTabell() {
		return cdTabell;
	}
	
	@Override
	// Legger til en ny CD
	public void leggTilCD(CD nyCD) {
		// Legg til utvidning?
		cdTabell[antall] = nyCD;
		antall++;
	}
	
	@Override
	// Sletter en CD
	public boolean slettCD(int nr) {
		if(cdTabell[nr] != null)
		{
			cdTabell[nr] = null;
			return true;
		} 
		else
		{
			return false;
		} // if else
		
	}
	
	// Søker og henter CDer med gitt delstreng
	public CD[] sokTittel(String delstreng) {
		return null;
	}
	
	@Override
	// Søker og henter artister med gitt delstreng
	public CD[] sokArtist(String delstreng) {
		return null;
	}
	
	@Override
	// Henter antall CDer for en gitt sjanger
	public int antallSjanger(Sjanger sjanger) {
		int antallSjanger = 0;
		for(int i = 0; i < antall; i++)
		{
			if(cdTabell[i].getSjanger() == sjanger)
			{
				antallSjanger++;
			}
		}
		return antallSjanger;
	}
	
	@Override
	// Returnerer antall CDer
	public int antall() {
		return this.antall;
	}
	
	// trimmer tabellen
	private CD[] trimTab(CD[] tab, int n) { // n er antall elementer
		 CD[] cdtab2 = new CD[n];
		 int i = 0;
		 while (i < n) {
		cdtab2[i] = tab[i];
		i++;
		 }//while
		 return cdtab2;
	}
}
