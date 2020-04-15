package Tabla;

import DAO.TerceroDAO;
import VO.TerceroVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_TerceroVO{

   TerceroDAO dao = null;


    public void visualizar_TerceroVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codtercero");
        dt.addColumn("descripcion");

        dao = new TerceroDAO();
        TerceroVO vo = new TerceroVO();
        ArrayList<TerceroVO> list = dao.Listar_TerceroVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[2];
                vo = list.get(i);
                fila[0] = vo.getCodtercero();
                fila[1] = vo.getDescripcion();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


