import java.util.*;

public class Adherent extends Personne {


    private Date inscription;
    private String typeAbonnement;
    private Date finAbonnement;


    public Date getInscription() {
        return inscription;
    }

    public void setInscription(Date inscription) {
        this.inscription = inscription;
    }

    public String getTypeAbonnement() {
        return typeAbonnement;
    }

    public void setTypeAbonnement(String typeAbonnement) {
        this.typeAbonnement = typeAbonnement;
    }

    public Date getFinAbonnement() {
        return finAbonnement;
    }

    public void setFinAbonnement(Date finAbonnement) {
        this.finAbonnement = finAbonnement;
    }


    public Adherent(long matricule, String nom, String prenom) {
        super(matricule, nom, prenom);
    }


    public void emprunterJeu(){}

    public void restituerJeu(){}
}
