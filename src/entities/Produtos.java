package entities;

public class Produtos implements Comparable<Produtos>{
	
	Double preco;
	String nome;
	
	
	public Produtos (String nome, Double preco) {
		this.preco = preco;
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return  nome  + " , "  + String.format("%.2f", preco);
	}


	@Override
	public int compareTo(Produtos outro) {
		return preco.compareTo(outro.getPreco());
	}
	
	
	

}
