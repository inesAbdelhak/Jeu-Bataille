import java.util.Arrays;

public class Carte{

    public static String[] couleur ={"pique","coeur","trefle","carreau"};
    public static String[] valeur ={"2","3","4","5","6","7","8","9","10","as","vale","dame","roi"};
    private String Couleur;
    private String Valeur;


    public Carte(String Unecouleur, String Unevaleur) {
        this.Couleur=Unecouleur;
        this.Valeur=Unevaleur;
        if (Arrays.asList(couleur).contains(Unecouleur) && Arrays.asList(valeur).contains(Unevaleur)) {
            this.Couleur = Unecouleur;
            this.Valeur = Unevaleur;
        } else {
            throw new IllegalArgumentException("Couleur ou valeur de carte invalide.");
        }
    }
    




public String getCouleur(){
    return (this.Couleur);
}

public String getValeur(){
    return (this.Valeur);
}

public void setValeur(String UneValeur){
this.Valeur=UneValeur;
}

public void setCouleur(String UneCouleur){
    this.Couleur=UneCouleur;
}


public boolean Compare(Carte carte) {
    if (this.Valeur.equals("as")) {
        return true;
    }
    if (carte.getValeur().equals("as")) {
        return false; 
    }
    int valeurJoueur1 = Arrays.asList(Carte.valeur).indexOf(this.Valeur);
    int valeurJoueur2 = Arrays.asList(Carte.valeur).indexOf(carte.getValeur());

    return valeurJoueur1 > valeurJoueur2;
}






}

