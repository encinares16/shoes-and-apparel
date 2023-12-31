package app.models;

public class Product {
    
    private int id;
    private String brand;
    private String model;
    private String description;
    private int category;
    private int size;
    private int onStock;
    private int addStock; 
        
    public void setId(int id) {
        this.id = id;
    }
    
    public void setBrand(String name) {
        this.brand = name;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setSize(int size) {
        this.size = size;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setOnStock(int onStock) {
        this.onStock = onStock;
    }

    public void setAddStock(int addStock) {
        this.addStock = addStock;
    }

    public int getId() {
        return id;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }
    
    public int getSize() {
        return size;
    }
    
    public int getCategory() {
        return category;
    }

    public int getOnStock() {
        return onStock;
    }

    public int getAddStock() {
        return addStock;
    }
    
    //category id, name, description
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() { return name; }
}
