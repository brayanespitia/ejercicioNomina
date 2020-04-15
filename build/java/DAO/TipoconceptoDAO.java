package DAO;

import Conexion.Conectar;
import VO.TipoconceptoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class TipoconceptoDAO{

/*Metodo listar*/
    public ArrayList<TipoconceptoVO> Listar_TipoconceptoVO(){
        ArrayList<TipoconceptoVO> list = new ArrayList<TipoconceptoVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tipoconcepto;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                TipoconceptoVO vo = new TipoconceptoVO();
                vo.setId(rs.getInt(1));
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
    public void Agregar_TipoconceptoVO(TipoconceptoVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tipoconcepto (id, descripcion) VALUES(?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId());
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
    public void Modificar_TipoconceptoVO(TipoconceptoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tipoconcepto SET descripcion = ? WHERE id = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId());
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
    public void Eliminar_TipoconceptoVO(TipoconceptoVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tipoconcepto WHERE id = ?;";
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
