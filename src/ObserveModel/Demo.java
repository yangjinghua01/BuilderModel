package ObserveModel;

public class Demo {
    public static void main(String[] args) {
        Cherry cherry = new Cherry("chelizi");
        Store s1 = new Store("one");
        Store s2 = new Store("tow");
        cherry.attach(s1);
        cherry.attach(s2);
        cherry.setPrice(200);
        cherry.setPrice(100);
        cherry.detach(s1);
        cherry.setPrice(0);
    }
}
