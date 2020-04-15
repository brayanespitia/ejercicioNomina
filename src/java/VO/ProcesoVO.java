package VO;

public class ProcesoVO {

/*Todo los atributos*/
    int id;
    String descripcion;
    String fechainicio;
    String fechafin;

public ProcesoVO(){}

/*Todo los codigos get*/
    public int getId(){
        return id;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getFechainicio(){
        return fechainicio;
    }
    public String getFechafin(){
        return fechafin;
    }


/*Todo los codigos set*/
    public void setId(int id){
        this.id = id;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setFechainicio(String fechainicio){
        this.fechainicio = fechainicio;
    }
    public void setFechafin(String fechafin){
        this.fechafin = fechafin;
    }

}
