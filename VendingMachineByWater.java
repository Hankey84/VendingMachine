

import java.util.ArrayList;
import java.util.List;

public class VendingMachineByWater implements VendingMachine{

    private List<Product> products;

    public void initProducts(List<Product> productList) {
        this.products = productList;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null; // Если товар не найден
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachineByWater();

        List<Product> productList = new ArrayList<>();
        productList.add(new BottleWater("Cola", 1.50, "Drinks", 5));
        productList.add(new BottleWater("Soda", 2.50, "Drinks", 3));


        vendingMachine.initProducts(productList);
        System.out.println(vendingMachine.getProduct("Cola"));

        
   
    
}
}