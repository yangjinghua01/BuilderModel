package ObserveModel;

public class Store implements Observer{
    private String storeName;

    public Store(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public void show(Subject subject){
        System.out.println(this.storeName+subject.toString());
    }

    @Override
    public void priceChanged(Subject subject) {
        System.out.println(this.storeName);
        System.out.println("...........");
        show(subject);
    }
}
