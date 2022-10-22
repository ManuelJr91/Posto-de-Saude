package model;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.ArrayList;

import javax.swing.*;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Medicamentos implements Serializable{
// atributos da classe medicamentos 
private String nome,categoriaMedicamento,validade; 
private int quantidade, id;

    public Medicamentos(String nomeMedicamento, String categoriaMedicamento, int quantidade, String validade, int id) {
        this.nome = nomeMedicamento;
        this.categoriaMedicamento = categoriaMedicamento;
        this.quantidade = quantidade;
        this.validade = validade;
        this.id = id;
    }

   public Medicamentos() {
      
    }

// metodos Getters e Setters da classe medicamentos
public String getNomeMedicamento(){
    return nome; 
}
public void setNomeMedicamento(String NomeMedicamento){
    this.nome=NomeMedicamento; 
}
    public String getCategoriaMedicamento() {
        return categoriaMedicamento;
    }

    public void setCategoriaMedicamento(String categoriaMedicamento) {
        this.categoriaMedicamento = categoriaMedicamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    public int  getId() {
        return id; 
    }
    public void setCodigoMedicamento(int codigoMedicamento){
        this.id=id; 
    }
// fim dos metodos gettrs  settrs 

    
}//Fecha a classe medicamento 
