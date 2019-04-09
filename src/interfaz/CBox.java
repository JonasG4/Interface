package interfaz;

public class CBox implements IBox{
    private Object objeto;
    
    public CBox (){
    this.objeto=null;
    }
    
    public Object get(){
    return this.objeto;
    }
    
    public void put(Object objeto){
    this.objeto=objeto;
    }

    public void ObtenerClase(CBox cbox) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
