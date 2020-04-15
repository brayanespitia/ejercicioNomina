package Tabla;

import DAO.TipoconceptoDAO;
import VO.TipoconceptoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_TipoconceptoVO{

   TipoconceptoDAO dao = null;


    public void visualizar_TipoconceptoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id");
        dt.addColumn("descripcion");

        dao = new TipoconceptoDAO();
        TipoconceptoVO vo = new TipoconceptoVO();
        ArrayList<TipoconceptoVO> list = dao.Listar_TipoconceptoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[2];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getDescripcion();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


