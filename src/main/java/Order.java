import java.time.LocalDate;
import java.util.List;

public class Order {
    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    //costruttore
    public Order (long id, String status, List<Product> p, Customer customer){
        this.id = id;
        this.status = status;
        this.orderDate = LocalDate.now();
        this.deliveryDate = LocalDate.now().plusDays(5);
        this.products = p;
        this.customer = customer;
    }

    //metodi get
    public Long getId(){
        return this.id;
    }
    public String getStatus(){
        return this.status;
    }
    public List<Product> getProducts(){
        return this.products;
    }
    public LocalDate getOrderDate(){ return this.orderDate;}
    public LocalDate getDeliveryDate(){ return this.deliveryDate;}
    public Customer getCustomer(){return this.customer;}

    //to string
    @Override
    public String toString(){
        String dettagliOrdine = "id ordine: " + id +"\n" +"Status " + status + "\n" + "Prodotti: " + products + "\n" + "Cliente: " + customer;
        return dettagliOrdine;}
}