
package atividade1Classes;

import java.util.ArrayList;

public abstract class Pessoa {
    
    private String nome;
    private int idade;
    private ArrayList<String>materias = new ArrayList<String>();
    private String turma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void setMateria(String adicionaMateria) {
        this.materias.add(adicionaMateria);
    }

    public String getMateria(int i){
        return this.materias.get(i);
    }
    
    public ArrayList<String> getMaterias() {
        return materias;
    }
    
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
}
