package Tabla;

import DAO.LiquidacionDAO;
import VO.LiquidacionVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_LiquidacionVO{

   LiquidacionDAO dao = null;


    public void visualizar_LiquidacionVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codmodelo");
        dt.addColumn("codconcepto");
        dt.addColumn("codempleado");
        dt.addColumn("numproceso");
        dt.addColumn("valor");
        dt.addColumn("fecha");
        dt.addColumn("id");

        dao = new LiquidacionDAO();
        LiquidacionVO vo = new LiquidacionVO();
        ArrayList<LiquidacionVO> list = dao.Listar_LiquidacionVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getCodmodelo();
                fila[1] = vo.getCodconcepto();
                fila[2] = vo.getCodempleado();
                fila[3] = vo.getNumproceso();
                fila[4] = vo.getValor();
                fila[5] = vo.getFecha();
                fila[6] = vo.getId();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


