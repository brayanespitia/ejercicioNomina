package DAO;

import Conexion.Conectar;
import VO.ProcesoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProcesoDAO{

/*Metodo listar*/
    public ArrayList<ProcesoVO> Listar_ProcesoVO(){
        ArrayList<ProcesoVO> list = new ArrayList<ProcesoVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM proceso;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ProcesoVO vo = new ProcesoVO();
                vo.setId(rs.getInt(1));
                vo.setDescripcion(rs.getString(2));
                vo.setFechainicio(rs.getString(3));
                vo.setFechafin(rs.getString(4));
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
    public void Agregar_ProcesoVO(ProcesoVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO proceso (id, descripcion, fechainicio, fechafin) VALUES(?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId());
            ps.setString(2, vo.getDescripcion());
            ps.setString(3, vo.getFechainicio());
            ps.setString(4, vo.getFechafin());
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
    public void Modificar_ProcesoVO(ProcesoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE proceso SET descripcion = ?, fechainicio = ?, fechafin = ? WHERE id = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId());
            ps.setString(2, vo.getDescripcion());
            ps.setString(3, vo.getFechainicio());
            ps.setString(4, vo.getFechafin());
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
    public void Eliminar_ProcesoVO(ProcesoVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM proceso WHERE id = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId());
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
