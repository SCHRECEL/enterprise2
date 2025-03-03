package com.plantdiary.enterprise;

import com.plantdiary.enterprise.DTO.Specimen;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EnterpriseController{
    @RequestMapping("/")
    public String index(){
        Specimen S = new Specimen();

        return "start";
    }
    @GetMapping("/specimen")
    public ResponseEntity fetchAllSpecimen()
    {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/specimen/{id}/")
    public ResponseEntity fetchSpecimenById(@PathVariable("id") String id)
    {
        return new ResponseEntity(HttpStatus.OK);
    };

@PostMapping(value ="/specimen", consumes="application/json", produces = "application/json")
    public Specimen createSpecimen(@RequestBody Specimen specimen){
    return specimen;
}

@DeleteMapping("/specimen/{id}/")
    public ResponseEntity deleteSpecimen(@PathVariable("id") String id){
    return new ResponseEntity(HttpStatus.OK);
}
}