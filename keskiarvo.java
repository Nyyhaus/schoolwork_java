import java.io.*;

public class Keskiarvo {
  public static void main(String[] args)
  {
    int luku, i = 0;
	double yhteensa = 0;
	double keskiarvo;
    
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	try {
		System.out.print("Ohjelma laskee syötettyjen arvosanojen keskiarvon.\nLopetus negatiivisella kokonaisluvulla.\n");
			
		do {
			System.out.print("Anna arvosana (4-10):");
			luku = Integer.parseInt(in.readLine());
			if (luku > 3) {
				yhteensa += luku;
				i++;
			} else
				break;
		} while (luku > 3);
		
		keskiarvo = yhteensa / i;
		System.out.print("Ohjelmaan syötetty " + i + " arvosanaa.");
		System.out.print("Arvosanojen keskiarvo: " + keskiarvo);
		
	} catch (Exception e) {
		System.out.print(e);
	}
  }
}
