/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.Login_GUI;
import View.Splash_GUI;
import static View.Splash_GUI.MENSAGEM;
import static View.Splash_GUI.PROGRESSO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alunos
 */
public class Splash_DAO {
    public static void carrega(){
      new Thread(){
        
            public void run() {
        
        
        for (int i=0; i<101; i++){
                    try {
                        sleep(60); 
                        
                        PROGRESSO.setValue(i);
                        
                        if(PROGRESSO.getValue() == 10){
                        
                            MENSAGEM.setText("Fazendo a conexao com o banco de dados");
                            //driver_conexao.carregardriver();
                            sleep(2000);
                                                       
                        
                        }else if (PROGRESSO.getValue() <=30){
                            MENSAGEM.setText("Carregando o sistema");
                          sleep(100);  
                        } else if (PROGRESSO.getValue() <=99){
                            MENSAGEM.setText("Carregamento quase completo");
                            
                        }else{
                            MENSAGEM.setText("Carregamento completo. Seu programa sera iniciado.");
                        
                        sleep(3000);
                        
                new Login_GUI().setVisible(true);
                        }
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        
        
        
        }        
        }
        
        }.start();
        
    }
    
    }

