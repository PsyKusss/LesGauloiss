package objets;

public class Chaudron {
	
    private int quantitePotion;

    public Chaudron(int quantitePotion) {
        this.quantitePotion = quantitePotion;
    }
    
    public boolean resterPotion() {
    	return quantitePotion > 0;
    }
    
    public void remplirChaudron(int quantite) {
    	quantitePotion += quantite;
    }
    
    public void prendreLouche() {
    	if (quantitePotion > 0) {
    		quantitePotion--;
    	}
    }
}
