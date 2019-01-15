package no.hvl.data102;

import no.hvl.data102.adt.CDarkivADT;

public class Textgrensesnitt {

	

	// lese opplysningene om en CD fra tastatur
	 public CD lesCD()
	 {
		 return null;
	 }
	 
	// vise en CD med alle opplysninger på skjerm (husk tekst for sjanger)
	 public void visCD(CD cd)
	 {
		 System.out.println("CD ID:" + cd.getCdNr() + "\nArtist/Gruppe: " + cd.getNavn() + "\nTittel: " + cd.getTittel() + "\nLanseringsår: " + cd.getÅr() + "\nSjanger: " + cd.getSjanger() + "\nPlateselskap: " + cd.getPlateSelskap());
	 }
	 
	// Skrive ut alle CD-er med en spesiell delstreng i tittelen
	 public void skrivUtCdDelstrengITittel(CDarkivADT cda, String delstreng)
	 {
		 
	 }
	 
	// Skriver ut alle CD-er av en artist / en gruppe
	 public void skrivUtCdArtist(CDarkivADT cda, String delstreng)
	 {
		 
	 }
	 
	// Skrive ut en enkel statistikk som inneholder antall CD-er totalt
	// og hvor mange det er i hver sjanger
	 public void skrivUtStatistikk(CDarkivADT cda)
	 {
		 
	 }
	 


}	//class
