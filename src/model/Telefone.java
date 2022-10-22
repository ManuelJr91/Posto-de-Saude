package model;
//import android.app.Activity;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;




public class Telefone {
	  private static String[] movitel = {"86", "87"}; 
	    private static String[] vodacom = {"84", "85"};
	    private static String[] tmcel = {"82", "83"};
     	private static String error = "";
         private RealTimeListener realTimeListener;

     //	private Activity activity;
		
/*	public Telefone(Activity activity) {
		this.activity = activity;
	}
*/
        
        public interface RealTimeListener{
            void onSuccess();
            void onError(String error);
        }
        
        public void createRealTimeListener(RealTimeListener realTimeListener){
            this.realTimeListener = realTimeListener;
        }
        
        public void validar(String numero){
            if(isValid(numero)){
                setSuccess();
            } else{
                setError(getError());
            }
        }
        
        private void setError(String erro){
            if(realTimeListener != null){
                realTimeListener.onError(erro);
            }
        }
        
        private void setSuccess(){
            if(realTimeListener != null){
                realTimeListener.onSuccess();
            }
        }
        
        
     
        
        
        
        
	public static boolean isValid(String str){
		try{
		int tente_converter = Integer.parseInt(str);
		  return isValidNumber(String.valueOf(tente_converter));
		}
		catch(Exception e){
			error = "O número está em um formato inválido!";
			return false;
		}
		
	}
	
	public static String getError(){
	  
	  return error;
	}


	private static boolean isValidNumber(String str) {


	if(str.startsWith(movitel[0]) ||  str.startsWith(movitel[1])||str.startsWith(vodacom[0]) ||  str.startsWith(vodacom[1])||str.startsWith(tmcel[0]) ||  str.startsWith(tmcel[1])){
		return isExistLength(str);
		}
		else{
			if (str.length() >= 2){
				error = "Não encontramos uma operadora com o prefixo " + str.substring(0, 1);
			} else{
				error = "Número inválido!";
			}
		return false;
		
		}
		
	}
	
	private static boolean isExistLength(String str){
		if (str.length() < 9){
			error = "O número que digitou é inválido!";
			return false;
		} else {
			if (str.length() > 9){
				error = "O número que digitou é inválido!";
				return false;
			} else {
				return true;
			}	
		}
		
	}
}
