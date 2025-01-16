public class Product {
    private long id;
    private String name;
    private String category;
    private double price;

    //costruttore
    public Product (long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this. category = category;
        this.price = price;
    }

    //metodi GET

    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
    public double getPrice(){
        return this.price;
    }

    //metodi SET

    public void setId(long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setPrice(double price){
        this.price = price;
    }

    //metodo toString()
    @Override
    public String toString(){
        String dettagliProdotto =  "id prodotto "+id + "\nNome: "+name + "\nCategoria: " + category + "\nPrezzo: " + price;
        return dettagliProdotto;
    }

}