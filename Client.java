import java.util.Observer;

public class Client {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Compteur compteur = new Compteur(0);
		Observer binary = new DispositifBinaire(compteur);
		Observer octal = new DispositifOctal(compteur);
		Observer hexa = new DispositifHexa(compteur);
		Thread thread = new Thread(compteur);
		thread.start();
	}

}
