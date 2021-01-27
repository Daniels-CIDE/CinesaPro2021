public class persona {
    private double dinero;
    private int edad;
    public persona(double dinero,int edad) {
        this.dinero = dinero;
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public double getdinero() {
        return this.dinero;
    }
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
