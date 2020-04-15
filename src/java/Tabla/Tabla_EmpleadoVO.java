package Tabla;

import DAO.EmpleadoDAO;
import VO.EmpleadoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_EmpleadoVO{

   EmpleadoDAO dao = null;


    public void visualizar_EmpleadoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codigo");
        dt.addColumn("cedula");
        dt.addColumn("nombre");
        dt.addColumn("fechanacimiento");
        dt.addColumn("fechaingreso");
        dt.addColumn("fecharetiro");

        dao = new EmpleadoDAO();
        EmpleadoVO vo = new EmpleadoVO();
        ArrayList<EmpleadoVO> list = dao.Listar_EmpleadoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[6];
                vo = list.get(i);
                fila[0] = vo.getCodigo();
                fila[1] = vo.getCedula();
                fila[2] = vo.getNombre();
                fila[3] = vo.getFechanacimiento();
                fila[4] = vo.getFechaingreso();
                fila[5] = vo.getFecharetiro();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


