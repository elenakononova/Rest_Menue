package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItem = new ArrayList<>();
    private Date lastUpdated;
    // constructor

    public Menu(){
       this.lastUpdated = new Date();
    }

    public ArrayList<MenuItem> getMenuItem() {
        return this.menuItem;
    }
    public void setMenuItem(ArrayList<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }

    public Date getLastUpdated() { return this.lastUpdated; }
    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }

    // add menu item class
    // do not add duplicate to the loop
    public void addMenuItems(MenuItem item) {

        // looping trough each menu item to compare
        for (MenuItem menuItem: this.menuItem) {
            if (item.equals(menuItem)) {
                System.out.println("Warning: this item already exists!!");
                // get out of method
                return;
            }

        }
        this.menuItem.add(item);

        // update last updated property
        this.lastUpdated = new Date();
    }

    // remove item
    public void removeMenuItem(MenuItem item){
        this.menuItem.remove(item);
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        String returnString = "";
        // loop through each item and print
        for (MenuItem item : this.menuItem){

            returnString += item.toString() + "\n";

        }
        return returnString;
    }
}
