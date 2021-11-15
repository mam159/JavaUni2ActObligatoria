import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, ingrese su nombre: ");
        String name = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        String lastName = sc.nextLine();
        System.out.println("Indique su edad: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su hobbie: ");
        String hob = sc.nextLine();
        System.out.println("¿Cual es su editor de código preferido? ");
        String edit = sc.nextLine();
        System.out.println("¿Qué sistema operativo utilizas? ");
        String system = sc.nextLine();
        System.out.println("Gracias por responder, usted se llama " + name + " " + lastName + " " + " y tiene " + age + " años. \nSu hobbie es " + hob + " y su editor de código preferido es " + edit + ". El sistema operativo utilizado es " + system + ".\n ");
    }
    }
