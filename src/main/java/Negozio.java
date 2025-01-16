import java.util.*;
import java.util.stream.Collectors;


public class Negozio {
    public static void main (String[] args) {

        Customer customer1 = new Customer(85214790L, "Patricia", 1);
        Customer customer2 = new Customer(456321111L, "Barbara", 2);
        Customer customer3 = new Customer (8585858585l, "Aberalda", 3);

        //Creo la lista da passare all'ordine
        List<Product> products = new ArrayList<>();
        products.add(new Product(12367008009L, "Wild Heart", "Books", 29.99));
        products.add(new Product (2222222L, "Capitan Mutanda", "Books", 12.99 ));
        products.add(new Product(9876543213200L, "Biberon", "Baby", 16.99));
        products.add(new Product (541236987L, "Tutina", "Baby", 25.99));
        products.add(new Product (6666666L, "The Oracle", "Books", 126.66));
        products.add(new Product(456789456L, "Pannolini", "Baby", 34.99));

        //Creo un'altra lista
        List<Product> products2 = new ArrayList<>();
        products2.add(new Product (5412369447L, "Passeggino", "Baby", 425.99));
        products2.add(new Product (6666669996L, "Fried Green Tomatoes", "Books", 17.30));
        products2.add(new Product (541236944447L, "Omogeneizzati", "Baby", 45));

        List<Product> products3 = new ArrayList<>();
        products3.add(new Product (5454569447L, "Cuffie JBL", "Boys", 225.99));
        products3.add(new Product (4412369447L, "Salviettine Profumate", "Baby", 44.30));
        products3.add(new Product (54565669447L, "Set Carte Pokèmon", "Boys", 66.99));
        products3.add(new Product (5463467869447L, "Bavaglino", "Baby", 7.99));
        products3.add(new Product (8989369447L, "Deodorante", "Boys", 3.89));
        products3.add(new Product (67672369447L, "Calze", "Baby", 15.99));

        //Creo degli ordini di prova
        Order ordineProva = new Order(4444444L, "processing", products, customer1);
        Order ordineProva2 = new Order (5555555L, "out for delivery", products2, customer2);
        Order ordineProva3 = new Order (3333333333l, "Received", products3, customer3);

        //creo una lista di ordini su cui andare ad agire
        List<Order> orders = Arrays.asList(ordineProva,ordineProva2,ordineProva3);

        //voglio una mappa CLIENTE/PRODOTTI
       Map<Customer,List<Order>> groupedOrders = orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomer));

        System.out.println(groupedOrders);

        //calcola il totale delle vendite per cliente
        //voglio una mappa CLIENTE/TOTALE VENDITE. I prezzi sono in double
        Map<Customer, Double> totalSalesPerCustomer = orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomer,Collectors.summingDouble(Order::getTotal)));

        //Esercizio #3
        //Dato un elenco di prodotti, trova i prodotti più costosi utilizzando Stream e Lambda Expressions*/

        /*List<Double> listaPrezzoProdotti = products.stream()
                                                    .filter(product -> product.getPrice() > 100)
                .sorted()
                .collect(Collectors.toList());*/
        








    }
}