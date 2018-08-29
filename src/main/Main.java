import org.junit.Assert;

public class Main {
	@Test
	public static void teste(String[] args) {

		//cenário
		Aluno a = new Aluno();
		Secretaria s = new Secretaria();
		
		//ação
		a.nome = "Sucesso";
		
		a.notas[0] = 10.0;
		a.notas[1] = 9.0;
		a.notas[2] = 8.5;
		a.notas[3] = 8.0;
	
		double media = s.media(a);
	
		//verificação
		System.out.println("A média de " + a.nome + " é: " +media);
		
		a.avaliar(2,10);
		a.recuperar(2);
		
		Assert.assertTrue(media == 6);
	}

}
