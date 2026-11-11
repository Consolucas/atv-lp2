package edu.fatec.lp2.exercicio3;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma(2);

        Aluno ana = new Aluno("001", "Ana", Curso.ADS);
        Aluno bruno = new Aluno("001", "Bruno", Curso.BANCO_DE_DADOS);
        Aluno bia = new Aluno("002", "Bia", Curso.BANCO_DE_DADOS);
        Aluno jorge = new Aluno("003", "Jorge", Curso.ADS);

        System.out.println(turma.incluir(ana));   // true: primeira vaga
        System.out.println(turma.incluir(bruno)); // false: matrícula repetida
        System.out.println(turma.incluir(bia));   // true: segunda vaga
        System.out.println(turma.incluir(jorge)); // false: turma cheia
    }
}
