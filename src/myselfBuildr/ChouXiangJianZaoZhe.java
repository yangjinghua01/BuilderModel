package myselfBuildr;

public abstract class ChouXiangJianZaoZhe {
     Chanpin chanpin = new Chanpin();
    public Chanpin getChanpin() {
        return chanpin;
    }
    abstract ChouXiangJianZaoZhe MingmingChanpin(String name);
    abstract ChouXiangJianZaoZhe yuancailiao(String yuancailiao);
    abstract ChouXiangJianZaoZhe jiagong(String jiagong);
    abstract  ChouXiangJianZaoZhe baozhuang(String baozhuang);
    abstract  ChouXiangJianZaoZhe yunshu(String yunshu);
}
