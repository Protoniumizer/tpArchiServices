package com.uphf.archiServices.WSHL7.hl7gensimple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author tondeur-h
 */
@Data
@NoArgsConstructor
@ToString
public
class Patient {  
    private String DATEMSG;//now
    private String NUMMSG;//auto
    private String IPP;//
    private String NOM;//
    private String PRENOM;//
    private String INTIT;
    private String NOMMAR;//
    private String DDN;//
    private String SEXE;//
    private String IEP;//
    private String ADR1;
    private String ADR2;
    private String CP;
    private String VILLE;
    private String PAYS;
    private String TEL;//
    private String PAYSN;
    private String DDS;
    private String UF;
    private String CHAMBRE;
    private String LIT;
    private String UFMED;
    private String NUMPAS;  
}
