/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

/**
 *
 * @author kaua
 */
import javax.swing.JOptionPane;
import java.sql.*;

public class conexao {
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/banco";
    final private String usuario = "root";
    final private String senha = "";
    private Connection Conexao;
    public Statement statement;
    public ResultSet resultset;

    public boolean conecta(){
        boolean result = true;
        try{
            Class.forName(driver);
            Conexao = DriverManager.getConnection(url,usuario,senha);
            JOptionPane.showMessageDialog(null, "Conexão estabelecida", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }catch (ClassNotFoundException Driver){
           JOptionPane.showMessageDialog(null, "Driver não localizado"+Driver, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        result = false;
        }catch(SQLException Fonte){
            JOptionPane.showMessageDialog(null, "Fonte de Dados não localizada"+Fonte, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        result = false;
        }
        return result;
    }
    public void desconecta(){
        try{
            Conexao.close();
            JOptionPane.showMessageDialog(null, "Conexão com banco fechada","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException fecha){
            
        }
    }
    public void executaSQL(String sql){
        try{
            statement = Conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }catch(SQLException excecao){
            JOptionPane.showMessageDialog(null, "Erro no comando SQL!  \n Erro: "+excecao,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
