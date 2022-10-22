
package model;

/**
 *
 * @author Manuel Maloa Jr
 */
public abstract class Pessoa {
    String nome;
    String apelido;
    int idade;
    char sexo;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void Dados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Apelido: "+this.apelido);
        System.out.println("Idade: "+this.idade);
        System.out.println("Sexo: "+this.sexo);
    }
    
}
