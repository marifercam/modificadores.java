import paquete1.Clase1;

public class Clase3 {
    
    public void useDataClase1(){
        Clase1 objeto1 = new Clase1();
        objeto1.x = 12;      //public
        objeto1.y = 25;     //protected
        objeto1.setZ(32); //private
        objeto1.W = 38;      //default

    }
    
}
