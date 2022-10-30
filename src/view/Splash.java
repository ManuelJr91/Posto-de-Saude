package view;


public class Splash {

    public static void main(String[] args) {
       
        SplashHome splash = new SplashHome();
        
        splash.setVisible(true);
        Login_Form login = new Login_Form();
        
         try {
                    for(int i = 0; i<= 100; i++){
                        Thread.sleep(40);
                        splash.loadingNumber.setText(Integer.toString(i)+"%");
                        splash.loadbar.setValue(i);
                        if(i==100){
                          splash.setVisible(false);
                          login.setVisible(true);
                        }
                    }
                    
                } catch (Exception e) {
                }
        
    }

    
}
