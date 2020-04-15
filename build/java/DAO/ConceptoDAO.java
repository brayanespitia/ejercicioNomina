package DAO;

import Conexion.Conectar;
import VO.ConceptoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ConceptoDAO{

/*Metodo listar*/
    public ArrayList<ConceptoVO> Listar_ConceptoVO(){
        ArrayList<ConceptoVO> list = new ArrayList<ConceptoVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM concepto;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ConceptoVO vo = new ConceptoVO();
                vo.setCodconcepto(rs.getString(1));
                vo.setDescripcion(rs.getString(2));
                vo.setTipo(rs.getInt(3));
                vo.setCodtercero(rs.getString(4));
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
    public void Agregar_ConceptoVO(ConceptoVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO concepto (codconcepto, descripcion, tipo, codtercero) VALUES(?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCodconcepto());
            ps.setString(2, vo.getDescripcion());
            ps.setInt(3, vo.getTipo());
            ps.setString(4, vo.getCodtercero());
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
    public void Modificar_ConceptoVO(ConceptoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE concepto SET descripcion = ?, tipo = ?, codtercero = ? WHERE codconcepto = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCodconcepto());
            ps.setString(2, vo.getDescripcion());
            ps.setInt(3, vo.getTipo());
            ps.setString(4, vo.getCodtercero());
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
    public void Eliminar_ConceptoVO(ConceptoVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM concepto WHERE codconcepto = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCodconcepto());
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
