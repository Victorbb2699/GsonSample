package gsonMaven;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gsonMaven.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Persona p = new Persona();

		System.out.println("Introduce una persona.");
		System.out.println("Nombre:  ");
		p.setNombre(entrada.nextLine());
		System.out.println("Apellidos:  ");
		p.setApellidos(entrada.nextLine());
		System.out.println("Edad:  ");
		p.setEdad(entrada.nextInt());

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);

		entrada.close();

	}

}
