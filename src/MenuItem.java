public class MenuItem {

    // Class Variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    // constractor
    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = "none";
        this.isNew = false;
    }
    public MenuItem(String name, Double price, String description,  String category, boolean isNew){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return this.description;}
    public void setDescription(String name) {this.description = name;}

    public Double getPrice() {return this.price;}
    public void setPrice(Double Price) {this.price = price;}

    public String getCategory() {return this.category;}
    public void setCategory() {this.category = category;}

    public Boolean getIsNew () {return this.isNew;}
    public void setIsNew() { this.isNew = isNew;}
}


