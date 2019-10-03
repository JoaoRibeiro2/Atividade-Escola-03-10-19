
package escola;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    
    String nomeEscola;
    List<Turma> turmas = new ArrayList<Turma>();
    
    //Escola
    
    
    public void setNomeEscola(String nomeEscola)
    {
        this.nomeEscola = nomeEscola;
    }
    
    public String getNomeEscola()
    {
        return nomeEscola;
    }
    
    //Exibir turmas
    
    public void addTurmas(Turma t)
    {
        turmas.add(t);
    }
    
    public void ExibirTurma()
    {
        for(Turma t: turmas){
        System.out.println("Turmas: "+t.getNomeTurma()+"\n");
        }
    }
    
}