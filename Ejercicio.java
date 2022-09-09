public class Ejercicio{

    public static void main(String[] args){
        Persona persona = new Persona();

        persona.setNombre("Eduardo");
        persona.setEdad(21);
        persona.setTelefono("123456789");
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Teléfono: " + persona.getTelefono());
    }

}
