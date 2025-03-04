package personnages;

import personnages.Gaulois;

public class Village {

	private String nom;
	private Gaulois[] villageois;
	private int nbVillageois;
	private Gaulois chef;
	
	public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMaximum]; 
        this.nbVillageois = 0;
        this.chef = null;
    }

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois ++;
			System.out.println(gaulois.getNom() + " a rejoint le village !");
		} else {
			System.out.println(" Le village est plein, impossible d'ajouter un nouveau villageois.");
		}
	}
	
	public Gaulois trouverVillageois(int position) {
		if (position >= 0 && position < nbVillageois) {
			return villageois[position];
		} else {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
	}
	
	public void ajouterChef(Gaulois gaulois) {
        if (this.chef == null) {
            this.chef = gaulois;
            ajouterVillageois(gaulois);
            System.out.println(gaulois.getNom() + " a été nommé chef du village !");
        } else {
            System.out.println("Le village a déjà un chef !");
        }
    }
	
	public void afficherVillageois() {
		System.out.println("Dans le village \" " + getNom() + " \" du chef " + getChef() + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			if (villageois[i] != null) {
				System.out.println("- " + villageois[i].getNom());
			}
		}
	}
	
	public static void main(String[] args) {
		Village irreductible = new Village("Village des Irréductibles", 30);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		irreductible.ajouterChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		irreductible.ajouterVillageois(asterix);
		Gaulois obelix = new Gaulois("Obélix", 25);
		irreductible.ajouterVillageois(obelix);
	
		irreductible.afficherVillageois();
	}
	
}
