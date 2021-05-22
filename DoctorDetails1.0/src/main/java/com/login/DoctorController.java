package com.login;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DoctorController {
	private static Map<String,Doctor> doctorRepo = new HashMap<String,Doctor>();
    static {
        Doctor d1 =  new Doctor(1,"bhargavi","XYZ",500);
        Doctor d2 =  new Doctor(2,"vasu","PQR",1000);
        doctorRepo.put("doc1", d1);
        doctorRepo.put("doc2", d2);
    }
    @RequestMapping(value="/")
    public String displayMessage() {
        return "Welcome to Web Services";
    }
    @RequestMapping(value="/doctors")
        public ResponseEntity<Object> getDoctors(){
            return new ResponseEntity<>(doctorRepo.values(),HttpStatus.OK);
        
    }
    @RequestMapping(value = "/doctor", method = RequestMethod.POST)
    public ResponseEntity<Object> saveDoctor(@RequestBody Doctor d) {
    doctorRepo.put("new"+d.getRegnum(), d);
    return new ResponseEntity<>("Doctor saved successfully", HttpStatus.CREATED);
    }
    @RequestMapping(value = "/doctor/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> removeDoctor(@PathVariable("regnum") String rno, @RequestBody Doctor d) throws Exception {
    if(!doctorRepo.containsKey(rno))
    throw new Exception();
    else
    doctorRepo.remove(rno);
    return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
    }
    
}
