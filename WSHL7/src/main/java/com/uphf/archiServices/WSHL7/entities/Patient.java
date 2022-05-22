package com.uphf.archiServices.WSHL7.entities;

import javax.persistence.*;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String ipp;//id perm patient

    @Column(nullable = false)
    private String nom;

    @Column
    private String nommar;// nom marital

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false)
    private String ddn;// date de naissance

    @Column(nullable = false)
    private String intit; //intitule / civilite

    @Column(nullable = false)
    private String sexe;

    @Column
    private String iep;//id entree patient

    @Column
    private String adr1;

    @Column
    private String adr2;

    @Column
    private String cp;

    @Column
    private String ville;

    @Column
    private String pays;

    @Column
    private String tel;

    @Column
    private String paysn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIpp() {
        return ipp;
    }

    public void setIpp(String ipp) {
        this.ipp = ipp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNommar() {
        return nommar;
    }

    public void setNommar(String nommar) {
        this.nommar = nommar;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDdn() {
        return ddn;
    }

    public void setDdn(String ddn) {
        this.ddn = ddn;
    }

    public String getIntit() {
        return intit;
    }

    public void setIntit(String intit) {
        this.intit = intit;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getIep() {
        return iep;
    }

    public void setIep(String iep) {
        this.iep = iep;
    }

    public String getAdr1() {
        return adr1;
    }

    public void setAdr1(String adr1) {
        this.adr1 = adr1;
    }

    public String getAdr2() {
        return adr2;
    }

    public void setAdr2(String adr2) {
        this.adr2 = adr2;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPaysn() {
        return paysn;
    }

    public void setPaysn(String paysn) {
        this.paysn = paysn;
    }
}
