package no.hvl.data102;

public class CD {

	
	// Instantsvariabler	
	private int cdNr, �r;
	private String navn, tittel, plateSelskap;
	private Sjanger sjanger;
	
	
	// Konstrukt�rer
	public CD() 
	{
	}
	
	// Mulighet for at cdNr skal v�re automatisk?
	public CD(int cdNr, String navn, String tittel, int �r, Sjanger sjanger, String plateSelskap)
	{
		this.cdNr = cdNr;
		this.navn = navn;
		this.tittel = tittel;
		this.�r = �r;
		this.sjanger = sjanger;
		this.plateSelskap = plateSelskap;
	} 
		

	
	// Get metoder
	
	public int getCdNr() {
		return this.cdNr;
	}
	
	public String getNavn() {
		return this.navn;
	}
	
	public String getTittel() {
		return this.tittel;
	}
	
	public int get�r() {
		return this.�r;
	}
	
	public Sjanger getSjanger() {
		return this.sjanger;
	}
	
	public String getPlateSelskap() {
		return this.plateSelskap;
	}
	
	
	// Set metoder
	
	public void setCdNr(int cdNr) {
		this.cdNr = cdNr;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public void setTittel(String tittel) {
		this.tittel = tittel;
	}
	
	public void set�r(int �r) {
		this.�r = �r;
	}
	
	public void setSjanger (Sjanger sjanger){
		this.sjanger = sjanger;
	}
	
	public void setPlateSelskap(String plateSelskap) {
		this.plateSelskap = plateSelskap;
	}
	
	

} // class
