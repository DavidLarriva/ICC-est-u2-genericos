import Models.Personas;
import Models.Genericos.Caja;
import Models.Genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {

        //CLASE CAJA
        System.out.println();
        System.out.println("CLASE CAJA");
        System.out.println();
        
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInt = new Caja<>();
        Caja<Personas> cajaPersona = new Caja<>();
        
        Personas persona = new Personas();
        persona.setNombre("Arianna");
        persona.setEdad(10);

        cajaString.guardar("Guardo un String");
        cajaInt.guardar(10);
        cajaPersona.guardar(persona);

        System.out.println(cajaString);

        System.out.println(cajaInt);

        System.out.println(cajaString.getT());
        System.out.println(cajaInt.getT());
        System.out.println(cajaPersona.getT().getNombre());

         //CLASE PAR
        
        System.out.println();
        System.out.println("CLASE PAR");
        System.out.println();

        Par<Integer, String> parIntengerString = new Par<>();
        
        parIntengerString.establecerClave(10);
        parIntengerString.establecerValor("xd");

        System.out.println(parIntengerString.obtenerValor());
        System.out.println(parIntengerString.obtenerClave());

        //--------------------------------------

        Personas personas[] = {

            new Personas("Maria", 18), 
            new Personas("David",10), 
            new Personas("Eulalia", 20), 
            new Personas("Pablo", 30),
            new Personas("Arinna", 70),
            new Personas("Mario", 23),
            new Personas("John", 17),
            new Personas("Esteban", 13),
            new Personas("Lucio", 11),
            new Personas("Alex", 47),

            
        };

        int personasMayores = 0;
        int personasMenores = 0;

        for(int i = 0; i < personas.length; i++) {
            if(personas[i].getEdad() > 18) {
                personasMayores++;
                } else
                personasMenores++;
                }
                


        Par<String, Integer>[] mayores = new Par[personasMayores];
        Par<Integer, String>[] menores = new Par[personasMenores];

        int contadorMayores = 0;
        int contadorMenores = 0;

        for(int i =0;i<personas.length;i++) {
            if (personas[i].getEdad() >= 18){
                mayores[contadorMayores] = new Par<String,Integer> ();
                mayores[contadorMayores].establecerClave(personas[i].getNombre());
                mayores[contadorMayores].establecerValor(personas[i].getEdad());
                contadorMayores++;
                } else {
                    menores[contadorMenores] = new Par<Integer,String>();
                    menores[contadorMenores].establecerClave(personas[i].getEdad());
                    menores[contadorMenores].establecerValor(personas[i].getNombre());
                    contadorMenores++;

                }
                


            }
        

        
        System.out.println("Personas mayores de edad: " + contadorMayores);
        for(Par<String,Integer> mayoress : mayores) {
        System.out.println(mayoress.obtenerClave() + " " + mayoress.obtenerValor());

        }

        System.out.println();

        System.out.println("Personas menores de edad: " + contadorMenores);
        for(Par<Integer,String> menoresss : menores) {
            System.out.println(menoresss.obtenerClave() + " " + menoresss
            .obtenerValor());
        }






    }
}
