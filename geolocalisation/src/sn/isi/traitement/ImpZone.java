package sn.isi.traitement;

import sn.isi.entities.Zone;

import java.util.*;

public class ImpZone<T>implements IZone<T> {
    @Override
    public void saisie(T Zone) {
       System.out.println("entrer l'id du zone");
       System.out.println("entrer le nom du zone");
       System.out.println("entrer le nom du zone");
       System.out.println("entrer latitude du zone");
       System.out.println("entrer longitude du zone");


    }

    @Override
    public void affiche(Zone zone) {
        List<String>tch=new ArrayList<>();
        System.out.println("l'id est:+tch.id");
        System.out.println("le nom est:+tch.nom");
        System.out.println("latitude est:+tch.latitude");
        System.out.println("longitude est:+tch.longitude");
    }
}
