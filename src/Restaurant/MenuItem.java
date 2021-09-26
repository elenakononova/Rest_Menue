package Restaurant;

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
    public MenuItem(String name, String description, Double price,  String category, boolean isNew){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    //methods

    //Getters and setters

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return this.description;}
    public void setDescription(String name) {this.description = name;}

    public Double getPrice() {return this.price;}
    public void setPrice(Double Price) {this.price = price;}

    public String getCategory() {return this.category;}
    public void setCategory() {this.category = category;}
// removed 'get' because it is boolean
    public Boolean IsNew () {return this.isNew;}
    public void setIsNew() { this.isNew = isNew;}


    // printing menu
    @Override
    public String toString() {
        String returnString = "";

        returnString += "Item Name: " + this.name + "\n";
        returnString += "Item Description: " + this.description + "\n";
        returnString += "Item Price: " + this.price + "\n";
        returnString += "Item Category: " + this.category + "\n";
        returnString += "Item Is New: " + this.isNew + "\n";

        return returnString;
    }

    // does the obj == to class instance we are in,  compares memory addresses
    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        // check if menuItem is a MenuItem
        if(!(obj instanceof MenuItem)){
            return false;
        }
        // casting
        MenuItem menuItem = (MenuItem) obj;
        if (menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category))

            return true;
        else return false;
    }
}


