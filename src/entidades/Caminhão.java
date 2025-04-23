package entidades;

import servico.Aluga;

public class Caminhão extends Veiculos implements Aluga{
	private int toneladas;
	public Caminhão(String marca, String modelo, int ano, double valorDiario, int toneladas) {
		super(marca, modelo, ano, valorDiario);
		this.toneladas = toneladas;
	}
	
	@Override
	public String toString() {
		return "\nMarca: " + getMarca() +
				"\nModelo: " + getModelo() +
				"\nAno: " + getAno() +
				"\nValor Diária: " + getValorDiario() +
				"\nToneladas: " + toneladas;
	}

	@Override
	public double calcularAluguel(int dias) {
		double valorAluguel;
		
		if(toneladas > 16) {
			valorAluguel = getValorDiario() * dias * 1.2;
		}
		else {
			valorAluguel = getValorDiario() * dias;
		}
		
		
		return valorAluguel;
	}
	
}
