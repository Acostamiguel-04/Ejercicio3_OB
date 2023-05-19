// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Miguel");
        System.out.println("El nombre de la persona es: " +persona.getNombre());

        persona.setEdad(19);
        System.out.println("La edad de la persona es: " + persona.getEdad());

        persona.setNumero(1156514708);
        System.out.println("El numero de la persona es: " +persona.getNumero());


    }
}

class Persona{
    private String nombre;
    private int edad;
    private int numero;

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public int getEdad(){
        return this.edad;
    }


    public void setNumero(int numero){
        this.numero=numero;
    }

    public int getNumero(){
        return this.numero;
    }










}


