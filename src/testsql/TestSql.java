/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsql;
import java.sql.*;
import  java.io.*;
import java.*;
//hola esto es una modificacion hecha en el mac.


/**
 *
 * @author pablo
 */

public class TestSql  {
  public static void main (String args []) throws SQLException
  {
    try 
    {
     Class.forName ("oracle.jdbc.driver.OracleDriver");
    } 
    catch (ClassNotFoundException e) 
    {
     e.printStackTrace();
    }

    Connection conn = DriverManager.getConnection
             //("jdbc:oracle:oci:OIM_SOA_CONS/gf_qwer3243@10.53.8.112");
             ("jdbc:oracle:thin:OIM_SOA_CONS/gf_qwer3243@10.53.8.112:1522:G94DOT01");

    Statement stmt = conn.createStatement();
    ResultSet rset = 
              stmt.executeQuery("select nif from tmp_mario");
    while (rset.next())
          System.out.println (rset.getString(1));   // Print col 1
    stmt.close();
  }
 }

