public class Secretaria {

	public double media(Aluno aluno) {
		double soma = 0;
		for (int i = 0; i < aluno.notas.length; i++) {
			soma += aluno.notas[i];
		}
		double media = soma / 4;

		return media;
	}

}