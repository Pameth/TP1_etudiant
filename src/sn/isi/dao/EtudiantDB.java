package sn.isi.dao;

import sn.isi.entities.Etudiant;

import java.util.Scanner;

public class EtudiantDB {
    public void MessageBase (){

        Db db = new Db();
        Etudiant et = new Etudiant();
        db.Affichage();
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer le matricule :");
        et.setMat(sc.nextLine());
        System.out.println("Entrer le nom :");
        et.setNom(sc.nextLine());
        System.out.println("Entrer le prenom :");
        et.setPrenom(sc.nextLine());

        System.out.println("Etudiant crée !");

        System.out.println("Le matricule est: "+et.getMat());
        System.out.println("le nom est: "+et.getNom());
        System.out.println("le prenom est: "+et.getPrenom());
    }
}
