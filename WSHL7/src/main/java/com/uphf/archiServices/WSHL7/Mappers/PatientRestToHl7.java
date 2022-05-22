package com.uphf.archiServices.WSHL7.Mappers;

import com.uphf.archiServices.WSHL7.entities.Patient;

public class PatientRestToHl7 {

    public com.uphf.archiServices.WSHL7.hl7gensimple.Patient RestToHl7(Patient p){
        com.uphf.archiServices.WSHL7.hl7gensimple.Patient p7 = new com.uphf.archiServices.WSHL7.hl7gensimple.Patient();
        p7.setADR1(p.getAdr1());
        p7.setCHAMBRE("");
        p7.setADR2(p.getAdr2());
        p7.setCP(p.getCp());
        p7.setDDN(p.getDdn());
        p7.setDDS("01/01/2000");
        p7.setINTIT(p.getIntit());
        p7.setIEP(p.getIep());
        p7.setIPP(p.getIpp());
        p7.setLIT("");
        p7.setNOM(p.getNom());
        p7.setPRENOM(p.getPrenom());
        p7.setNOMMAR(p.getNommar());
        p7.setPAYS(p.getPays());
        p7.setPAYSN(p.getPaysn());
        p7.setSEXE(p.getSexe());
        p7.setTEL(p.getTel());
        p7.setVILLE(p.getVille());
        p7.setUF("");
        p7.setUFMED("");
        return p7;
    }

    public Patient HL7ToRest(com.uphf.archiServices.WSHL7.hl7gensimple.Patient p7){
        Patient p = new Patient();
        p.setAdr1(p7.getADR1());
        p.setAdr2(p7.getADR2());
        p.setCp(p7.getCP());
        p.setDdn(p7.getDDN());
        p.setIntit(p7.getINTIT());
        p.setIep(p7.getIEP());
        p.setIpp(p7.getIPP());
        p.setNom(p7.getNOM());
        p.setPrenom(p7.getPRENOM());
        p.setNommar(p7.getNOMMAR());
        p.setPays(p7.getPAYS());
        p.setPaysn(p7.getPAYSN());
        p.setSexe(p7.getSEXE());
        p.setTel(p7.getTEL());
        p.setVille(p7.getVILLE());
        return p;
    }

}
