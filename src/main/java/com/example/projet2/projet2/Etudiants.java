package com.example.projet2.projet2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etudiants {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String num_etudiant;
    private String nom_matiere;
    private int note;

    public Etudiants(String num_etudiant, String nom_matiere, int note) {
        this.id = id;
        this.num_etudiant = num_etudiant;
        this.nom_matiere = nom_matiere;
        this.note = note;
    }

    public Etudiants(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum_etudiant() {
        return num_etudiant;
    }

    public void setNum_etudiant(String num_etudiant) {
        this.num_etudiant = num_etudiant;
    }

    public String getNom_matiere() {
        return nom_matiere;
    }

    public void setNom_matiere(String nom_matiere) {
        this.nom_matiere = nom_matiere;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}