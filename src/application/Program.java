package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produtos;
import services.ServicoCalcular;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Produtos> list = new ArrayList<>();
		
		String texto = "C:\\Users\\User\\Desktop\\Marcelo\\TrabalhoEclipse\\aula199.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(texto))) {
			
			String linha = br.readLine();
			while (linha != null){
				String[] fields = linha.split(",");
				list.add(new Produtos(fields[0], Double.parseDouble(fields[1])));
				linha = br.readLine();
			}
			Produtos x = ServicoCalcular.maximo(list);
			System.out.println("Mais caro: ");
			System.out.println(x);
			}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
