
public class ClassMain {

	public static void main(String[] args) {
		PontoAeB pontoA = new PontoAeB(7, 9);
		PontoAeB pontoB = new PontoAeB(0, 4);

		boolean Igualdade = pontoA.S?oIguais(5, 3);
		System.out.println(Igualdade);

		boolean Igualdade2 = pontoA.S?oIguais2(pontoB);
		System.out.println(Igualdade2);

		double distancia = pontoA.calcularDistancia2(pontoB);
		System.out.println(distancia);
		
		double distancia2 = pontoA.calcularDistancia(3, 4);
		System.out.println(distancia2);
		
		
		
	}

}
