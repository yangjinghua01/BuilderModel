package myselfBuildr;

public class Client {
    public static void main(String[] args) {
        Chanpin yunshu = new JuTiChanPin()
                .MingmingChanpin("强奸资本的一百种方法")
                .yuancailiao("社畜青年")
                .jiagong("躺平，摆烂")
//                .baozhuang("废柴青年")
                .yunshu("灵活就业，等死").getChanpin();
        System.out.println(yunshu);
    }
}
