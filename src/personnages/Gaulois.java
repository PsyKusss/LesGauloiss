package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 3;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	@Override
    public String toString() {
		return nom;
    }
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force * effetPotion) / 3);
		effetPotion = Math.max(1, effetPotion - 1);
	}
	
	public void boirePotion(int puissance) {
		if (puissance > 1) {
            effetPotion = puissance;
            parler("Merci Druide, ma force est maintenant multipliée par " + effetPotion + "!");
        } else {
            parler("Cette potion n'a aucun effet sur moi.");
        }
    }
}
