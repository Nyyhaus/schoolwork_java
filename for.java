import java.io.*;

public class Silmukka {
  public static void main(String[] args)
  {
    int luku, i;
    
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	try {
		System.out.print("Anna kokonaisluku:");
		luku = Integer.parseInt(in.readLine());
		
		for (i = 1; i <= luku; i++) {
			System.out.print(i + "\n");
		}
	} catch (Exception e) {
		System.out.print(e);
	}
  }
}
