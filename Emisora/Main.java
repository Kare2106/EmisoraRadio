package Emisora;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]arg) {
		
		RadioFM fr1 = new RadioFM ();
		fr1.setFrecuencia(80);
		Scanner in = new Scanner (System.in);
		int opcion;
		
		do {

        System.out.println("\n   Menu Principal   ");
        System.out.println("******Usted desea*******");
        System.out.println("1. Subir frecuencia");
        System.out.println("2. Bajar frecuencia");
        System.out.println("3. Mostrar frecuencia");
        System.out.println("4. Salir");
        System.out.println("Digite opcion que desee: ");
        opcion = in.nextInt();
			 
        switch(opcion){
            case 1: fr1.controlador();fr1.subir();break;
            case 2: fr1.controlador();fr1.bajar();break;
            case 3: fr1.display();break;
            case 4: break;
            default: System.out.println("La opcion ingresada no es valida");
        }
    }while (opcion != 4);
  }
}
