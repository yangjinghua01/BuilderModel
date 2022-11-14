package ObserveModel;

public class Cherry extends Subject{
    private long price;
    private String name;

    public Cherry(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cherry{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
