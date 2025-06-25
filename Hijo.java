import paquete1.Clase1;

public class Hijo extends Padre{
    private int variable3;
    public int Variable1;

    public Hijo(){
        super();
    }

    public int getVariable3() {
        return variable3;
    }

    public void setVariable3(int variable3) {
        this.variable3 = variable3;
    }

    //modificar las variables de la clase padre
    public void setVarsPadre(){
        //propiedades publico
        super.variable1 = 500;//propiedad public del padre
        this.variable1 = 250;//propiedad public del hijo
        super.setVariable2(-12);

    }
        public void setDataClase1(){
            Clase1 objeto1 = new Clase1();
            objeto1.x = 15;  //public
         
             //Datos protejidos no se pueden usar fuera del paquete1
             //objeto1.Y = 22;
            objeto1.setZ(87);  //Private
            //  Datos tipo default no se pueden usar fuera del paquete1 comportamiento semejante a 
            //objeto1.w = 38;

        }
    

    @Override
    public String toString() {
        return super.toString() + "Hijo [variable3=" + variable3 +  "variable1=" + this.variable1 +"]";
    }
     
    
}
