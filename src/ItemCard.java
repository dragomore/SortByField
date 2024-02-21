public class ItemCard {
    public String title;
    public String description;
    public double price;
    public double discount;

    public ItemCard(String title, String description, double price, double discount) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.discount = discount;
    }
    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrice() {
        return price;
    }
    public double getDiscount() {
        return discount;
    }
}
