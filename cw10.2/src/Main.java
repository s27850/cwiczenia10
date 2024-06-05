import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        HashMap<Integer, String> itemsHashMap = new HashMap<>();

        for (Item item : items) {
            itemsHashMap.put(item.getId(), item.getName());
        }

//        System.out.println("Items map: " + itemsHashMap.entrySet());

        for (Map.Entry<Integer, String> entry : itemsHashMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }

        //// zadanie 3

        Item item31 = new Item(31, "f");
        Item item32 = new Item(32, "g");
        Item item33 = new Item(33, "h");
        Item item34 = new Item(34, "i");
        Item item35 = new Item(35, "j");
        Item item36 = new Item(36, "k");
        Item item37 = new Item(37, "l");
        Item item38 = new Item(38, "m");
        Item item39 = new Item(39, "n");
        Item item310 = new Item(310, "o");

        items.add(item31);
        items.add(item32);
        items.add(item33);
        items.add(item34);
        items.add(item35);
        items.add(item36);
        items.add(item37);
        items.add(item38);
        items.add(item39);
        items.add(item310);

        List<Item> items2 = items.subList(0, 9);
        HashMap<Integer, String> itemHashListFirst = new HashMap<>();

        for (Item item : items2) {
            itemsHashMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemHashListFirst.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }
    }
}