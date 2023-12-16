package reservaasientos;

import java.util.Scanner;

public class ReservaAsientos {

    public static void main(String[] args) {
       
        //Creación de un objeto tipo Scanner para ingresar los datos.
        Scanner entrada = new Scanner(System.in);
        
        //Declaración de variables.
        int fila, columna = 0;
        char respuesta;
        boolean bandera1 = false, bandera2;
        char asientos[][] = new char[10][10];
        
        //Carga de la matriz de asientos.
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                asientos[i][j] = 'L';
            }
        }
        
        //Bienvenida al sistema.
        System.out.println("------ BIENVENIDO AL SISTEMA DE RESERVAS -----\n");
        
        //Reserva de asientos
        while (bandera1 != true){
            
            //Visualización de mapa.
            do {
                System.out.print("¿Desea ver los asientos disponibles? (Y/N): ");
                respuesta = entrada.next().toUpperCase().charAt(0);
                
                if(respuesta != 'Y' && respuesta != 'N'){
                    System.out.println("Debe ingresar Y O N.");
                }else if(respuesta == 'Y'){
                    mostrarMapa(asientos);
                }
                
                System.out.println();
                
            } while (respuesta != 'Y' && respuesta != 'N');
            
            //Reserva.
            System.out.println("Ingrese fila y asiento a reservar\n");
                
            do {
                
                bandera2 = false;
                
                System.out.print("Fila (entre 0 y 9): ");
                fila = entrada.nextInt();
                
                System.out.print("Asiento (entre 0 y 9): ");
                columna = entrada.nextInt();

                if(fila >= 0 && fila <= 9){
                    if(columna >= 0 && columna <= 9){
                        bandera2 = true;
                    }else{
                        System.out.println("\nEl número de asiento no es válido. Intente nuevamente.\n");
                    }
                    
                }else{
                    System.out.println("\nEl número de fila no es válido. Intente nuevamente.\n");
                }
  
            } while (bandera2 != true);
            
            if (asientos[fila][columna] == 'L') {
                
                asientos[fila][columna] = 'X';
                System.out.println("\nEl asiento fué reservado correctamente.\n");

            }else{           
                System.out.println("\nEl asiento ya se encuentra reservado. Por favor elija otro.\n");
            }
            
            do {
                System.out.print("¿Desea reservar otro asiento? (Y/N): ");
                respuesta = entrada.next().toUpperCase().charAt(0);
                
                if(respuesta != 'Y' && respuesta != 'N'){
                    System.out.println("Debe ingresar Y O N.");
                }else if(respuesta == 'N'){
                    bandera1 = true;
                }
                
                System.out.println();
                
            } while (respuesta != 'Y' && respuesta != 'N');
        }
        
        System.out.println("Gracias por utilizar nuestra aplicación.");
    }
    
    private static void mostrarMapa(char asientos[][]){
        
        System.out.println();
        
        for (int fila = 0; fila < asientos.length; fila++) {
            System.out.print("Fila N° " + fila + ": ");
            for (int columna = 0; columna < asientos[0].length; columna++) {
                System.out.print("[" + asientos[fila][columna] + "]");
            }
            System.out.println();
        }
    }
}