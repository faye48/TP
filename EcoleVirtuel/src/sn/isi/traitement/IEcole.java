package sn.isi.traitement;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialiste;

public interface IEcole <T>{
  void saisie(T t);
    void affichageSpecialites();
    void affichageEcoles();

}