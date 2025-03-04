package personnages;

public class Romain {
	
	private String nom;
	private int force;
	
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		assert force > 0 : "La force d'un Romain doit être positive.";
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "La force du Romain est positive.";
		int ancienneForce = force;
		if (force > 0) {
			force -= forceCoup;
			assert ancienneForce < force : "La force du Romain a diminué."; 
			if (force > 0) {
				parler("Aie");
			} else {
				parler("J'abandonne !");
			}
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
	}
}
