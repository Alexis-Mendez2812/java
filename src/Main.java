public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       var resultado =  suma(10,20, 30);

        Coche miCoche = new Coche();
        miCoche.setPuertas();

        System.out.println(miCoche.puertas);
        System.out.println(resultado);
    }

    public static int suma(int a,int b,int c) {
        return a + b + c;
    }
}
class Coche {
   public int puertas = 4;

    public void setPuertas() {
        this.puertas++;
    }
}