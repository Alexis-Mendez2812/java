public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       var resultado =  suma(10,20, 30);

        Coche miCoche = new Coche();
        miCoche.setPuertas();

        System.out.println(miCoche.puertas);
        System.out.println(resultado);
        var numeroIf = 0;

    if(numeroIf>0){
        System.out.println("numeroIf es positivo");
    }else if(numeroIf<0){
        System.out.println("numeroIf es negativo");
    }else {
        System.out.println("numeroIf es " + numeroIf );
        }
    int numeroWhile = 0;

    while(numeroWhile<3){
        numeroWhile++;
        System.out.println(numeroWhile);
    }

        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while(numeroWhile<3);

        int numeroFor = 0;
        for (int i = 0; i <=3 ; i++) {
            numeroFor++;
            System.out.println(numeroFor);
        }


        var estacion = "LUNA";

    switch (estacion){
        case "VERANO":
            System.out.println("es verano");
            break;
        case "INVIERNO":
            System.out.println("es invierno");
            break;
        case "PRIMAVERA":
            System.out.println("es primavera");
            break;
        case "OTOÑO":
            System.out.println("es otoño");
            break;
        default:
            System.out.println("no es estacion" );
    }

       /* Persona Carlos = new Persona();
        Carlos.setNombre("Carlos");
        Carlos.setEdad(26);
        Carlos.setTelefono(12345678);
        System.out.println("Hola soy " + Carlos.getNombre() + " tengo " + Carlos.getEdad() + " años de edad y mi numero de telefono es " + Carlos.getTelefono() );
*/
        Cliente erika = new Cliente();
        erika.telefono=12345678;
        erika.edad=42;
        erika.nombre="erika";
        erika.credito=true;
        System.out.println("Hola soy " + erika.nombre + " tengo " + erika.edad + " años de edad y mi numero de telefono es " + erika.telefono + " tengo credito? :" + erika.credito );

        Trabajador Alexis = new Trabajador();
        Alexis.telefono=87654321;
        Alexis.edad=26;
        Alexis.nombre="Alexis";
        Alexis.salario="USD$ 1.200";
        System.out.println("Hola soy " + Alexis.nombre + " tengo " + Alexis.edad + " años de edad y mi numero de telefono es " + Alexis.telefono + " tengo un rrree salario de: " + Alexis.salario);

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


class Persona{
     int edad;
     String nombre;
     int telefono;

}
 class Cliente extends Persona{
    boolean credito;
 }


 class Trabajador extends Persona{
    String salario;

 }