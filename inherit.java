import java.io.*;

class Ajoneuvo{

    private int paino;
    private int huippunopeus;
    private int ajetut_kilometrit;

    Ajoneuvo(int paino, int huippunopeus, int ajetut_kilometrit){
        this.paino = paino;
        this.huippunopeus = huippunopeus;
        this.ajetut_kilometrit = ajetut_kilometrit;
    }

    protected void aja(int ajettava_matka){
        this.ajetut_kilometrit += ajettava_matka;
    }

    protected int anna_paino(){
        return this.paino;
    }

    protected int anna_huippunopeus(){
        return this.huippunopeus;
    }

   protected int anna_ajetut_kilometrit(){
        return this.ajetut_kilometrit;
    }
}

class Auto extends Ajoneuvo
{
	String merkki;
	String malli;
	String rekisteri_nro;
	boolean kaynnissa;
	Auto(int paino, int nopeus, int km, String merkki, String malli, 
	String rekkari, boolean kaynnissa)
	{
		super(paino, nopeus, km);
		this.merkki = merkki;
		this.malli = malli;
		this.rekisteri_nro = rekkari;
		this.kaynnissa = kaynnissa;
	}
	// kaynnista(), joka muuttaa kaynnissa-muuttujan arvoksi "true"
	void kaynnista()
	{
		this.kaynnissa = true;
	}
	// sammuta(), joka muuttaa käynnissä-muuttujan arvoksi "false"
	void sammuta()
	{
		this.kaynnissa = false;
	}
	//katsasta(), joka tulostaa auton tiedot esimerkkitulostuksen mukaisesti.
	void katsasta()
	{
		System.out.print("Auton tiedot:\nMerkki: "+this.merkki+
"\nMalli: "+this.malli+"\nAjokilometrit: "+anna_ajetut_kilometrit()+
"\nPaino (kg): "+anna_paino()+"\nHuippunopeus (km/h): "+anna_huippunopeus()+
"\nRekisterinumero: "+this.rekisteri_nro+"\n");
		if (this.kaynnissa == true)
		{
			System.out.println("Auto on käynnissä");
		}
		else
		{
			System.out.println("Auto ei ole käynnissä");
		}
	}
}

public class Autoilua
{
   public static void main(String[] args)
   {

      BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));
      int paino, nopeus, km;
      String merkki, malli, rekkari;
      try
      {
         System.out.println("Anna auton merkki:");
         merkki = lukija.readLine();
         System.out.println("Anna auton malli:");
         malli = lukija.readLine();
         System.out.println("Anna auton rekisterinumero:");
         rekkari = lukija.readLine();
         System.out.println("Anna auton paino:");
         paino = Integer.parseInt(lukija.readLine());
         System.out.println("Anna auton huippunopeus:");
         nopeus = Integer.parseInt(lukija.readLine());
         System.out.println("Anna autolla ajetut kilometrit:");
         km = Integer.parseInt(lukija.readLine());
         System.out.println("\n");

         Auto autoX = new Auto(paino, nopeus, km, merkki, malli, rekkari, false);

         autoX.katsasta();
         autoX.kaynnista();
         autoX.aja(95);
         System.out.print("\n\n");

         autoX.katsasta();
      }
      catch (Exception e)
      {
         System.out.println("Virhetilanne!");
      }
   }
}
