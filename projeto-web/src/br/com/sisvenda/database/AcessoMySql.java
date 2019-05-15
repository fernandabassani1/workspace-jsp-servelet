/*
 * AcessoMySql.java
 *
 * Created on 3 de Fevereiro de 2008, 16:06
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.com.sisvenda.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class AcessoMySql {
    
    Connection con;
    
    public AcessoMySql() {
    }
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/sisvendas?user=root&password=root");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("N�o foi poss�vel encontrar o Driver!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("N�o foi poss�vel conectar ao banco!");
        }
        return con;
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
