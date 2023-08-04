package aula0408.cursos;

import java.util.ArrayList;
import java.util.List;

public class EstudoComposicao {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Thais","98475665");
        Aluno aluno1 = new Aluno("Joao","98454888");
        Aluno aluno2 = new Aluno("Carlos","98474587");
        List<Aluno> alunos = new ArrayList<Aluno>(List.of(aluno, aluno1, aluno2));


        Professor professor = new Professor("Almir", "12345678-9");


        Curso curso = new Curso("Java", 200.0F, professor, alunos);

        System.out.println(curso.getProfessor().getNome());
        System.out.println(curso);
        System.out.println(curso.getAlunos().get(2).getNome());
    }

}
