package VO;

public class ConceptoVO {

/*Todo los atributos*/
    String codconcepto;
    String descripcion;
    int tipo;
    String codtercero;

public ConceptoVO(){}

/*Todo los codigos get*/
    public String getCodconcepto(){
        return codconcepto;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getTipo(){
        return tipo;
    }
    public String getCodtercero(){
        return codtercero;
    }


/*Todo los codigos set*/
    public void setCodconcepto(String codconcepto){
        this.codconcepto = codconcepto;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    public void setCodtercero(String codtercero){
        this.codtercero = codtercero;
    }

}
