package beans;

public class Personne {

    public Personne( String nom, String prenom ) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    private final String nom;
    private final String prenom;

}
