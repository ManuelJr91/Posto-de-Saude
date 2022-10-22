package model;

import javax.swing.JOptionPane;

public class PassWordValidation {
    public static void main(String[] args) {
       
        myPassword mypass = new myPassword();
        mypass.getInfo();
    }
}

class myPassword {

    private static String username;
    private static String email;
    private static String pass;
    private static char c;
    private static boolean hasNum=false;
    private static boolean hasUpper=false;
    private static boolean hasLower=false;
    private static boolean hasEmail=false;
    private static boolean haslength = false;
    
    
    public static void getInfo(){

        JOptionPane.showMessageDialog(null,"Enter your username: ");
        JOptionPane.showInputDialog(username);
        
        JOptionPane.showMessageDialog(null,"Enter your email: ");
        JOptionPane.showInputDialog(email);
        
        JOptionPane.showMessageDialog(null,"Enter your passWord: ");
        JOptionPane.showInputDialog(pass);
        
        JOptionPane.showMessageDialog(null,myRole(pass));
    }
    public static String myRole(String password){
        for(int i=0; i<password.length(); i++){
            c=password.charAt(i);
            
            if(password.length()>8){
                haslength=true; 
            }
            if(Character.isUpperCase(c)){
                hasUpper = true;
            }
            if(Character.isLowerCase(c)){
                hasLower = true;
        }
            if(Character.isDigit(c)){
                hasNum = true;
            }
            if(email.charAt(0)!='@' && email.contains("@") && email.endsWith(".com")){
                hasEmail= true;
            }
        
        
    }
        if(haslength && hasUpper & hasLower && hasNum && hasEmail){
            return "You have a strong user";
        }
        return "Tua senha deve conter 8 caracteres\nsua senha deve conter uma combinacao de letra maisculas e minusculas\nteu email deve estra correcto";
        
    }
}
