import java.io.*;

public class Tulostus {
	public static void main(String[] args) {
		int ika;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Oletko mies vai nainen (m/n)?");
			String spuoli = in.readLine();
			
			char s = spuoli.charAt(0);
			
			System.out.print("Anna ikäsi:");
			ika = Integer.parseInt(in.readLine());
			
			if (s == 'm') {
				if (ika < 56)
					System.out.print("Olet mies parhaassa iässä!");
				else if (ika > 55 && ika < 101)
					System.out.print("Olet viisas mies!");
				else 
					System.out.print("Ohjelmassa tapahtunut virhe!");
			} else {
				if (ika < 56)
					System.out.print("Olet neito kauneimmillaan!");
				else if (ika > 55 && ika < 101)
					System.out.print("Olet nuori ikäiseksesi!");
				else
					System.out.print("Ohjelmassa tapahtunut virhe!");

			}
		} catch (Exception e) {
			System.out.print("Ohjelmassa tapahtunut virhe!");
		}
	}
}
