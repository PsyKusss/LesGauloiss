package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import objets.Chaudron;

public class TestGaulois {
	
	public static void main(String[] args) {
		
		Chaudron chaudron = new Chaudron(5);
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 16);
        Romain minus = new Romain("Minus", 6);
        Romain brutus = new Romain("Brutus", 14);
        Druide panoramix = new Druide("Panoramix", 3, chaudron);
        
        asterix.parler("Bonjour Obélix.");
        obelix.parler("Bonjour Astérix. Ça te dirais d'aller chasser des sangliers ?)");
        asterix.parler("Oui très bonne idée.");
        
        System.out.println("Dans la forêt " + asterix + " et " + obelix + " tombent nez à nez sur le romain " + minus.getNom() + ".");
        for (int i = 0; i < 3; i++) {
        	asterix.frapper(minus);
        }
        
        panoramix.fabriquerPotion(4);
        panoramix.boosterGaulois(obelix);
        panoramix.boosterGaulois(asterix);
        for (int i = 0; i < 3; i++) {
        	asterix.frapper(brutus);
        }
	}
}
