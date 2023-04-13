package com.vcar.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vcar.app.models.domain.Empleados;

@Configuration
public class AppConfig {

	@Bean
    public List<Empleados> registrarItemsFac(){
		Empleados emp1 = new
				Empleados(
						"Diana Zhizhin",
						"Cuenca, Ecuador",
						"Lunes - Viernes (9:00AM-6:00PM)",
						"dianazhizhin@colineal.com",
						"0988395340",
						"RECURSOS HUMANOS",
						"https://cdn-icons-png.flaticon.com/512/921/921018.png"
						
						
						);
		
		Empleados emp2 = new
				Empleados(
						"Juan Villa",
						"Cuenca, Ecuador",
						"Lunes - Viernes (8:30 AM - 4:30PM)",
						"juanvil@colineal.com",
						"+593 99994 8954",
						"CONTABILIDAD",
						"https://cdn-icons-png.flaticon.com/512/3667/3667215.png"
						
						
						);
		return Arrays.asList(emp1,emp2);
	}
	
	
}
