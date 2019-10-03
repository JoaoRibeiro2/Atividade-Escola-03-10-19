
package escola;

import java.util.ArrayList;
import java.util.List;


public class Turma {
    
    private String nomeTurma;
    private List<Aluno> alunos = new ArrayList<Aluno>();
    
    
    public void setNomeTurma(String nomeTurma)
    {
        this.nomeTurma = nomeTurma;                      
    }
    
    public String getNomeTurma()
    {
        return nomeTurma;
    }
    
        //Exibir Alunos
    
    public void addAlunos(Aluno a)
    {
        alunos.add(a);
    }
    
    public void ExibirAlunos()
    {
        
        for(Aluno a: alunos)
        System.out.println("nome aluno"+a.getNomeAluno());
    }
}
