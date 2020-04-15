package DAO;

import Conexion.Conectar;
import VO.EmpleadoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class EmpleadoDAO{

/*Metodo listar*/
    public ArrayList<EmpleadoVO> Listar_EmpleadoVO(){
        ArrayList<EmpleadoVO> list = new ArrayList<EmpleadoVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM empleado;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                EmpleadoVO vo = new EmpleadoVO();
                vo.setCodigo(rs.getString(1));
                vo.setCedula(rs.getString(2));
                vo.setNombre(rs.getString(3));
                vo.setFechanacimiento(rs.getString(4));
                vo.setFechaingreso(rs.getString(5));
                vo.setFecharetiro(rs.getString(6));
                list.add(vo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return list;
    }


/*Metodo agregar*/
    public void Agregar_EmpleadoVO(EmpleadoVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO empleado (codigo, cedula, nombre, fechanacimiento, fechaingreso, fecharetiro) VALUES(?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCodigo());
            ps.setString(2, vo.getCedula());
            ps.setString(3, vo.getNombre());
            ps.setString(4, vo.getFechanacimiento());
            ps.setString(5, vo.getFechaingreso());
            ps.setString(6, vo.getFecharetiro());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Modificar*/
    public void Modificar_EmpleadoVO(EmpleadoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE empleado SET cedula = ?, nombre = ?, fechanacimiento = ?, fechaingreso = ?, fecharetiro = ? WHERE codigo = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCodigo());
            ps.setString(2, vo.getCedula());
            ps.setString(3, vo.getNombre());
            ps.setString(4, vo.getFechanacimiento());
            ps.setString(5, vo.getFechaingreso());
            ps.setString(6, vo.getFecharetiro());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Eliminar*/
    public void Eliminar_EmpleadoVO(EmpleadoVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM empleado WHERE codigo = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCodigo());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


}
