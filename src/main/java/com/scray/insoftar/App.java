package com.scray.insoftar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.scray.insoftar.beans.Persona;
import com.scray.insoftar.service.DAOPersonaImp;


/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages={"com.scray.insoftar"})
public class App 
{
    public static void main( String[] args )
    {
   	DAOPersonaImp dao = new DAOPersonaImp();
    	//Persona per = new Persona(5, "ximena2", "xiraldo2", 1142,"xim@hotmail.com","9987819");
    	//dao.insertarPersona(per);
    	/*	Persona per2 = new Persona(3, "xim", "xiral", 1134,"xime@hotmail.com","2312313");
    	//dao.insertarPersona(per2);
    	dao.updatePersona(per);
    	System.out.println(dao.findAllPersona());*/
SpringApplication.run(App.class, args);
    	
    	System.out.println("Ejecutando servicio web");
    }
    

}
