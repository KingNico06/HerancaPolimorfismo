package entidades;

import servico.Aluga;

public class Moto extends Veiculos implements Aluga{
	private int cilindradas;

	public Moto(String marca, String modelo, int ano, double valorDiario, int cilindradas) {
		super(marca, modelo, ano, valorDiario);
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "\nMarca: " + getMarca() +
				"\nModelo: " + getModelo() +
				"\nAno: " + getAno() +
				"\nValor Diária: " + getValorDiario() +
				"\nCilindradas: " + cilindradas;
	}

	@Override
	public double calcularAluguel(int dias) {
		double valorAluguel;
		
		if(cilindradas > 200) {
			valorAluguel = getValorDiario() * dias * 1.5;
		}
		else {
			valorAluguel = getValorDiario() * dias;
		}
		
		
		return valorAluguel;
	}
}
