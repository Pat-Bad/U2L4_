public class Customer {
    private long id;
    private String name;
    private int tier;

    //costruttore
    public Customer(long id, String name, int tier){
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    //metodi GET

    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getTier(){
        return this.tier;
    }

    //metodi SET

    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setTier(int tier){
        this.tier = tier;
    }

    //metodo toString

    public String toString(){
        String dettagliCliente = "id cliente: " + id + ", nome: " + name + ", livello: " + tier;
        return dettagliCliente;
    }
}