import javax.swing.JOptionPane;

import br.edu.ifpi.dominio.Aluno;
import br.edu.ifpi.dominio.Curso;
import br.edu.ifpi.dominio.Professor;

public class App {
    public static void main(String[] args) throws Exception {

        Professor p1 = new Professor("Bob");
        Curso c1 = new Curso("ADS", "Superior", 2000, p1);

        System.out.println("Nome do curso: " + c1.getNome() + ", Professor: " + c1.getNomeProfessor());

        for (int i = 0; i < 3; i++) {
            String nomeAluno = JOptionPane.showInputDialog(null, "Insira o nome do aluno");
            c1.realizarMatricula(new Aluno(nomeAluno, null));
        }

        JOptionPane.showMessageDialog(null,
                "Curso:" + c1.getNome() + " \n Alunos: " + c1.getAlunos(),
                "Dados do Curso", 1);

    }
}
