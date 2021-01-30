import java.util.Arrays;

public class cine {
    public static void main(String[] args) {
        System.out.println("Inicio del cine");
        cine sala = new cine();
        sala.semimain();
    }
    public void semimain (){
        String[] sala1 = new String[25];
        Arrays.fill(sala1, "Vacio");
        bucle();
    }

    public void bucle (){
        boolean acabar=false;
        double dineroaleatorio = (double) ((Math.random() * 50)+1);
        double dineroaleatorio2 = redondearDecimales(dineroaleatorio,2);

        double precioentrada = 6.50;
        int edadminima = 12;

        int edadaleatoria=(int) ((Math.random() * 80)+1);
        while (!acabar){
            persona p1 = new persona(dineroaleatorio2,edadaleatoria);
            System.out.println(p1.getdinero());
            System.out.println(p1.getEdad());
            if (p1.getdinero() > precioentrada && p1.getEdad() > edadminima) {

            }else{
                bucle();
            }
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
