package view;

import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Login_Screan extends JFrame{
	
	private JPanel painel_esq,painel_dir,painel_botoes,painel_dados,painel_dir_dados;
    private JLabel lbUsuario,logoUser,lbSenha,logoEmpresa;

    private JTextField tfUsuario = new JTextField();
    private JPasswordField pfSenha = new JPasswordField();
    private JButton btOk = new JButton("Entrar");
    private JButton btCancelar = new JButton("Registar");
    private ImageIcon logo,user;
    
    private int passWord [] = new int [4];
    private String names[] = new String [4];
    
    private JPanel painel;
    private Container cont;
	 
	public Login_Screan() {
		
		super("Login");
//		lerUser();
		cont=getContentPane();
		cont.setLayout(new GridLayout(1,2));
		painel=new JPanel();
		painel_esq=new JPanel();
		painel_dir=new JPanel();
		painel_dir_dados=new JPanel();
		painel_dados=new JPanel();
		painel_botoes=new JPanel();
		//Adicionando um painel noutro
		painel_esq.setLayout(new BorderLayout(20,20));
		painel_dir.setLayout(new FlowLayout(FlowLayout.CENTER));
		painel_dir_dados.setLayout(new BorderLayout(40,40));
		painel_dados.setLayout(new GridLayout(2,2,5,5));
		painel_dir.add(painel_dir_dados);
		
		lbUsuario = new JLabel("Usuario");
		lbSenha = new JLabel("Senha");
		
		painel_dados.add(lbUsuario);
		painel_dados.add(tfUsuario);
		painel_dados.add(lbSenha);
		painel_dados.add(pfSenha);
//		painel_dados.add(btOk);
//		painel_dados.add(btCancelar);
		
		
		
		//add o logo no painel
//		user=new ImageIcon(getClass().getResource("user.png"));
//		user.setImage(user.getImage().getScaledInstance(160, 160, DO_NOTHING_ON_CLOSE));
//		logoUser=new JLabel(user);
		
//		painel_dir_dados.add(logoUser,BorderLayout.NORTH);
		painel_dir_dados.add(painel_dados,BorderLayout.CENTER);
		painel_dir_dados.add(painel_botoes,BorderLayout.SOUTH);
		
		//Logo da empresa
//		logo=new ImageIcon(getClass().getResource());//Em falta a imagem
//		logo.setImage(logo.getImage().getScaledInstance(160, 160, DO_NOTHING_ON_CLOSE));
//		logoEmpresa=new JLabel(logo);
//		painel_esq.add(logoEmpresa);
		//
		
		painel_esq.setBackground(Color.orange);
		painel_dir.setBackground(Color.CYAN);
		painel_dir_dados.setBackground(Color.CYAN);
		painel_dados.setBackground(Color.CYAN);
		painel_botoes.setBackground(Color.CYAN);
		
		cont.add(painel_esq);
		cont.add(painel_dir);
		painel_botoes.add(btCancelar);
		painel_botoes.add(btOk);
		 
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//                            new TelaRegistoUsuario();
                            dispose();
			}
		});
		
		btOk.addActionListener(new ActionListener() {
		
			boolean passou=false;
			public void actionPerformed(ActionEvent e) {
			  for(int i=0;i<passWord.length && passou==false;i++) {
				  if(names[i].equalsIgnoreCase(tfUsuario.getText()) && !tfUsuario.getText().equalsIgnoreCase(""))
				  {
					 
					  if(passWord[i]==Integer.parseInt(pfSenha.getText()) && !pfSenha.getText().equalsIgnoreCase(""))
					  {
						  JOptionPane.showMessageDialog(null,"Sessao iniciada com sucesso! Bem vindo");
//						  new TelaDevedor();
						  passou=true;
					  }
					  else {
						  JOptionPane.showMessageDialog(null,"Erro");
					  }
				  }
				  else {
					  JOptionPane.showMessageDialog(null,"Erro");
				  }
			  }
				
			}
			
		});
		
		setSize(500,380);
		setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
	}
//	public void lerUser()
//	{
//		
//		StringTokenizer str;
//		String linha,pass,user;
//		int posicao=0;
//		try
//		{
//			BufferedReader fr = new BufferedReader(new FileReader("senha.txt"));
//			linha = fr.readLine();
//			while(linha!=null)
//			{
//				str = new StringTokenizer(linha,";");
//				user=str.nextToken();
//				pass=str.nextToken();
//				names[posicao]=user;
//				passWord[posicao]=Integer.parseInt(pass);
//				posicao++;
//				linha = fr.readLine();
//				
//			}
//			fr.close();
//		}
//		catch(FileNotFoundException f)
//		{
//			System.out.println("Ficheiro de texto nao encontrado!");
//		}
//		catch(IOException ie)
//		{
//			System.out.println(ie.getMessage());
//		}
//	}
	
	  public static void main(String[] args) {
	        
	      new Login_Screan();
	  
	    }


}
