
public class TestaCondicional {
	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 16;
		int QuantidadePessoa = 3;
		
		if (idade >= 18) {
			System.out.println("voc? tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if(QuantidadePessoa >= 2) {
				System.out.println("voce n?o tem 18, mas pode entrar pois est? acompanhado");
			} else {
				System.out.println("infelizmente voc? n?o pode entrar");
			}
		}

	}
}