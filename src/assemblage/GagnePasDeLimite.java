package assemblage;

import java.util.LinkedList;

public class GagnePasDeLimite implements Jeu{
	private Jeu j1;
	private LinkedList<String> resultat;
	private int essai;
	
	public GagnePasDeLimite(Jeu j1) {
		this.j1 = j1;
		this.resultat = new LinkedList<>();
		this.essai = 0;
	}
	@Override
	public boolean main(String[] args) {
		essai = 0;
		while(!j1.main(args)) {
			if (getNBJeu() == 1)
				resultat.add(j1.getNom() + " : perdu");
			else
				resultat.add(j1.getNom());
			essai++;
		}
		if (getNBJeu() == 1)
			resultat.add(j1.getNom() + " : gagné");
		else
			resultat.add(j1.getNom());
		return true;
	}
	@Override
	public String getNom() {
		StringBuilder sb = new StringBuilder();
		for(String s : resultat) {
			sb.append(s + "\n");
		}
		if (getNBJeu() > 1) {
			return resultat.get(essai);
		}
		else
			return sb.toString();
	}
	@Override
	public int getNBJeu() {
		return j1.getNBJeu();
	}
}
