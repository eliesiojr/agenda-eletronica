package Agenda;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class agenda {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	}
	
	// Cadastrando o compromisso na agenda
	public static void cadastroCompromisso(List<String[]> compromissos){
		Scanner input = new Scanner(System.in);
		String loc, data, desc, hr;
		
		System.out.println("Data do compromisso: [dd/mm/aaaa]");
		data = input.nextLine();
		
		System.out.println("Digite o horario: [HH:MM]");
		hr = input.nextLine();
		
		System.out.println("Digite a  descrição do compromisso:");
		desc = input.nextLine();
		
		System.out.println("Digite o local do compromisso: ");
		loc = input.nextLine();
		String []compromisso = {data, hr, desc, loc};
		compromissos.add(compromisso);
		
		System.out.println("Cadastrado");
		
		}
	// Editando um compromisso da agenda
		
	public static void editar(List<String[]> compromissos) {
		Scanner input = new Scanner(System.in);
		String data, hr, desc, loc;
		int i;
		;
		System.out.println("Digite a posição do compromisso que deseja editar:");
		i = input.nextInt();
		i = i - 1;
		if(i >= 0 && i < compromissos.size()) {
			System.out.println("Nova Data do compromisso: [dd/mm/aaaa]");
			data = input.nextLine();
			
			System.out.println("Digite o novo horario: [HH:MM]");
			hr = input.nextLine();
			
			System.out.println("Digite a nova descrição do compromisso:");
			desc = input.nextLine();
			
			System.out.println("Digite o novo local do compromisso: ");
			loc = input.nextLine();
			String []compromisso = {data, hr, desc, loc};
			compromissos.set(i, compromisso);
			
		}
}
	// Removendo um compromisso da agenda
	public static void remover(List<String[]> compromissos) {
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("Digite a posição do compromisso que deseja remover:");
		i = input.nextInt();
		if(i >= 0 && i < compromissos.size());
		compromissos.remove(i);
		
		
	}
	
}
