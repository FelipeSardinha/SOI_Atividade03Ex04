package view;
import controller.Threads;
public class Principal {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i ++) {
			Threads sapo = new Threads(i);
				sapo.start();
		}
	}
}