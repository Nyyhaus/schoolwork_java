public static void tulosta_matriisi(int[][] matriisi) {
	for (int y = 0; y < 5; y++) {
		for (int x = 0; x < 5; x++) {
			if (x == 4) {
				System.out.println(matriisi[y][x]);
			} else {
				System.out.print(matriisi[y][x] + "\t");
			}
		}
	}
}

public static int laske_summa(int[][] matriisi) {
	int summa = 0;
	for (int y = 0; y < 5; y++) {
		for (int x = 0; x < 5; x++) {
			summa += matriisi[y][x];
		}
	}
	return summa;
}
