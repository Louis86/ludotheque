public class Jeu {

    private long idJeu;
    private String nom;
    private boolean statut;
    private String fabricant;
    private String categorie;


    public long getIdJeu() {
        return idJeu;
    }

    public void setIdJeu(long idJeu) {
        this.idJeu = idJeu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Jeu(long idJeu, String nom, boolean statut, String fabricant, String categorie) {
        this.idJeu = idJeu;
        this.nom = nom;
        this.statut = statut;
        this.fabricant = fabricant;
        this.categorie = categorie;
    }

}
