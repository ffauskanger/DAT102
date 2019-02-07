package no.hvl.data102;

import java.util.Scanner;

import no.hvl.data102.adt.CDarkivADT;

public class Meny {
	private Textgrensesnitt tekstgr;
	private CDarkivADT cda;
	
	public Meny(CDarkivADT cda)
	{
		tekstgr = new Textgrensesnitt();
		this.cda = cda;
	}
	
	public int getInput()
	{
		int input = -1;
		boolean gyldig = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("Choice:");
		while(!gyldig)
		{
			try {
				input = Integer.parseInt(scan.next());
				gyldig = true;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Feil argument, prøv igjen");
			}
		}
		return input;
	}
	
	public void menyInfo()
	{
		System.out.println("-----------------------");
		System.out.println("--MENY--");
		System.out.println("0: Avslutt");
		System.out.println("1: Legg til CD");
		System.out.println("2: Vis CD");
		System.out.println("3: Skriv ut info om CD");
		System.out.println("4: Statistikk om CDer");
		System.out.println("-----------------------");
	}
	
	
	public void start()
	{
		boolean aktiv = true;
		int choice = -1;
		
		while(aktiv)
		{
			menyInfo();
			choice = getInput();
			switch(choice)
			{
			case 0:
				System.out.println("Avslutter. . .");
				aktiv = false;
				break;
			case 1:
				
				// Ny kode
				CD cd = tekstgr.lesCD();
				cda.leggTilCD(cd);
				break;
			case 2:
				choice = getInput();
				cd = cda.hentCDTabell()[choice];
				tekstgr.visCD(cd);
				break;
			case 3:
				Scanner scanner = new Scanner(System.in);
				System.out.println("Skriv ut info om CD");
				System.out.print("Søk artist: ");
				String str = scanner.nextLine();
				CD[] array = cda.sokArtist(str);
				for(int i = 0; i < array.length; i++)
				{
					tekstgr.visCD(array[i]);
				}
				break;
			case 4:
				tekstgr.skrivUtStatistikk(cda);
				break;
			default: 
				System.out.println("Ugyldig valg");
			}
		}
	}
	
}
