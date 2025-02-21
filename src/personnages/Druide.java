package personnages;
import objets.Chaudron;

public class Druide {
	
	private String nom;
    private int forcePotion;
    private Chaudron chaudron;

    public Druide(String nom, int forcePotion, Chaudron chaudron) {
        this.nom = nom;
        this.forcePotion = forcePotion;
        this.chaudron = chaudron;
    }
    
    public String getNom() {
		return nom;
	}
	
	public int getForcePotion() {
		return forcePotion;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite) {
		chaudron.remplirChaudron(quantite);
        parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + getForcePotion() + ".");
    }
	
	public void boosterGaulois(Gaulois gaulois) {
		if (gaulois.getNom().equals("Obélix")) {
			parler("Non, Obélix Non !... Et tu le sais très bien !");
		} else if (chaudron.resterPotion()) {
			chaudron.prendreLouche();
			parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
			gaulois.boirePotion(getForcePotion());
		} else {
			parler("Désolé, il ne reste plus de potion.");
		}
	}
}
