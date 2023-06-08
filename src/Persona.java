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
    //Getters and Setters
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String emil){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args){
        Persona persona1 = new Persona("Juan Perez", "55443322", "juan@curso.com");
        System.out.println(persona1);
    }
}

