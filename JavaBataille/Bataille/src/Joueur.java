import java.util.ArrayList;
import java.util.List;

public class Joueur {
   
    private List<Carte> cartes;
    private int score;


   public Joueur() {
        cartes = new ArrayList<>();
        score = 0;
    }

    public void ajouterCarte(Carte carte) {
        cartes.add(carte);
    }

    public Carte jouerCarte() {
        
        if (!cartes.isEmpty()) {
            Carte carte = cartes.remove(0);
            return carte;
        } else {
            return null;
        }
    }

    public int getScore() {
        return score;
    }

    public void incrémenterScore() {
        score++;
    }
}