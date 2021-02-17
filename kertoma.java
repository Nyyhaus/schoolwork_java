import java.io.*;

public class Kertoma {
  public static void main(String[] args)
  {
    int luku, i, kertoma = 1;
    
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	try {
		System.out.print("Anna kokonaisluku:");
		luku = Integer.parseInt(in.readLine());
		
		for (i = 1; i <= luku; i++) {
			kertoma *= i;
		}
		
		System.out.print("Luvun " + luku + " kertoma on " + kertoma);
		
	} catch (Exception e) {
		System.out.print(e);
	}
  }
}
