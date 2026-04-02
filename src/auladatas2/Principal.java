package auladatas2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o dia:");
		int dia = teclado.nextInt();
		System.out.println("Informe o mes");
		int mes = teclado.nextInt();
		System.out.println("Informe o ano");
		int ano = teclado.nextInt();
		
		calcularIdade(dia, mes, ano);
		
		teclado.close();
	}
	
	public static int calcularIdade(int dia, int mes, int ano) {
		
		LocalDate primeiraData = LocalDate.of(ano,  mes, dia);
		LocalDate segundaData = LocalDate.now();

		Period periodo = Period.between(primeiraData, segundaData);
		
		int p_dias = periodo.getDays();
		int p_meses = periodo.getMonths();
		int p_anos = periodo.getYears();
		
		if(periodo.getDays() < 0) {
			System.out.println("Data Invalida.");
			return 1;
		}else if(periodo.getMonths() < 0) {
			return 1;
		}else if(periodo.getYears()< 0) {
			return 1;
				
			}
		
		System.out.println("A idade da pessoa é " + p_anos +" anos(s) " + p_meses + " mes(es) e " + p_dias + " dia(s).");
		return 0;
				
			
		}
	}
