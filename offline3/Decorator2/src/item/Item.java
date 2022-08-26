package item;

public interface Item {
    public String name();
    public float price();

    default String getName() {
        return null;
    }
}
