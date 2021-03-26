package sn.isi.entities;

public class Produit {
    private String ref;
    private String nom;
    private String userUser;

    public Produit() {
    }

    public Produit(String ref, String nom, String userUser) {
        this.ref = ref;
        this.nom = nom;
        this.userUser = userUser;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUserUser() {
        return userUser;
    }

    public void setUserUser(String userUser) {
        this.userUser = userUser;
    }
}
