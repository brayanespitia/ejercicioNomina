package Tabla;

import DAO.ConceptoDAO;
import VO.ConceptoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ConceptoVO{

   ConceptoDAO dao = null;


    public void visualizar_ConceptoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codconcepto");
        dt.addColumn("descripcion");
        dt.addColumn("tipo");
        dt.addColumn("codtercero");

        dao = new ConceptoDAO();
        ConceptoVO vo = new ConceptoVO();
        ArrayList<ConceptoVO> list = dao.Listar_ConceptoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getCodconcepto();
                fila[1] = vo.getDescripcion();
                fila[2] = vo.getTipo();
                fila[3] = vo.getCodtercero();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


