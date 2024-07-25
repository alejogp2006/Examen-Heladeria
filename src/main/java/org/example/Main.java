package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado=new Scanner(System.in);

        //DECLARACIÓN DE VARIABLES

        int heladoSimple=1500;
        int heladoDoble=3000;
        int heladoEspecial=5000;

        int cantidadHeladoSimple;
        int cantidadHeladoDoble;
        int cantidadHeladoEspecial;

        int totalVentasSimples;
        int totalVentasDobles;
        int totalVentasEspeciales;

        double totalVentasDia;

        String nombreHelado="Chocolate " + "Vainilla " + "Fresa " + "Mandarina " + "Brownie " + "Nucita ";

        //ENTRADAS DE VARIABLES

        System.out.println("Ingrese la cantidad de helados simples: ");
        cantidadHeladoSimple= leerTeclado.nextInt();

        System.out.println("Ingrese la cantidad de helados dobles: ");
        cantidadHeladoDoble= leerTeclado.nextInt();

        System.out.println("Ingrese la cantidad de helados especiales");
        cantidadHeladoEspecial= leerTeclado.nextInt();

        //CALCULOS
        totalVentasSimples=heladoSimple*cantidadHeladoSimple;
        totalVentasDobles=heladoDoble*cantidadHeladoDoble;
        totalVentasEspeciales=heladoEspecial*cantidadHeladoEspecial;

        totalVentasDia=totalVentasSimples+totalVentasDobles+totalVentasEspeciales;

        //IMPRIMIR RESULTADOS
        System.out.println("El total de ventas de helados simples son "+totalVentasSimples);
        System.out.println("El total de ventas de helados dobles son "+totalVentasDobles);
        System.out.println("El total de ventas de helados especiales son "+totalVentasEspeciales);

        System.out.println("El total de ventas en todo el dia es "+totalVentasDia);







    }
}