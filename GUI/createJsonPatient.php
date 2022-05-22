<?php
	
	
	
    
    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
          
        function get_data() {
	$url = "http://local:8083/api/patients/";

	$curl = curl_init($url);
	curl_setopt($curl, CURLOPT_URL, $url);
	curl_setopt($curl, CURLOPT_POST, true);
	curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
	

	$headers = array(
		"Accept: application/json",
		"Content-Type: application/json",
	);
	curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
            $datae = array();
            $datae[] = array(
                'ipp' => $_POST['ipp'],
                'nom' => $_POST['name'],
                'nommar' => $_POST['namemar'],
                'prenom' => $_POST['prenom'],
                'ddn' => $_POST['ddn'],
                'intit' => $_POST['intit'],
                'sexe' => $_POST['sexe'],
                'iep' => $_POST['iep'],
                'adr1' => $_POST['adr1'],
                'adr2' => $_POST['adr2'],
                'cp' => $_POST['cp'],
                'ville' => $_POST['ville'],
                'pays' => $_POST['pays'],
                'tel' => $_POST['tel'],
                'paysn' => $_POST['paysn']
            );

			curl_setopt($curl, CURLOPT_POSTFIELDS, json_encode($datae));

			//for debug only!
			curl_setopt($curl, CURLOPT_SSL_VERIFYHOST, false);
			curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);

			$resp = curl_exec($curl);
			curl_close($curl);
			var_dump($resp);
            return json_encode($datae);
        }
          
        $name = "Patient";
        $file_name = $name . '.json';
       
        if(file_put_contents(
            "$file_name", get_data())) {
                echo $file_name .' file created';
            }
        else {
            echo 'There is some error';
        }
    }
?>