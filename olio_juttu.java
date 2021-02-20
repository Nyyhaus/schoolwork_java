import java.io.*;

public class PaaOhjelma
{
    public static void main(String args[])
    {
        Tulostaja olio = new Tulostaja();
        olio.Tulosta();
    }
}
class Tulostaja {
	int eka, toka, summa;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public void Tulosta () {
		try {
			System.out.print("Syötä ensimmäinen kokonaisluku: ");
			eka = Integer.parseInt(in.readLine());

			System.out.print("Syötä toinen kokonaisluku: ");
			toka = Integer.parseInt(in.readLine());
			
			Laskin olio = new Laskin();

			summa = olio.Summa(eka, toka);

			System.out.print("Lukujen summa: " + summa);
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}

class Laskin
{
    static int Summa(int eka, int toka)
    {
        int summa = eka + toka;
        return summa;
    }
}
