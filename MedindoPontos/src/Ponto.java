
public class Ponto {

	private int x;
	private int y;

	// Construtor que recebe por parametro dois numeros inteiros x e y
	// respectivamente.
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Construtor que n�o recebe nada por parametro mas seus valores s�o
	// inicializados em 0
	public Ponto() {
		this.x = 0;
		this.y = 0;
	}

	// Aqui temos um metodo para verificar se os numeros de cada ponto s�o iguais.
	// passando os numeros na chamada do m�todo como parametro.

	public boolean S�oIguais(int x, int y) {
		if (this.x == x && this.y == y) {
			return true;
		} else {
			return false;
		}
	}

	// Metodo para comparar igualdade dos pontos passando
	// o construtor proprio ponto como parametro usando numeros passado na chamada.

	public boolean S�oIguais2(Ponto ponto) {
		if (this.x == ponto.x && this.y == ponto.y) {
			return true;
		} else {
			return false;
		}
	}
}
