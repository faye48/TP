package sn.isi.entities;


public class MedecinGeneraliste extends Medecin{
    private  String listeSpecilistes;

    public String getListeSpecilistes() {
        return listeSpecilistes;
    }

    public void setListeSpecilistes(String listeSpecilistes) {
        this.listeSpecilistes = listeSpecilistes;
    }

    public MedecinGeneraliste(){
        super();
    }

    public MedecinGeneraliste(int id, String prenom, String nom, String listeSpecilistes) {
        super(id, prenom, nom);
        this.listeSpecilistes = listeSpecilistes;
    }
}
