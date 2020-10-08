
package atividade1Classes;


public class Aluno extends Pessoa{
    
    private String matricula;
    
    public Aluno(){
        
    }
    
    public Aluno(String nome){
        setNome(nome);
    }

    public Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
}
