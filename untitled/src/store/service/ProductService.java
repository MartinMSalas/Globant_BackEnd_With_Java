package store.service;

import store.entity.Product;
import store.persistence.DAO;
import store.persistence.ProductDao;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductService {

    static ProductDao dao = new ProductDao();

    public static void listAllProductsNames() {
        System.out.println("Listing all products...");

        ArrayList<String> result =  dao.listAllProductsNames();
        System.out.println(result);
    }

    public static void listAllProductsNamesAndPrices() {
        System.out.println("Listing all products names and prices...");

        HashMap<String,Double> result =  dao.listAllProductsNamesAndPrices();
        System.out.println(result);
    }

    public static void listProductsBetweenWithPrice120And202() {
        System.out.println("Listing products between with price 120 and 202...");

        ArrayList<Product> result =  dao.listProductsBetweenWithPrice120And202();
        System.out.println(result);
    }
}
