package controller;

public class Threads extends Thread {
	private static int pos = 1;
	private int sapo;

	public Threads(int sapo) {
		this.sapo = sapo;
	}
	
	public void run() {
		
		for (int km = 0; km < 101; km ++) {
			if (km == 0) {
				km = (int) (Math.random() * (20 - 1) + 1);
				
			}
			else {
				System.out.println("O sapo " + sapo + " já percorreu " + km + " metros.");
				km = km + (int) (Math.random() * (20 - 1) + 1);
			}
		}
		System.out.println("O sapo " + sapo + " percorreu os 100 metros e ficou em " + (pos) + "°");
		pos ++;
	}
}