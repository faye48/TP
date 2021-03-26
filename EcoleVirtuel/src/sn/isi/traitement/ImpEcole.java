package sn.isi.traitement;

import java.util.ArrayList;
import java.util.List;

public class ImpEcole<T> implements IEcole <T>{

    @Override
    public void saisie(Object o) {
        System.out.println("entre L'id de l'ecole");
        System.out.println("entre Le nom  de l'ecole");
        System.out.println("entre L'specialite");

    }

    @Override
    public void affichageSpecialites() {

    }

    @Override
    public void affichageEcoles() {

    }
}
