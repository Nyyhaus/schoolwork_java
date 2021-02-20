import java.io.*;

public class eka
{
    public static void main(String args[])
    {
        String merkkijono = "Anna merkkijono, jonka tulostan: ";
        KysyJaTulosta olio = new KysyJaTulosta();
        olio.teeHommasi(merkkijono);
    }
}
class KysyJaTulosta {
	public static void teeHommasi(String merkkijono) {
		String syote;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println(merkkijono);
			syote = in.readLine();
			System.out.println(syote);
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
