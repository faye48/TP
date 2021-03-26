package sn.isi.traitement;

import sn.isi.entities.Medecin;
import sn.isi.entities.MedecinChef;

public class ImpIMedecin implements IMedecin{
    @Override
    public void saisie() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("--------------------- --MENU---------------------------------------------");
        System.out.println("-------------------1 -MedecinChef--------------------------------------------");
        System.out.println("-------------------2-MedecinSpecialiste--------------------------------------");
        System.out.println("--------------------3-MedecinGenerale-------------------------------------------");
        System.out.println("********************************************************************************");
switch (3){
    case 1:
        Medecin m=null;
        System.out.println("entrer l'id");
        System.out.println("entrer le nom");
        System.out.println("entrer le prenom");
        System.out.println("entrer le nomserv");
        System.out.println("entrer l'idserv");
}
    }

    @Override
    public void affiche() {

        }



}
