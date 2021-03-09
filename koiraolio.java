class Koira
{
  int ika;
  String nimi, rotu, aani;



  // muodostin
	public Koira(int uusi_ika, String uusi_nimi, String uusi_rotu, String uusi_aani) {
		ika = uusi_ika;
		nimi = uusi_nimi;
		rotu = uusi_rotu;
		aani = uusi_aani;
	}
	// metodi tulosta_tiedot()
	public void tulosta_tiedot() {
		System.out.print( 
"Nimi: " + this.nimi + "\nIkä: " + this.ika + "\nRotu: " + this.rotu);
	}
  // metodi annaAani() 
	public String annaAani() {
		return aani;
	}
  
  public class KoiranTesti
{
  public static void main(String[] args)
  {
    Koira rekku = new Koira (2, "Rekku", "Dalmatialainen", "Hau!!!");
    System.out.println("Koiran tiedot:");
    rekku.tulosta_tiedot();
    System.out.println("\nKoira sanoo: " +rekku.annaAani());
  }
}
