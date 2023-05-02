package com.atividadegit.aulanelio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AulanelioApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AulanelioApplication.class, args);


		Scanner scan = new Scanner(System.in);
		int idade = scan.nextInt();

		System.out.print("Digite a idade: ");
		if (idade <= 2 || idade >= 65) {
			System.out.println("Passagem Gratuita");
		} else {
			System.out.print("Paga 30");
		}
		if (idade >= 13 || idade > 18) {
			System.out.print("Paga 80");
		} else {
			System.out.print("Paga 100");
		}
	}

	}

