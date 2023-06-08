/*
    Segundo proyecto del curso "Java en 13 Días con Aplicaciones del Mundo Real!"
    Aprende Java, Spring Boot, Swing, Java FX, JSPs, Thymeleaf, JSF-PrimeFaces,
    FullStack con Angular, React y Spring Boot!
    https://www.udemy.com/course/aprende-java-en-13-dias-con-aplicaciones-del-mundo-real-spring/
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListadoPersonasApp {
    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    //Definimos la lista fuera del ciclo while
    List<Persona> personas = new ArrayList<>();
    //Empezamos con el menú
    var salir = false;
    while(!false){
        mostrarMenu();
        try {
            salir = ejecutarOperacion(consola, personas);
        } catch(Exception e){
            System.out.println("Ocurrió un error:" + e.getMessage());
        }

        System.out.println();
    } //fin while
    } //fin main

    private static void mostrarMenu(){
        //Mostramos las opciones
        System.out.print("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la Opción: ");
    }//fin mostrarMenu

    private static void ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        //Revisamos la opción proporcionada
        switch(opcion){
            case 1 -> {//Agregar persona a la lista
                // Entrada de los atributos de la persona por teclado
                System.out.print("Proporciona el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el teléfono: ");
                var tel = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var email = consola.nextLine();
                //Crear el objeto tipo Persona
                var persona = new Persona(nombre, tel, email);
                //Agregamos el objeto persona creado a la lista de personas
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos" );
            }//fin caso 1
            
        }//fin switch
    }//fin ejecutarOperacion

} // fin clase Main