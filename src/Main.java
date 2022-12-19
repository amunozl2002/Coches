
import java.util.Random;
import java.util.Scanner;
public class Main {
     Random rnd = new Random();
    static Coche coche1 = new Coche();
    static Coche coche2 = new Coche();
    static Coche coche3 = new Coche();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;

        do {
            asignarVelocidad();
            coche1.dibujarVelocidad();
            coche1.dibujarProgreso();
            coche2.dibujarVelocidad();
            coche2.dibujarProgreso();
            coche3.dibujarVelocidad();
            coche3.dibujarProgreso();
            System.out.println("¿Quieres hacer otra iteración? Pulsa 1");
        } while (Integer.parseInt(teclado.nextLine()) == 1 );





    }


    public static void asignarVelocidad() {
        Random rnd = new Random();
        int cantidad = rnd.nextInt(-80, 80);
        int opc = rnd.nextInt(3);
        System.out.println(cantidad + " " + opc);
        switch (opc) {
            case 0:
                if (cantidad > 0) {
                    coche1.acelerar(cantidad);
                } else {
                    coche1.frenar(cantidad);
                }
                break;
            case 1:
                if (cantidad > 0) {
                    coche2.acelerar(cantidad);
                } else {
                    coche2.frenar(cantidad);
                }
                break;
            case 2:
                if (cantidad > 0) {
                    coche3.acelerar(cantidad);
                } else {
                    coche3.frenar(cantidad);
                }
                break;
        }
    }
}