import java.io.*;

public class Tunnit {
  public static void main(String[] args)
  {
    int paiva, x = 0;
	double tunnit[] = new double [30], yhteensa = 0, karvo, tunti;
	
    
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("Ohjelma laskee yhteen haluamasi ajanjakson aikana"+"\n"+
"tehdyt työtunnit sekä keskimääräisen työpäivän pituuden.\n\n");
	
	try {
		System.out.print("Kuinka monta päivää:");
		paiva = Integer.parseInt(in.readLine());
		
		for (int i = 1; i <= paiva; i++) {
			System.out.print("Anna " + i + ". päivän työtunnit:");
			tunti = Double.parseDouble(in.readLine());
			tunnit[x] = tunti;
			x++;
			yhteensa += tunti;
		}
		
		karvo = yhteensa / paiva;
		
		System.out.print("\nTehdyt työtunnit yhteensä: " + yhteensa + "\n" +
"Keskimääräinen työpäivän pituus: " + karvo + "\n" +
"Syötetyt tunnit: ");
		for (int i = 0; i < paiva; i++) {
			System.out.print(tunnit[i] + " ");
		}
	} catch (Exception e) {
		System.out.print(e);
	}
  }
}
