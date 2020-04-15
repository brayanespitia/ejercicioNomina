package DAO;

import Conexion.Conectar;
import VO.LiquidacionVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class LiquidacionDAO{

/*Metodo listar*/
    public ArrayList<LiquidacionVO> Listar_LiquidacionVO(){
        ArrayList<LiquidacionVO> list = new ArrayList<LiquidacionVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM liquidacion;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                LiquidacionVO vo = new LiquidacionVO();
                vo.setCodmodelo(rs.getInt(1));
                vo.setCodconcepto(rs.getString(2));
                vo.setCodempleado(rs.getString(3));
                vo.setNumproceso(rs.getInt(4));
                vo.setValor(rs.getObject(5));
                vo.setFecha(rs.getString(6));
                vo.setId(rs.getInt(7));
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
    public void Agregar_LiquidacionVO(LiquidacionVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO liquidacion (codmodelo, codconcepto, codempleado, numproceso, valor, fecha, id) VALUES(?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodmodelo());
            ps.setString(2, vo.getCodconcepto());
            ps.setString(3, vo.getCodempleado());
            ps.setInt(4, vo.getNumproceso());
            ps.setObject(5, vo.getValor());
            ps.setString(6, vo.getFecha());
            ps.setInt(7, vo.getId());
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
    public void Modificar_LiquidacionVO(LiquidacionVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE liquidacion SET codconcepto = ?, codempleado = ?, numproceso = ?, valor = ?, fecha = ?, id = ? WHERE codmodelo = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodmodelo());
            ps.setString(2, vo.getCodconcepto());
            ps.setString(3, vo.getCodempleado());
            ps.setInt(4, vo.getNumproceso());
            ps.setObject(5, vo.getValor());
            ps.setString(6, vo.getFecha());
            ps.setInt(7, vo.getId());
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
    public void Eliminar_LiquidacionVO(LiquidacionVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM liquidacion WHERE codmodelo = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodmodelo());
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
