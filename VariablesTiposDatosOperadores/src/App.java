import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Variables");
        //Nombres de variables puede ser:
        //Iniciar con minuscula: edad
        //Iniciar con mayuscula: Edad (NO SE RECOMIENDA)
        //Nombres complejos: edadEstudiante
        //Iniciar con guion bajo: _edadEstudiante
        //No pueden iniciar con numero
        //No pueden iniciar con caracteres especiales
        //No pueden llevar espacios en blanco

        //Declaracion del dispositivo de entrada estandar
        Scanner lector = new Scanner(System.in);
        //Declaracion de variables
        float altura, anchura, largo;
        //Solicitar datos de entrada al usuario
        System.out.println("Altura: ");
        altura = lector.nextFloat();
        System.out.println("Anchura: ");
        anchura = lector.nextFloat();
        System.out.println("Largo: ");
        largo = lector.nextFloat();
        //Procesar esos datos de entrada
        float volumen = altura * anchura * largo;
        //Mostrar los resultados
        System.out.println("El volumen es: " + volumen + " metros cubicos.");
        //Cerrar el dispositivo de entrada estandar
        lector.close();
    }
}
