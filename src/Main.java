public class Main {
    public static void main(String[] args) {
        ItemCard ItemCard1 = new ItemCard("Руль", "Logitech", 5435, 0);
        ItemCard ItemCard2 = new ItemCard("КПП", "Коробка передач для руля", 1534, 10);
        ItemCard ItemCard3 = new ItemCard("Педали", "Педали для руля", 546, 0);

        ItemCard[] items = { ItemCard1, ItemCard2, ItemCard3 };
        ItemCard.getByField( items, "price");

        for( ItemCard item : items ) {
            System.out.println("Title: " + item.title + ", Description: " + item.description + ", Price: " + item.price + ", Discount: " + item.discount );
        }
    }
}