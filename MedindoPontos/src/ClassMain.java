
public class ClassMain {

	public static void main(String[] args) {
		Ponto pontoA = new Ponto(7, 9);
		Ponto pontoB = new Ponto(0, 4);

		//boolean Igualdade = pontoA.S�oIguais(5, 3);
		//System.out.println(Igualdade);

		//boolean Igualdade2 = pontoA.S�oIguais2(pontoB);
		//System.out.println(Igualdade2);

		double distancia2 = pontoA.calcularDistancia(pontoB);
		System.out.println(distancia2);
		
		double distancia1 = pontoA.calcularDistancia(pontoB);
		System.out.println(distancia1);
	}

}
