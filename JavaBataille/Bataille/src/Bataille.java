import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bataille {
    public static void main(String[] args) throws Exception {
        
        List<Carte> paquetDeCartes = new ArrayList<>();
        for (String c : Carte.couleur) {
            for (String v : Carte.valeur) {
                paquetDeCartes.add(new Carte(c, v));
            }
      }
        Collections.shuffle(paquetDeCartes);

        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur();

        for (int i = 0; i < 26; i++) {
            joueur1.ajouterCarte(paquetDeCartes.get(i));
            joueur2.ajouterCarte(paquetDeCartes.get(i + 26));
        }

        int tour = 0;
        while (!paquetDeCartes.isEmpty()){
            tour++;
            Carte carteJoueur1 = joueur1.jouerCarte();
            Carte carteJoueur2 = joueur2.jouerCarte();


            if (carteJoueur1.Compare(carteJoueur2)) {
            joueur1.incrémenterScore();
            System.out.println("Tour " + tour + ": Joueur 1 gagne ce tour!");
             } 
            else if (carteJoueur2.Compare(carteJoueur1)) {
                 joueur2.incrémenterScore();
                 System.out.println("Tour " + tour + ": Joueur 2 gagne ce tour!");
             } 
            else {
                System.out.println("Tour " + tour + ": Égalité!");
             }

            System.out.println("Cartes jouées : Joueur 1 - " + carteJoueur1.getCouleur() + " " + carteJoueur1.getValeur());
            System.out.println("Joueur 2 - " + carteJoueur2.getCouleur() + " " + carteJoueur2.getValeur());
            paquetDeCartes.remove(carteJoueur1);
            paquetDeCartes.remove(carteJoueur2);

        }


        if (joueur1.getScore() > joueur2.getScore()) {
            System.out.println("Joueur 1 remporte la partie avec un score de " + joueur1.getScore());
        } 
        else if (joueur1.getScore() < joueur2.getScore()) {
            System.out.println("Joueur 2 remporte la partie avec un score de " + joueur2.getScore());
        } 
        else {
            System.out.println("La partie se termine par une égalité !");
        }
         
    }
}
       



