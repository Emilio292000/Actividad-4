import java.util.Scanner;



public class Main {
    public static void  main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("= Registro de Visitantes =");
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        int edad;
        while (true) {
            System.out.print("Ingrese su edad: ");
            if (scanner.hasNextInt()) {

                edad = scanner.nextInt();
                if (edad < 0 || edad > 105){
                    System.out.println("Numero invalido, intentelo de nuevo.");
                } else {
                    break;
                }

            } else {
                System.out.println("Entrada no valida, intentelo de nuevo.");
                scanner.next();
            }
        }
        scanner.nextLine();

        System.out.println("Tipos de documentos: ");
        System.out.println("D - Documento de identidad");
        System.out.println("P - Pasaporte");
        System.out.println("L - Licencia de conducir");
        System.out.println("C - Carnet de visitante");

        char Tdocumentos;

        while (true) {
            System.out.print("Ingrese el tipo de documento: ");
            Tdocumentos = scanner.next().toUpperCase().charAt(0);
            if (Tdocumentos == 'D' || Tdocumentos == 'P' || Tdocumentos == 'L' || Tdocumentos == 'C') {
                break;
            }else {
                System.out.println("Informacion de documentos invalida. Intente de nuevo.");
            }


            }

            scanner.nextLine();
            System.out.print("Ingrese el numero de Identificacion: ");
            String identificacion = scanner.nextLine();

            int horas;
            while (true) {
                System.out.print("Ingrese tiempo promedio de la visita: ");
                if (scanner.hasNextInt()) {
                    horas = scanner.nextInt();
                    if (horas >= 0) {
                        break;
                    } else {
                        System.out.println("Error en el numero ingresado, intentelo de nuevo.");
                    }
                } else {
                    System.out.println("Entrada no valida, intentelo de nuevo.");
                    scanner.next();
                }
            }

            System.out.println("\n == Informacion del Visitante == ");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Tipo de documento: " + Tdocumentos);
            System.out.println("Numero de identificacion: " + identificacion);
            System.out.println("Tiempo de visita registrado: " + horas + " horas.");

            scanner.close();

        }



}