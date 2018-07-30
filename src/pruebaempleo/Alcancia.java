/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaempleo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Monica Castellanos
 */
public class Alcancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 0;
        List<Integer> arregloAlcancia = new ArrayList();
        
        Scanner objLectura = new Scanner(System.in);
            System.out.println("Bienvenido a su alcancia virtual, estas son las opciones disponibles" + "\n"
                    + "1. Ingresar un valor" + "\n"
                    + "2. Contar cuantas monedas en total tiene la alcancia" + "\n"
                    + "3. Contar cuantas monedas de una denominacion tiene la alcancia" + "\n"
                    + "4. Vaciar la alcancia"+ "\n"
                    + "5. salir");
            opcion = objLectura.nextInt();

        while (opcion != 5) {

           
            switch (opcion) {

                case 1:

                    int denominacion = 0;

                    System.out.println("Indique cuantas monedas va a ingresar a la alcancia");
                    int numeroMonedas = objLectura.nextInt();

                    for (int i = 0; i < numeroMonedas; i++) {
                        System.out.println("indique la denominación recuerde que solo se aceptan los siguientes valores 50,100,200,500,1000");
                        denominacion = objLectura.nextInt();
                        if (denominacion == 50 || denominacion == 100 || denominacion == 200 || denominacion == 500 || denominacion == 1000) {

                            arregloAlcancia.add(i, denominacion);
                            System.out.println("se ha ingresado de manera correcta el valor");

                        } else {

                            System.out.println("la denominación de moneda que ingreso no es valida para la alcancia");
                            i--;

                        }
                    }
                    break;

                case 2: {
                    System.out.println("En total hay " + arregloAlcancia.size() + " monedas guardadas en su alcancia");

                } 
                break;

                case 3: {
                    System.out.println("Para contar cuantas monedas exisiten en cierta denominación por favor ingresela a continuación");

                    int contador = 0;
                    int moneda = objLectura.nextInt();
                    if (moneda == 50 || moneda == 100 || moneda == 200 || moneda == 500 || moneda == 1000) {
                        for (int i = 0; i < arregloAlcancia.size(); i++) {
                            if (arregloAlcancia.get(i) == moneda) {
                                contador++;

                            }
                        }

                        System.out.println("en la alcancia hay " + contador + " monedas de " + moneda);
                    } else {
                        System.out.println("la denominación no es correcta");

                    }
                }break;
                
                case 4:
                    if (arregloAlcancia.size()>0) {
                         arregloAlcancia.clear();
                    System.out.println("Todo sus ahorros han sido retirados con exito");

                    }else{
                    System.out.println(" no hay nada que vaciar ya que no hay monedas en la alcancia");
                    }
                    
                    break;

            }
            
             System.out.println("Bienvenido a su alcancia virtual, estas son las opciones disponibles" + "\n"
                    + "1. Ingresar un valor" + "\n"
                    + "2. Contar cuantas monedas en total tiene la alcancia" + "\n"
                    + "3. Contar cuantas monedas de una denominacion tiene la alcancia" + "\n"
                    + "4. Vaciar la alcancia "+"\n"
                     + "5. Salir ");
            opcion = objLectura.nextInt();

        }

        System.out.println("ha finalizado la aplicación");
    }

}
