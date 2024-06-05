import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        Item item1 = new Item(1, "a");
        Item item2 = new Item(2, "b");
        Item item3 = new Item(3, "c");
        Item item4 = new Item(4, "d");
        Item item5 = new Item(5, "e");

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        for (int i = 0; i < items.size(); i++){
            items.get(i).show();
        }

        HashMap<Integer, String> itemsHashMap = new HashMap<>();

        for (Item item : items){
            itemsHashMap.put(item.getId(), item.getName());
        }

//        System.out.println("Items map: " + itemsHashMap.entrySet());

        for (Map.Entry<Integer, String> entry : itemsHashMap.entrySet()){
            System.out.println("ID: "+entry.getKey() + " Name: " + entry.getValue());
        }
    }
}