package DAO;

import Conexion.Conectar;
import VO.TerceroVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class TerceroDAO{

/*Metodo listar*/
    public ArrayList<TerceroVO> Listar_TerceroVO(){
        ArrayList<TerceroVO> list = new ArrayList<TerceroVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tercero;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                TerceroVO vo = new TerceroVO();
                vo.setCodtercero(rs.getString(1));
                vo.setDescripcion(rs.getString(2));
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
    public void Agregar_TerceroVO(TerceroVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tercero (codtercero, descripcion) VALUES(?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCodtercero());
            ps.setString(2, vo.getDescripcion());
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
    public void Modificar_TerceroVO(TerceroVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tercero SET descripcion = ? WHERE codtercero = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCodtercero());
            ps.setString(2, vo.getDescripcion());
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
    public void Eliminar_TerceroVO(TerceroVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tercero WHERE codtercero = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCodtercero());
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
