package Restaurant;

public class Restaurant {
    public static void main(String[] args){
        MenuItem item1 = new MenuItem("Salad", "Greens", 7.50, "Healthy", true);
        MenuItem item2 = new MenuItem("Salad", "Greens", 7.50, "Healthy", true);
        MenuItem item3 = new MenuItem("Cake", "Sweets", 7.50, "non Healthy", true);

        // testing toString method printing
        //System.out.println(item1.toString());

        // testing equals method
        //System.out.println(item1.equals(item2));

        Menu myMenu = new Menu();

        myMenu.addMenuItems(item1);
        myMenu.addMenuItems(item2);
        myMenu.addMenuItems(item3);

        System.out.println(myMenu.toString());
        //myMenu.removeMenuItem(item2);
    }
}
