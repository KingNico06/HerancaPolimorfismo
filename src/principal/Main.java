package principal;

import entidades.Caminhão;
import entidades.Carro;
import entidades.Moto;

public class Main {

	public static void main(String[] args) {
		
		Carro civic = new Carro ("Honda", "Civic", 2024, 550, true);
		
		Moto pcx = new Moto ("Honda", "PCX", 2010, 195, 150);
		
		Caminhão l1620 = new Caminhão( "Mercedes-Benz", "L1620", 1996, 800, 20);
		
		System.out.println(civic.toString());
		System.out.println("O valor do deste veículo foi de: R$" + civic.calcularAluguel(5));
		
		System.out.println(pcx.toString());
		System.out.println("O valor do deste veículo foi de: R$" + pcx.calcularAluguel(5));
		
		System.out.println(l1620.toString());
		System.out.println("O valor do deste veículo foi de: R$" + l1620.calcularAluguel(5));
	}

}
