public class Persona {
    //Atributos
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //Constructor vacío
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    //Constructor con argumentos
    public Persona(String nombre, String tel, String email){
        this(); //Se llama al constructor vacío
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }
}
