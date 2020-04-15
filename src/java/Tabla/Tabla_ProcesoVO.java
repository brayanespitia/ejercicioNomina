package Tabla;

import DAO.ProcesoDAO;
import VO.ProcesoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ProcesoVO{

   ProcesoDAO dao = null;


    public void visualizar_ProcesoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id");
        dt.addColumn("descripcion");
        dt.addColumn("fechainicio");
        dt.addColumn("fechafin");

        dao = new ProcesoDAO();
        ProcesoVO vo = new ProcesoVO();
        ArrayList<ProcesoVO> list = dao.Listar_ProcesoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getDescripcion();
                fila[2] = vo.getFechainicio();
                fila[3] = vo.getFechafin();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


