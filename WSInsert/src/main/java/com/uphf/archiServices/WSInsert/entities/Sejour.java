package com.uphf.archiServices.WSInsert.entities;

import javax.persistence.*;

@Entity
public class Sejour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Patient patient;

    @Column
    private String dds; //date de sejour

    @Column
    private String uf; // unite fonctionnelle

    @Column
    private String chambre;

    @Column
    private String lit;

    @Column
    private String ufmed; //uf medecin

    @Column
    private String numpas; //num passage

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDds() {
        return dds;
    }

    public void setDds(String dds) {
        this.dds = dds;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getChambre() {
        return chambre;
    }

    public void setChambre(String chambre) {
        this.chambre = chambre;
    }

    public String getLit() {
        return lit;
    }

    public void setLit(String lit) {
        this.lit = lit;
    }

    public String getUfmed() {
        return ufmed;
    }

    public void setUfmed(String ufmed) {
        this.ufmed = ufmed;
    }

    public String getNumpas() {
        return numpas;
    }

    public void setNumpas(String numpas) {
        this.numpas = numpas;
    }
}
