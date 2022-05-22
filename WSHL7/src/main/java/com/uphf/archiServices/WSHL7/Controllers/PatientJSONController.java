package com.uphf.archiServices.WSHL7.Controllers;

import com.uphf.archiServices.WSHL7.Mappers.PatientRestToHl7;
import com.uphf.archiServices.WSHL7.Repositories.PatientRepository;
import com.uphf.archiServices.WSHL7.entities.Patient;
import com.uphf.archiServices.WSHL7.hl7gensimple.hl7gen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patients")
public class PatientJSONController {

    @Autowired
    private PatientRepository pRepository;

    private hl7gen hl7gen;

    private PatientRestToHl7 mapper = new PatientRestToHl7();

    @PutMapping("/")
    public int addPatient(@RequestBody Patient patient) {
        hl7gen = new hl7gen(mapper.RestToHl7(patient));
        try {

            System.out.println("on tente la gen du hl7");
            hl7gen.create_adt("test1.hl7");
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

}

/*

{
	"ipp":"",
	"nom":"",
	"nommar":"",
	"prenom":"",
	"ddn":"",
	"intit":"",
	"sexe":"",
	"iep":"",
	"adr1":"",
	"adr2":"",
	"cp":"",
	"ville":"",
	"pays":"",
	"tel":"",
	"paysn":""
}

{
	"ipp":"pt12",//id perm patient
	"nom":"Fossey",
	"nommar":"Fossey",
	"prenom":"Mathis",
	"ddn":"20/09/2000",
	"intit":"M.", //M. Mme
	"sexe":"M",
	"iep":"1", //id entree patient
	"adr1":"12 rue des rues",
	"adr2":"",
	"cp":"59000",
	"ville":"Lille",
	"pays":"Fr",
	"tel":"0606060606",
	"paysn":"Fr"
}

*/
