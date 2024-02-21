import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ItemCard ItemCard1 = new ItemCard("Руль", "Logitech", 5435, 0);
        ItemCard ItemCard2 = new ItemCard("КПП", "Коробка передач для руля", 1534, 10);
        ItemCard ItemCard3 = new ItemCard("Педали", "Педали для руля", 546, 0);

        ArrayList<ItemCard> cards = new ArrayList<>();
        cards.add(ItemCard1);
        cards.add(ItemCard2);
        cards.add(ItemCard3);

//        ArrayList<String> sort = getByField(cards, "title");
//        ArrayList<String> sort = getByField(cards, "description");
        ArrayList<String> sort = getByField(cards, "price", "DESC");
//        ArrayList<String> sort = getByField(cards, "discount");
        System.out.println(sort);
    }

    public static ArrayList<String> getByField(ArrayList<ItemCard> cards, String field ){
        ArrayList<String> sortedBy = new ArrayList<>();
        for (ItemCard card : cards) {
            if (field.equals("title")) {
                sortedBy.add(card.getTitle());
            }
            if (field.equals("description")) {
                sortedBy.add(card.getDescription());
            }
            if (field.equals("price")) {
                sortedBy.add(Double.toString(card.getPrice()));
            }
            if (field.equals("discount")) {
                sortedBy.add(Double.toString(card.getDiscount()));
            }
        }
        Collections.sort( sortedBy );
        return sortedBy;
    }
    public static ArrayList<String> getByField(ArrayList<ItemCard> cards, String field, String sortBy ){
        ArrayList<String> sortedBy = new ArrayList<>();
        if( sortBy.equals( "ASC" ) ){
            for (ItemCard card : cards) {
                if (field.equals("title")) {
                    sortedBy.add(card.getTitle());
                }
                if (field.equals("description")) {
                    sortedBy.add(card.getDescription());
                }
                if (field.equals("price")) {
                    sortedBy.add(Double.toString(card.getPrice()));
                }
                if (field.equals("discount")) {
                    sortedBy.add(Double.toString(card.getDiscount()));
                }
            }
            Collections.sort( sortedBy );
        }
        if( sortBy.equals( "DESC" ) ){
            for (ItemCard card : cards) {
                if (field.equals("title")) {
                    sortedBy.add(card.getTitle());
                }
                if (field.equals("description")) {
                    sortedBy.add(card.getDescription());
                }
                if (field.equals("price")) {
                    sortedBy.add(Double.toString(card.getPrice()));
                }
                if (field.equals("discount")) {
                    sortedBy.add(Double.toString(card.getDiscount()));
                }
            }
            Collections.reverse( sortedBy );
        }
        return sortedBy;
    }
}