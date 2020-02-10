package assemblage;

import jeux.crazy.AppliCrazy;
import jeux.devinettes.AppliDevinettes;
import jeux.intrus.AppliIntrus;
import jeux.suites.AppliSuite;

public class Appli {
	public static void main(String[] args) {
		Jeu j1 = new AppliCrazy();
		Jeu j2 = new AppliIntrus();
		Jeu j3 = new AppliDevinettes();
		Jeu a1 = new GagneLesDeux(j1,j2);
		Jeu a2 = new GagneMaxEssai(a1, 3);
		Jeu a3 = new GagneAuMoinsUn(a2,j3);
		a3.main(null);
		System.out.println(a3.getNom());
	}
}
