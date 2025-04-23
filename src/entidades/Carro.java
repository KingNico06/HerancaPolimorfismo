package entidades;

import servico.Aluga;

public class Carro extends Veiculos implements Aluga{
	private boolean arCondicionado;
	
	public Carro(String marca, String modelo, int ano, double valorDiario, boolean arCondicionado) {
		super(marca, modelo, ano, valorDiario);
		this.arCondicionado = arCondicionado;
		
	
		
	
		
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "\nMarca: " + getMarca() +
				"\nModelo: " + getModelo() +
				"\nAno: " + getAno() +
				"\nValor Diária: " + getValorDiario() +
				"\nAr Condicionado: " + arCondicionado;
	}

	@Override
	public double calcularAluguel(int dias) {
		double valorAluguel;
		
		if(arCondicionado) {
			valorAluguel = getValorDiario() * dias * 1.5;
		}
		else {
			valorAluguel = getValorDiario() * dias;
		}
		
		return valorAluguel;
	}
}
