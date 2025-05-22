/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.Cadastrar_GUI;
import static View.Cadastrar_GUI.Marca_txt;
import static View.Cadastrar_GUI.Modelo_txt;
import static View.Cadastrar_GUI.Nome_txt;
import static View.Cadastrar_GUI.Num_txt;
import static View.Cadastrar_GUI.Placa_txt;
import static View.Cadastrar_GUI.cor2_txt;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class Funcoes_DAO {
    
static int id;
static String nome;
static String modelo;
static String marca;
static String cor2;
static String placa;
static int vaga;
static String url2 = "jdbc:mysql://localhost/aprender"; // endereço do BD
static String username = "root"; //nome de um usuário de seu BD
static String password = "";  // senha do BD
   
  
    public static void cadastrar(){
//---INICIO
        
      nome = Nome_txt.getText(); 
      modelo = Modelo_txt.getText(); 
      marca = Marca_txt.getText(); 
      cor2 = cor2_txt.getText();
      placa = Placa_txt.getText(); 
      vaga = Integer.parseInt(Num_txt.getText()); 
      

      Model.Testa_BD.carregaDriver();
       
      try { 
               
                   
               
            Connection con = null;
            
            
    try {
    con = (Connection) DriverManager.getConnection(url2, username, password);
    } catch (SQLException ex) {

    Logger.getLogger(Cadastrar_GUI.class.getName()).log(Level.SEVERE, null, ex);

            
                   }

            // Recebendo os dados a serem inseridos na tabela
              String sql = "INSERT INTO cliente(cli_nome,cli_end, cli_email,cli_tel) values('"+nom+"','"+end+"', '"+em+"','"+tel+"')";

     
            try { // Tratamento de Erros para inserção

                // Criando varialvel que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

            JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!!!\n","",-1);
                Nome_txt.setText("");
                Modelo_txt.setText("");
                Marca_txt.setText("");
		cor2_txt.setText("");
                Placa_txt.setText("");
                Num_txt.setText("");
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
            Placa_txt.setText("");
        }

       
              
  //---FIM
    }
}
