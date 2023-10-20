package store.service;

import java.util.Scanner;

public class Menu {

    public static void showMenu(){
        Scanner sc = new Scanner(System.in);
        int option;
        do {

            System.out.println("1. Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2. Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3. Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4. Buscar fabricante");
            System.out.println("5. Salir");
            option = sc.nextInt();
        }while (option<1 || option>5);
        switch (option){
            case 1:
                System.out.println("1. Lista el nombre de todos los productos que hay en la tabla producto.");
                ProductService.listAllProductsNames();
                break;
            case 2:
                System.out.println("2. Lista los nombres y los precios de todos los productos de la tabla producto.");
                ProductService.listAllProductsNamesAndPrices();
                break;
            case 3:
                System.out.println("3. Listar aquellos productos que su precio esté entre 120 y 202.");
                ProductService.listProductsBetweenWithPrice120And202();
                break;


        }





    }
}
