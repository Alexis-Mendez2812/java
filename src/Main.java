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

        Persona Carlos = new Persona();
        Carlos.setNombre("Carlos");
        Carlos.setEdad(26);
        Carlos.setTelefono(12345678);
        System.out.println("Hola soy " + Carlos.getNombre() + " tengo " + Carlos.getEdad() + " años de edad y mi numero de telefono es " + Carlos.getTelefono() );


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

//Crear clase Persona.
//
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//
//Crear gets y sets de cada propiedad.
//
//Crear un objeto persona en el main.

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}