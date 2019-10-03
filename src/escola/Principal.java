
package escola;

public class Principal {

 
    public static void main(String[] args) {
       
        
        
        //Alunos
        
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        
        a1.setCodAluno(1);
        a1.setNomeAluno("João Victor");
        a1.setNota1(10);
        a1.setNota2(9);
        a1.setNota3(10);
        a1.setNota4(8);
        
        a2.setCodAluno(2);
        a2.setNomeAluno("Ryan");
        a2.setNota1(10);
        a2.setNota2(9);
        a2.setNota3(10);
        a2.setNota4(8);
        
        
        a3.setCodAluno(3);
        a3.setNomeAluno("Todoroki");
        a3.setNota1(10);
        a3.setNota2(9);
        a3.setNota3(10);
        a3.setNota4(8);
        
        
        a4.setCodAluno(4);
        a4.setNomeAluno("Emylle");
        a4.setNota1(10);
        a4.setNota2(9);
        a4.setNota3(10);
        a4.setNota4(8);
        
        a5.setCodAluno(5);
        a5.setNomeAluno("Felipe");
        a5.setNota1(10);
        a5.setNota2(9);
        a5.setNota3(10);
        a5.setNota4(8);
        
        a6.setCodAluno(6);
        a6.setNomeAluno("Vitoria Boleto");
        a6.setNota1(10);
        a6.setNota2(9);
        a6.setNota3(10);
        a6.setNota4(8);
        
        
        a7.setCodAluno(7);
        a7.setNomeAluno("Midoriya");
        a7.setNota1(10);
        a7.setNota2(9);
        a7.setNota3(10);
        a7.setNota4(8);
        
        
        a8.setCodAluno(8);
        a8.setNomeAluno("Momo");
        a8.setNota1(10);
        a8.setNota2(9);
        a8.setNota3(10);
        a8.setNota4(8);
        
        a9.setCodAluno(9);
        a9.setNomeAluno("Guilherme");
        a9.setNota1(10);
        a9.setNota2(9);
        a9.setNota3(10);
        a9.setNota4(8);
        
        a10.setCodAluno(10);
        a10.setNomeAluno("Melissa");
        a10.setNota1(10);
        a10.setNota2(9);
        a10.setNota3(10);
        a10.setNota4(8);   
        
        
        //Turma
        Turma t1 = new Turma();
        Turma t2 = new Turma();
        
        
        //Turma 1
        
         t1.setNomeTurma("2 Min");
       
         //Adicionando Alunos
         
        t1.addAlunos(a1);
        t1.addAlunos(a2);
        t1.addAlunos(a3);
        t1.addAlunos(a4);
        t1.addAlunos(a5);
        t1.ExibirAlunos();
        
        //Turma 2
        
         t2.setNomeTurma("1 Des");
        
         //Adicionando alunos ;)
         
         t2.addAlunos(a6);
         t2.addAlunos(a7);
         t2.addAlunos(a8);
         t2.addAlunos(a9);
         t2.addAlunos(a10);
         t2.ExibirAlunos();
         
         
         //Instanciando Escola
        
         Escola e = new Escola();
         
         //Escola
         
         e.setNomeEscola("Etec Peruibe");
         e.ExibirTurma();
         
         
    
         
         
         
    }
    
}
