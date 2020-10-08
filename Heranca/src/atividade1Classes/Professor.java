package atividade1Classes;


public class Professor extends Pessoa {
    
    private double Salario;

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    public Professor(String nome){
        setNome(nome);
    }
    
    
    
    
}
