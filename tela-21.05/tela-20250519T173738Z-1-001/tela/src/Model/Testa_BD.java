package Model;

import javax.swing.JOptionPane;

public class Testa_BD {
    //---COMEÇO
    public static  void carregaDriver(){
       try { // Conecttando o driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver carregado com sucesso!");




       } catch (Exception ex) { // Erro driver não encontrado
            JOptionPane.showMessageDialog(null, "ERRO 001BD");
        }

    }
    //---FIM
}
