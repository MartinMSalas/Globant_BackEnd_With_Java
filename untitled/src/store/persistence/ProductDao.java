package store.persistence;

import store.entity.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductDao extends DAO {
    public ArrayList<String> listAllProductsNames() {
        ArrayList<String> resultNames = new ArrayList<String>();

        try {
            String query = "SELECT nombre FROM producto";
            consultarBase(query);
            while (resultado.next()) {
                String name = resultado.getString("nombre");
                resultNames.add(name);
            }
            desconectarBase();

        } catch (Exception e) {
            System.out.println("Error while listing all products names: " + e);
        }finally {

            return resultNames;
        }

    }

    public HashMap<String, Double> listAllProductsNamesAndPrices() {
        HashMap<String, Double> resultNamesAndPrices = new HashMap<String, Double>();

        try {
            String query = "SELECT nombre, precio FROM producto";
            consultarBase(query);
            while (resultado.next()) {
                String name = resultado.getString("nombre");
                Double price = resultado.getDouble("precio");
                resultNamesAndPrices.put(name, price);
            }
            desconectarBase();

        } catch (Exception e) {
            System.out.println("Error while listing all products names and prices: " + e);
        }finally {

            return resultNamesAndPrices;
        }
    }

    public ArrayList<Product> listProductsBetweenWithPrice120And202() {
    }
}
