package personnages;

public class Romain {
	
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	
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
	
	public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 2:
            	System.out.println("Le soldat " + nom + " est déjà bien protégé !");
                break;
            case 1:
                if (equipements[0] == equipement) {
                	System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
                } else {
                    ajouterEquipement(equipement);
                }
                break;
            default:
                ajouterEquipement(equipement);
                break;
        }
    }
	
	private void ajouterEquipement(Equipement equipement) {
        equipements[nbEquipement] = equipement;
        nbEquipement++;
        System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
    }
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}
