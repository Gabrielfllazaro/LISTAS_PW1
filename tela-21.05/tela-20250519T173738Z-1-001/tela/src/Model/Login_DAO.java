
package Model;

import static View.Login_GUI.Login_txt;
import static View.Login_GUI.Senha_txt;
import View.Menu_GUI;
import javax.swing.JOptionPane;



public class Login_DAO {
    public static void Acessando(){
        String login= Login_txt.getText();
        String senha = Senha_txt.getText();
        String login2 = Login_txt.getText();
        String senha2 = Senha_txt.getText();
if(login.equalsIgnoreCase("Gabriel") && senha.equalsIgnoreCase("123")){
    new Menu_GUI().setVisible(true);
    JOptionPane.showMessageDialog(null,"Bem vindo ao sistema");
    new Menu_GUI().setVisible(true);
    }else if(login.equalsIgnoreCase("Leandro") && senha.equalsIgnoreCase("456")){
    new Menu_GUI().setVisible(true);
    JOptionPane.showMessageDialog(null,"Bem vindo ao sistema");
    new Menu_GUI().setVisible(true);
    }else{
    JOptionPane.showMessageDialog(null,"login ou senha invalido");
    }
}

    
}
