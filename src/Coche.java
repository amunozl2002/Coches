public class Coche {
    private int velocidad;

    public Coche() {
        this.velocidad = 0;
    }

    public void acelerar(int cantidad) {
        this.velocidad += cantidad;
    }

    public void frenar(int cantidad) {
        this.velocidad -= cantidad;
    }

    public void dibujarProgreso() {
        for (int i = 0; i < ( this.velocidad / 5 ); i++) {
            System.out.print("-");
        }
        System.out.println("\uD83D\uDE97");
    }

    public void dibujarVelocidad() {
        System.out.print("[" + getVelocidad() + "]");
    }

    public int getVelocidad() {
        return this.velocidad;
    }
}