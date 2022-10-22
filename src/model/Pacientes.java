package model;

import model.Pessoa;
import java.io.BufferedReader;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;


public class Pacientes extends Pessoa{

    private String residencia;
    private String patologia;
    private String date;
    private Integer id;
    
   
    public Pacientes() {
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public String getApelido(){
        return this.apelido;
    }
    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}
