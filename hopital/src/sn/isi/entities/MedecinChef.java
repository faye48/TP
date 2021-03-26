package sn.isi.entities;

public class MedecinChef extends Medecin{
    private String bureau;

    public MedecinChef(int id, String prenom, String nom, String bureau) {
        super(id, prenom, nom);
        this.bureau = bureau;
    }

    public MedecinChef(){
        super();
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }
}
