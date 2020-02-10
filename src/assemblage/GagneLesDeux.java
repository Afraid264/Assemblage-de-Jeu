package assemblage;

import java.util.LinkedList;

public class GagneLesDeux implements Jeu{
	private Jeu j1;
	private Jeu j2;
	private LinkedList<String> resultat;
	
	public GagneLesDeux(Jeu j1, Jeu j2) {
		this.j1 = j1;
		this.j2 = j2;
		this.resultat = new LinkedList<>();
	}
	@Override
	public boolean main(String[] args) {
		if (args != null) {
			String[] arg0 = {args[0]};
			String[] arg1 = {args[1]};
			if (j1.main(arg0)) {
				if (j1.getNBJeu() == 1)
					resultat.add(j1.getNom() + " : gagné");
				else
					resultat.add(j1.getNom());
				if (j2.main(arg1)) {
					if (j2.getNBJeu() == 1)
						resultat.add(j2.getNom() + " : gagné");
					else
						resultat.add(j2.getNom());
					return true;
				}
				else {
					if (j2.getNBJeu() == 1)
						resultat.add(j2.getNom() + " : perdu");
					else
						resultat.add(j2.getNom());
					return false;
				}
					
			}
			if (j1.getNBJeu() == 1)
				resultat.add(j1.getNom() + " : perdu");
			else
				resultat.add(j1.getNom());
			return false;
		}
		else {
			if (j1.main(args)) {
				if (j1.getNBJeu() == 1)
					resultat.add(j1.getNom() + " : gagné");
				else
					resultat.add(j1.getNom());
				if (j2.main(args)) {
					if (j2.getNBJeu() == 1)
						resultat.add(j2.getNom() + " : gagné");
					else
						resultat.add(j2.getNom());
					return true;
				}
				else {
					if (j2.getNBJeu() == 1)
						resultat.add(j2.getNom() + " : perdu");
					else
						resultat.add(j2.getNom());
					return false;
				}
			}
			if (j1.getNBJeu() == 1)
				resultat.add(j1.getNom() + " : perdu");
			else
				resultat.add(j1.getNom());
			return false;
		}
		
	}
	@Override
	public String getNom() {
		StringBuilder sb = new StringBuilder();
		for(String s : resultat) {
			sb.append(s + "\n");
		}
		return sb.toString();
	}
	@Override
	public int getNBJeu() {
		return j1.getNBJeu() + j2.getNBJeu();
	}

}
