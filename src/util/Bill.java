package util;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	
	public  double feeding() {
		int totBeer = beer * 5;
		int totBarb = barbecue * 7;
		int totSof = softDrink * 3;
		return totBeer + totBarb + totSof;
	}

	public  double cover() {
		double couvert;
			if (feeding() > 30) {
				couvert = 0.0;
			}
			else {
				couvert = 4.0;
			}
		return couvert;
}
	
	public  double ticket() {
		double tick;
			if (gender == 'F') {
				tick = 8.0;
			} else {
				tick = 10.0;
			}
		return tick;
	}
	
	public  double total() {
		return feeding() + cover() + ticket();
		
	}
}