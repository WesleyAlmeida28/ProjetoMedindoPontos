
public class PontoAeB {

	private int x;
	private int y;

	// Construtor que recebe por parametro dois numeros inteiros x e y
	// respectivamente.
	public PontoAeB(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Construtor que n?o recebe nada por parametro mas seus valores s?o
	// inicializados em 0
	public PontoAeB() {
		this.x = 0;
		this.y = 0;
	}

	// Aqui temos um metodo para verificar se os numeros de cada ponto s?o iguais.
	// passando os numeros na chamada do m?todo como parametro.

	public boolean S?oIguais(int x, int y) {
		if (this.x == x && this.y == y) {
			return true;
		} else {
			return false;
		}
	}

	// Metodo para comparar igualdade dos pontos passando
	// o construtor proprio ponto como parametro usando numeros passado na chamada.

	public boolean S?oIguais2(PontoAeB ponto) {
		if (this.x == ponto.x && this.y == ponto.y) {
			return true;
		} else {
			return false;
		}
	}

	public double calcularDistancia(int x, int y) {
		int x1 = this.x;
		int y1 = this.y;

		this.x = x;
		this.y = y;

		double pontoA = x1 - this.x;
		double pontoB = y1 - this.y;

		double resultadoPontoA = Math.pow(pontoA, 2);
		double resultadoPontoB = Math.pow(pontoB, 2);

		double Distancia = Math.sqrt(resultadoPontoB + resultadoPontoA);

		return Distancia;
	}

	public double calcularDistancia2(PontoAeB ponto) {

		int x1 = ponto.x;
		int y1 = ponto.y;

		ponto.x = x;
		ponto.y = y;

		double PontoA = x1 - ponto.x;
		double PontoB = y1 - ponto.y;

		double ResultadoPontoA = Math.pow(PontoA, 2);
		double ResultadoPontoB = Math.pow(PontoB, 2);
		double Distancia2 = Math.sqrt(ResultadoPontoB + ResultadoPontoA);

		return Distancia2;
	}

}
