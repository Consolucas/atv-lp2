package edu.fatec.lp2.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos;
    private int numeroAlunos;

    public  Turma(int numeroAlunos){
        this.alunos = new ArrayList<>(numeroAlunos);
        this.numeroAlunos = numeroAlunos;
    }

    public boolean incluir(Aluno aluno){
        if (alunos.size() >= numeroAlunos){
            return false;
        }
        for (int i = 0; i< alunos.size(); i++){
            Aluno cadastrado = alunos.get(i);

            if (aluno.getMatricula().equals(cadastrado.getMatricula())){
                return false;
            }
        }

        alunos.add(aluno);
        return true;
    }
}
