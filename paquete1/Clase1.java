package paquete1;

public class Clase1 {
    public int x;
    protected int y;
    private int z;
    int w; //default
    

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }
    
    @Override
    public String toString() {
        return "Clase1 [y=" + y + "z=" + z +"]";
    }

    
}
