package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Contributors;
import entities.Individual;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contributors> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n;i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company(i/c)?");
			sc.nextLine();
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (ch =='i') {
				System.out.print("Health expenditures: ");
				Double health = sc.nextDouble();
				list.add(new Individual(name, anualIncome, health));
			}
			else {
				System.out.print("Number of employees: ");
				Integer emp = sc.nextInt();
				list.add(new Company(name, anualIncome, emp));
			}
		}
		
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Contributors x: list) {
			System.out.println(x.getName()+": $"+String.format("%.2f", +x.payTax()));
		}
		
		double sum =0;
		for (Contributors x: list) {
			sum += x.payTax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $"+String.format("%.2f", sum));
		sc.close();
	}

}
