package model;

    public class Identificacao {

    private IdentificationListener identificationListener;

   
    public interface IdentificationListener {
        //Metodos para incurtar o codigo,enviar a resposta para o usuario 

        void Valido();

        void invalido(String message);

    }

    public void createListener(IdentificationListener identificationListener) {

        this.identificationListener = identificationListener;

    }
//Criar corpo para o metodo abstracto isValid

    private void setValido() {
        //Sempre que este metodo for chamada ira cirar um corpo para isvalid
        //verifica se o identificationListener nao e nullo
        if (this.identificationListener != null) {
            this.identificationListener.Valido();
        }

    }

    private void setInValido(String message) {

        if (this.identificationListener != null) {
            this.identificationListener.invalido(message);
        }

    }

    public void Verificar(String nome) {

        if (nome.length() <= 4 && !nome.contains(" ")) {
            setInValido("o comprimento do nome nao pode ser inferior a 5");
        } else if (nome.length() <= 4 && nome.contains(" ")) {
            setInValido("o comprimento do nome nao pode ser inferior a 5");

        }else if(nome.length() > 4 && nome.length() <= 21 && !nome.contains(" ")){
            setInValido("por favor insira o seu apelido");

        }else if(nome.length() > 4 && nome.length() <= 21){
            if(VerificarLetra(nome)
                && getComprimento(nome)>4){
                setValido();
            }else{
                setInValido("o comprimento do apelido nao pode ser inferior a 5- "+nome.replaceFirst(nome.substring(0, nome.indexOf(" ")+1), "")); 
            }
        }

            
       
    }
    
     public boolean Verificar2(String nome) {

        if (nome.length() <= 4 && !nome.contains(" ")) {
            return false;
        } else if (nome.length() <= 4 && nome.contains(" ")) {
           return false;

        }else if(nome.length() > 4 && nome.length() <= 21 && !nome.contains(" ")){
           return false;
        }else if(nome.length() > 4 && nome.length() <= 21){
            if(VerificarLetra(nome)
                && getComprimento(nome)>4){
                return true;
            }else{
                return false;
            }
        }

            
       
    }
    
    
    
    
    
    
    
    
    
    
    public boolean VerificarLetra(String nome){
        
       String m [] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for (int i = 0; i <m.length; i++) {
            
            if(nome.replaceFirst(nome.substring(0, nome.indexOf(" ")+1), "").contains(m[i])){
                return true;
            }
        }
        return false;
    }
     private int getComprimento(String nome) {
         String str=nome.replaceFirst(nome.substring(0,nome.indexOf(" ")+1), "");
         int c = str.length();
         return c;

    }

    
}
