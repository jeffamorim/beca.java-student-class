package student;

public class Aluno {
	public int ra;
	public int anoDeCurso;
	public String nome;
	public String curso;
	public String periodo;
	
	public double notaUm;
	public double notaDois;
	public double notaTres;
	public double notaQuatro;
	
	public Aluno(double nota1, double nota2) {
		notaUm = nota1;
		notaDois = nota2;
	}
	
	public void atribuiNota(double nota3, double nota4) {
		notaTres = nota3;
		notaQuatro = nota4;
	}
	
	public double calculaMedia() {
		return (notaUm + notaDois + notaTres + notaQuatro) / 4;
	}
}
