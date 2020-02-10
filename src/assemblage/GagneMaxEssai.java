package assemblage;

import java.util.LinkedList;

public class GagneMaxEssai implements Jeu{
	private Jeu j1;
	private int maxEssai = 5;
	private LinkedList<String> resultat;
	private int essai;

	
	public GagneMaxEssai(Jeu j1, int n) {
		this.j1 = j1;
		this.maxEssai = n;
		this.resultat = new LinkedList<>();
		this.essai = 0;
	}
	@Override
	public boolean main(String[] args) {
		boolean gagne = false;
		essai = 0;
		while (!gagne && essai < maxEssai) {
			gagne = j1.main(args);
			if (getNBJeu() == 1) {
				if (gagne)
					resultat.add(j1.getNom() + " : gagné");
				else
					resultat.add(j1.getNom() + " : perdu");
			}
			else
				resultat.add(j1.getNom());
			essai++;
		}
		return gagne;
	}
	@Override
	public String getNom() {
		StringBuilder sb = new StringBuilder();
		for(String s : resultat) {
			sb.append(s + "\n");
		}
		if (getNBJeu() > 1) {
			return resultat.get(essai - 1);
		}
		else {
			return sb.toString();
		}
	}
	@Override
	public int getNBJeu() {
		return j1.getNBJeu();
	}
}
