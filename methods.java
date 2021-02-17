	public static int suurin(int x, int y, int z) {
		if (x > y && x > z)
			return x;
		else if (y > z && y > x)
			return y;
		else
			return z;
	}
	public static int pienin(int x, int y, int z) {
		if (x < y && x < z)
			return x;
		else if (y < z && y < x)
			return y;
		else
			return z;
	}
