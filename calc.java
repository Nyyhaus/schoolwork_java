import java.io.*;

public class Laskenta {
	public static void main(String[] args) {
		int x, y, summa, erotus, tulo, jakojaannos, valinta;
		int osamaara;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Käytössäsi on seuraavat laskutoimitukset:\n1: vähennyslasku\n2: yhteenlasku\n3: kertolasku\n4: osamäärä\n5: jakojäännös\n");
			
			System.out.print("Valitse laskutoimitus:");
			valinta = Integer.parseInt(in.readLine());
			
			System.out.print("Anna eka luku:");
			x = Integer.parseInt(in.readLine());
			
			System.out.print("Anna toka luku:");
			y = Integer.parseInt(in.readLine());
			
			switch (valinta) {
				case 1:
					erotus = x - y;
					System.out.print(x + "-" + y + " = " + erotus);
					break;
				case 2:
					summa = x + y;
					System.out.print(x + "+" + y + " = " + summa);
					break;
				case 3:
					tulo = x * y;
					System.out.print(x + "*" + y + " = " + tulo);
					break;
				case 4:
					osamaara = x / y;
					System.out.print(x + "/" + y + " = " + osamaara);
					break;
				case 5:
					jakojaannos = x % y;
					System.out.print(x + "%" + y + " = " + jakojaannos);
					break;
			}
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
