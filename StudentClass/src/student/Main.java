package student;

public class Main {
	public static void main(String[] args) {
		Aluno aluno = new Aluno(10, 10);
		aluno.nome = "Jose";
		aluno.atribuiNota(10, 10);
		double media = aluno.calculaMedia();
		System.out.println("Nome: " + aluno.nome + "\n" + "Média: " + media);
	}
}
