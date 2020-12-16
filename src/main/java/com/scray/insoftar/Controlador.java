package com.scray.insoftar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.scray.insoftar.beans.Persona;
import com.scray.insoftar.service.PersonaServiceImp;


//@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
@RestController
public class Controlador {
	
	@Autowired
	PersonaServiceImp personaServiceImp;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/persona")
	public List<Persona> findAllPersona(){
    	return personaServiceImp.findAllPersona();
    }
    
    @ResponseBody
    @RequestMapping(value="/insertar", method=RequestMethod.POST)
	public void insertarPersona(@RequestBody Persona persona) {
    	personaServiceImp.insertarPersona(persona);
    }
    
    @ResponseBody
    @RequestMapping(value="/actualizar", method=RequestMethod.PUT)
	public void updatePersona(@RequestBody Persona persona) {
    	personaServiceImp.updatePersona(persona);
    }
    
    @ResponseBody
    @RequestMapping(value="/findbycorreo",produces = "application/json" ,method=RequestMethod.POST)
	public Persona consultarCorreo(@RequestBody String correo) {
    	System.out.println(correo);
    	return personaServiceImp.findPersona(correo);
    }
}
