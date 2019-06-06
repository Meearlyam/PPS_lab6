package Entity;

public class MedService {
    private double price;
    private String description;
    private String name;

    public MedService(double price, String description, String name){
        this.price = price;
        this.description = description;
        this.name = name;
    }

    @Override
    public String toString(){
        return (price + " " + name + " " + description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

