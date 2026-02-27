package computacionjavaevidencia1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Sumar 10 números");
            System.out.println("2. Mostrar primeros 20 números pares");
            System.out.println("3. Promedio de estatura de 10 alumnos");
            System.out.println("4. Sumar positivos y negativos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    int suma = 0;
                    for (int i = 1; i <= 10; i++) {
                        System.out.print("Ingrese número " + i + ": ");
                        suma += sc.nextInt();
                    }
                    System.out.println("La suma total es: " + suma);
                    break;

                case 2:
                    int[] pares = new int[20];
                    int num = 2;

                    for (int i = 0; i < 20; i++) {
                        pares[i] = num;
                        num += 2;
                    }

                    System.out.println("Primeros 20 números pares:");
                    for (int i = 0; i < pares.length; i++) {
                        System.out.println(pares[i]);
                    }
                    break;

                case 3:
                    double sumaEstaturas = 0;

                    for (int i = 1; i <= 10; i++) {
                        System.out.print("Ingrese estatura del alumno " + i + ": ");
                        sumaEstaturas += sc.nextDouble();
                    }

                    double promedio = sumaEstaturas / 10;
                    System.out.println("El promedio de estaturas es: " + promedio);
                    break;

                case 4:
                    int sumaPositivos = 0;
                    int sumaNegativos = 0;

                    for (int i = 1; i <= 10; i++) {
                        System.out.print("Ingrese número " + i + ": ");
                        int numero = sc.nextInt();

                        if (numero >= 0) {
                            sumaPositivos += numero;
                        } else {
                            sumaNegativos += numero;
                        }
                    }

                    System.out.println("Suma de positivos: " + sumaPositivos);
                    System.out.println("Suma de negativos: " + sumaNegativos);
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
