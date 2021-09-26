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


}
