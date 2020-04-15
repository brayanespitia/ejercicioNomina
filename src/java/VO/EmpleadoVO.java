package VO;

public class EmpleadoVO {

/*Todo los atributos*/
    String codigo;
    String cedula;
    String nombre;
    String fechanacimiento;
    String fechaingreso;
    String fecharetiro;

public EmpleadoVO(){}

/*Todo los codigos get*/
    public String getCodigo(){
        return codigo;
    }
    public String getCedula(){
        return cedula;
    }
    public String getNombre(){
        return nombre;
    }
    public String getFechanacimiento(){
        return fechanacimiento;
    }
    public String getFechaingreso(){
        return fechaingreso;
    }
    public String getFecharetiro(){
        return fecharetiro;
    }


/*Todo los codigos set*/
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFechanacimiento(String fechanacimiento){
        this.fechanacimiento = fechanacimiento;
    }
    public void setFechaingreso(String fechaingreso){
        this.fechaingreso = fechaingreso;
    }
    public void setFecharetiro(String fecharetiro){
        this.fecharetiro = fecharetiro;
    }

}
