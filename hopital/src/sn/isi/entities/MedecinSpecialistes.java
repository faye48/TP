package sn.isi.entities;

public class MedecinSpecialistes  extends Medecin{
    private  String specialiste;

    public String getSpecialiste() {
        return specialiste;
    }

    public void setSpecialiste(String specialiste) {
        this.specialiste = specialiste;
    }

    public  MedecinSpecialistes(){
        super();
    }

    public MedecinSpecialistes(int id, String prenom, String nom, String specialiste) {
        super(id, prenom, nom);
        this.specialiste = specialiste;
    }
}
