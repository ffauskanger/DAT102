package no.hvl.data102.adt;

import no.hvl.data102.CD;
import no.hvl.data102.Sjanger;

public interface CDarkivADT {
	
	// Returnere en tabell av CD-er
	CD[] hentCDTabell();
	
	// Legger til en ny CD
	void leggTilCD(CD nyCD);
	
	// Sletter en CD hvis den eksisterer
	boolean slettCD(int nr);
	
	// Søker og henter CDer med en gitt delstreng
	CD[] sokTittel(String delstreng);
	
	// Søker og henter artister med en gitt delstren
	CD[] sokArtist(String delstreng);
	
	// Henter antall CDer for en gitt sjanger
	int antallSjanger(Sjanger sjanger);
	
	// Returnerer antall CDer
	int antall();
	
} // Interface
