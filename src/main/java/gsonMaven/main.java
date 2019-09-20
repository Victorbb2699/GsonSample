package gsonMaven;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gsonMaven.Persona;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Persona p = new Persona();
		
		System.out.println("Introduce una persona.");
		System.out.println("Nombre:  ");
		p.nombre = entrada.nextLine();
		System.out.println("Apellidos:  ");
		p.apellidos = entrada.nextLine();
		System.out.println("Edad:  ");
		p.edad = entrada.nextInt();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	
		entrada.close();
		
	}

}
