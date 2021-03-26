package sn.isi.dao;

import sn.isi.entities.Produit;

public class ProduitIMp implements IProduit{
    @Override
    public void addpro() {
        System.out.println("entrer le nom du produit");
        System.out.println("entrer la reference du produit");

    }

    @Override
    public void deletepro() {
        Produit p= new Produit();
       System.out.println("le nom du produit supprimer est:"+p.getNom());
    }

    @Override
    public void updatepro() {
Produit p= new Produit();
p.getNom();
p.getRef();
p.getUserUser();
    }
}
