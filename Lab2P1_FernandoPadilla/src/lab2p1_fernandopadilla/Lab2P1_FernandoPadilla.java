
package lab2p1_fernandopadilla;
import java.util.Scanner;

public class Lab2P1_FernandoPadilla {
   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        char resp = 's'; 
        int opcion ;
        
        while (resp == 's' || resp == 'S') {
            System.out.println("Menu.");
            System.out.println("1. Numero Perfecto");
            System.out.println("2. Sumatoria");
            System.out.println("3. Serie ");
            System.out.println("4. Salida");
            opcion = read.nextInt();
            switch(opcion) {
                case 1:
                    boolean f;
                    int i, suma = 0, n;
                    System.out.println("Introduce un numero: ");
                    n = read.nextInt();
                    System.out.println("Divisores: ");
                    for (i = 1; i < n; i++) {
                        if (n % i == 0) {
                            suma = suma + i;
                            System.out.println(i +"");
                    }
                }
                if (suma == n) {
                    f = true; 
                } else {
                    f = false;
                } if (f == true) {
                    System.out.println("Es un numero perfecto.");
                } else {
                    System.out.println("Es primo, no se pudo realizar el calculo por falta de divisores.");
                }
                System.out.println("Desea volver a ejecutar el programa? (S/N)");
                resp = read.next().charAt(0);
                break;
                case 2:
                    int k;
                    System.out.println("Ingrese el valor de K: ");
                    k = read.nextInt();
                    int n1 = 1;
                    double sumatoria = 0; 
                    while (n1 <= k){
                        double numerador = 0, denominador = 0;
                        numerador = (2*n1) - 1;
                        denominador = (n1*(n1+1));
                        sumatoria = sumatoria + (numerador/denominador);
                        n1++;   
                    }// cierre while
                    double resultadosumatoria = sumatoria;
                    System.out.println("El resultado de la sumatoria es: " + resultadosumatoria);
                System.out.println("Desea volver a ejecutar el programa? (S/N)");
                resp = read.next().charAt(0);
                break;
                case 3:
                    System.out.println("Ingrese el Numero(N): ");
                    int n2 = read.nextInt();
                    System.out.println("Ingrese el limite(x): ");
                    int lim = read.nextInt();
                    int cont = 0, acum = n2, otro;
                    while (cont < lim){
                        if (cont % 2 == 0){
                            otro = n2 * -1;
                        } else {
                            otro = n2 * 1;
                        }
                        System.out.println(otro);
                        n2 += acum;
                        cont++;
                }                   
                System.out.println("Desea volver a ejecutar el programa? (S/N)");
                resp = read.next().charAt(0);
                break;
                case 4:
                    resp = 'n';
                break;
                default:
                    System.out.println("Desea volver a ejecutar el programa? (S/N)");
                    resp = read.next().charAt(0);
                }
            }
            
    }//fin while
    
    

    }//fin main