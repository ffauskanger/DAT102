package no.hvl.data102;

import java.util.Scanner;

import no.hvl.data102.adt.CDarkivADT;

public class Textgrensesnitt {

	

	// lese opplysningene om en CD fra tastatur
	 public CD lesCD()
	 {
			String plateselskap, navn;
			int utgitt = 0;
			CD cd;
			//System.out.println("Navn tittel år Sjanger plateselskap");
			Scanner scanner = new Scanner(System.in);
			System.out.println("--NY CD--");
			System.out.print("Navn: ");
			navn = scanner.nextLine();
			System.out.print("Plateselskap: ");
			plateselskap = scanner.nextLine();
			
			cd = new CD(1, navn, "tittel", utgitt, Sjanger.JAZZ, plateselskap);
			return cd;
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
		 System.out.println("Antall CDer: " + cda.antall());
	 }
	 


}	//class
