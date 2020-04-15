package VO;

public class LiquidacionVO {

/*Todo los atributos*/
    int codmodelo;
    String codconcepto;
    String codempleado;
    int numproceso;
    Object valor;
    String fecha;
    int id;

public LiquidacionVO(){}

/*Todo los codigos get*/
    public int getCodmodelo(){
        return codmodelo;
    }
    public String getCodconcepto(){
        return codconcepto;
    }
    public String getCodempleado(){
        return codempleado;
    }
    public int getNumproceso(){
        return numproceso;
    }
    public Object getValor(){
        return valor;
    }
    public String getFecha(){
        return fecha;
    }
    public int getId(){
        return id;
    }


/*Todo los codigos set*/
    public void setCodmodelo(int codmodelo){
        this.codmodelo = codmodelo;
    }
    public void setCodconcepto(String codconcepto){
        this.codconcepto = codconcepto;
    }
    public void setCodempleado(String codempleado){
        this.codempleado = codempleado;
    }
    public void setNumproceso(int numproceso){
        this.numproceso = numproceso;
    }
    public void setValor(Object valor){
        this.valor = valor;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public void setId(int id){
        this.id = id;
    }

}
