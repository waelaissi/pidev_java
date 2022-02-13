/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author Firas CHKOUNDALI
 */
public class Sujet {
    private int idsujet;
    private String titresujet;
    private String contenu;
    private String date;
    private int accepter;
    private int nbcom;
    private int iduser;
    
    
    public Sujet() {
    }

    public Sujet(String titresujet, String contenu, String date, int accepter, int nbcom, int iduser) {
        this.titresujet = titresujet;
        this.contenu = contenu;
        this.date = date;
        this.accepter = accepter;
        this.nbcom = nbcom;
        this.iduser = iduser;
    }

    public Sujet(int idsujet, String titresujet, String contenu, String date, int accepter, int nbcom, int iduser) {
        this.idsujet = idsujet;
        this.titresujet = titresujet;
        this.contenu = contenu;
        this.date = date;
        this.accepter = accepter;
        this.nbcom = nbcom;
        this.iduser = iduser;
    }
    public int getIdsujet() {
        return idsujet;
    }

    public String getTitresujet() {
        return titresujet;
    }

    public String getContenu() {
        return contenu;
    }

    public String getDate() {
        return date;
    }

    public int isAccepter() {
        return accepter;
    }

    public int getNbcom() {
        return nbcom;
    }

    public int getIduser() {
        return iduser;
    }

    public void setTitresujet(String titresujet) {
        this.titresujet = titresujet;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAccepter(int accepter) {
        this.accepter = accepter;
    }

    public void setNbcom(int nbcom) {
        this.nbcom = nbcom;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    @Override
    public String toString() {
//        String Saccepter;
//        if(accepter==0)
//            Saccepter="Non";
//        else 
//            Saccepter="Oui";
        return "Sujet{" + "idsujet=" + idsujet + ", titresujet=" + titresujet + ", contenu=" + contenu + ", date=" + date + ", accepter=" + accepter + ", nbcom=" + nbcom + ", iduser=" + iduser + '}';
    }

    
}
