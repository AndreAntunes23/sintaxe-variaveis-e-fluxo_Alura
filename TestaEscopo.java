public class TestaEscopo {
	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 20;
		int QuantidadePessoa = 3;

		// boolean acompanhado = QuantidadePessoa >= 2;
		
		boolean acompanhado;
		
		if (QuantidadePessoa >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("valor de acompanhado " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}
	}

}