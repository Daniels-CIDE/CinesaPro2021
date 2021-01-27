import java.util.Random;

public class cine {
    public static void main(String[] args) {
        System.out.println("Inicio del cine");
        cine sala = new cine();
        sala.bucle();
    }
    public void bucle (){
        String[] sala1 = new String[25];

        boolean acabar=false;
        //double dineroaleatorio = (double) (new Random().nextInt(10001))/100;
        double dineroaleatorio = (double) ((Math.random() * 50)+1);
        double dineroaleatorio2 = redondearDecimales(dineroaleatorio,2);

        double precioentrada = 6.50;
        int edadminima = 12;

        int edadaleatoria=(int) ((Math.random() * 80)+1);
        while (!acabar){
            persona p1 = new persona(dineroaleatorio2,edadaleatoria);
            System.out.println(p1.getdinero());
            System.out.println(p1.getEdad());
            acabar=true;
        }
    }
    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }
}
