/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erecem
 */
public class MascotaData {
    private Connection connection = null;

public MascotaData (Conexion conexion) throws SQLException{
    
    connection = conexion.getConexion();
    
}

    
 public void  guardarMascota(Mascota mascota){
     String sql = "INSERT INTO mascota (especie,raza,colorPelo,sexo,alias,feNac,codigo,idcliente) VALUES (?,?,?,?,?,?,?,?,?);";
     
     
     
     
        try {
         PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        statement.setString(1, mascota.getEspecie());
        statement.setString(2, mascota.getRaza());
        statement.setString(3, mascota.getColorPelo());
        statement.setString(4, mascota.getSexo());
        statement.setString(5, mascota.getAlias());
        statement.setDate(6, Date.valueOf(mascota.getFeNac()));
        statement.setInt(7, mascota.getCodigo());
        statement.setInt(8,mascota.getCliente().getId() );
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        
 }
  public List<Mascota> obtenerMascota(){
        List<Mascota> mascotas = new ArrayList<>();
            

        try {
            String sql;
            sql = "SELECT * FROM cliente;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                Mascota mascota;
          
                while(resultSet.next()){
                    mascota= new Mascota();
                    mascota.setEspecie(resultSet.getString("especie"));
                    mascota.setRaza(resultSet.getString("raza"));
                    mascota.setColorPelo(resultSet.getString("colorPelo"));
                    mascota.setSexo(resultSet.getString("sexo"));
                    mascota.setAlias(resultSet.getString("Alias"));
                    mascota.setFeNac(resultSet.getDate("feNac").toLocalDate());
                    mascota.setCodigo(resultSet.getInt("codigo"));
                    mascota.setId(resultSet.getInt("cliente"));
                   
                    mascotas.add(mascota);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }
        
        
        return mascotas;
     }

    
     
    public void borrarMascota(int id){
    try {
            
            String sql = "DELETE FROM mascota WHERE id =?;";

        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, id);
            
            
            statement.executeUpdate();
        }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una mascota: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarMascota(Mascota mascota){
    
        try {
            
            String sql = "UPDATE alumno SET nombre = ?, fecNac = ? , activo =? WHERE id = ?;";

            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
               statement.setString(1, mascota.getEspecie());
               statement.setString(2, mascota.getRaza());
               statement.setString(3, mascota.getColorPelo());
               statement.setString(4, mascota.getSexo());
               statement.setString(5, mascota.getAlias());
               statement.setDate(6, Date.valueOf(mascota.getFeNac()));
               statement.setInt(7, mascota.getCodigo());
               statement.setInt(8,mascota.getCliente().getId() );
               statement.executeUpdate();
            }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un mascota: " + ex.getMessage());
        }
    
    }
    
     public Mascota buscarMascota(int id){
    Mascota mascota=null;
    try {
            
            String sql = "SELECT * FROM mascota WHERE id =?;";

        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, id);
            
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                mascota = new Mascota();
                mascota.setEspecie(resultSet.getString("especie"));
                mascota.setRaza(resultSet.getString("raza"));
                mascota.setColorPelo(resultSet.getString("colorPelo"));
                mascota.setSexo(resultSet.getString("sexo"));
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setFeNac(resultSet.getDate("feNac").toLocalDate());
                mascota.setCodigo(resultSet.getInt("codigo"));
                mascota.setId(resultSet.getInt("cliente"));
                
                
                
                
            }
        }
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un mascota: " + ex.getMessage());
        }
        
        return mascota;
    }

}
