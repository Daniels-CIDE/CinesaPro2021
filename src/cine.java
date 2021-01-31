import java.util.Arrays;

public class cine {
    public String[] sala1 = new String[25];
    public static void main(String[] args) {
        System.out.println("Inicio del cine");
        System.out.println("---------------------");
        cine sala = new cine();
        sala.semimain();
    }
    public void semimain (){
        Arrays.fill(sala1, "Vacio");
        long startTime = System.nanoTime();
        bucle();
        for(int subir=0; subir<sala1.length; subir++){
            System.out.println(sala1[subir]);
        }
        long endTime = System.nanoTime() - startTime;
        System.out.println("---------------------");
        System.out.println(endTime+" Tiempo en nano segundos");

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

            if (p1.getdinero() > precioentrada && p1.getEdad() > edadminima) {
                int asientorandom = (int) ((Math.random() * sala1.length));
                if (sala1[asientorandom].equals("Ocupado")){
                    while (sala1[asientorandom].equals("Ocupado")){
                        asientorandom = (int) ((Math.random() * sala1.length));
                    }
                    sala1[asientorandom]="Ocupado";
                }else if (sala1[asientorandom].equals("Vacio")){
                    sala1[asientorandom]="Ocupado";
                }

            }else{
                bucle();
            }
            for (int i = 0; i < sala1.length; ++i) {
                if (sala1[i].equals("Ocupado")){

                }else if (sala1[i].equals("Vacio")){
                    bucle();
                }
            }
            if (sala1[sala1.length-1].equals("Ocupado"))
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
