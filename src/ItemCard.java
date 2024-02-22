import java.util.Arrays;
import java.util.Comparator;

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
    public String getTitle(){ return this.title; }
    public String getDescription(){
        return this.description;
    }
    public double getPrice() {
        return price;
    }
    public double getDiscount() {
        return discount;
    }

    public static void getByField( ItemCard[] items, String sortBy ) {
        Comparator<ItemCard> comparator;
        switch( sortBy.toLowerCase() ){
            case "title" : {
                comparator = Comparator.comparing( item -> item.title );
                break;
            }
            case "description" : {
                comparator = Comparator.comparing( item -> item.description );
                break;
            }
            case "price" : {
                comparator = Comparator.comparingDouble( item -> item.price );
                break;
            }
            case "discount" : {
                comparator = Comparator.comparingDouble( item -> item.discount );
                break;
            }
            default :
                throw new IllegalArgumentException("Invalid field to sort");
        }
        Arrays.sort( items, comparator );
    }

    public static void getByField( ItemCard[] items, String sortBy, String sortOrder ) {
        Comparator<ItemCard> comparator;
        switch( sortBy.toLowerCase() ){
            case "title" : {
                comparator = Comparator.comparing( item -> item.title );
                break;
            }
            case "description" : {
                comparator = Comparator.comparing( item -> item.description );
                break;
            }
            case "price" : {
                comparator = Comparator.comparingDouble( item -> item.price );
                break;
            }
            case "discount" : {
                comparator = Comparator.comparingDouble( item -> item.discount );
                break;
            }
            default :
                throw new IllegalArgumentException("Invalid field to sort");
        }
        if ( sortOrder.equalsIgnoreCase("asc") ) {
            Arrays.sort( items, comparator );
        }
        else if( sortOrder.equalsIgnoreCase( "desc" ) ) {
            Arrays.sort( items, comparator.reversed() );
        }
        else
            throw new IllegalArgumentException("Invalid sort orded");
    }
}
