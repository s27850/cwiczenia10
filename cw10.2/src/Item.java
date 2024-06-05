public class Item {
    Integer Id;
    String name;

    public Item(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void show(){
        System.out.println(this.name);
    }

}
