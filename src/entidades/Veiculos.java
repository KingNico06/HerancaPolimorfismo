package entidades;

public class Veiculos {
	//Attribute
	
	private String marca;
	private String modelo;
	private int ano;
	private double valorDiario;
	
	//Constructors
	public Veiculos(String marca, String modelo, int ano, double valorDiario) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorDiario = valorDiario;
	}
	
	//Getters and Setters
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValorDiario() {
		return valorDiario;
	}
	public void setValorDiario(double valorDiario) {
		this.valorDiario = valorDiario;
	}

	//toString

	@Override
	public String toString() {
		return "Marca: " + marca +
				"\nModelo: " + modelo + 
				"\nAno: " + ano + 
				"\nValor Diário: " + valorDiario;
	}
	
}
