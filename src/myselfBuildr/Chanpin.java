package myselfBuildr;

/**
 * 理解后自定义的产品类
 */
public class Chanpin {
    private String name = "觉醒的年轻人";
    private String yuancailiao = "中二青年"; //原材料
    private String jiagong = "社会毒打认清现实";//加工
    private String baozhuang = "年轻人不努力";//包装
    private String yunshu = "等待解脱";//运输

    public String getYuancailiao() {
        return yuancailiao;
    }

    public void setYuancailiao(String yuancailiao) {
        this.yuancailiao = yuancailiao;
    }

    public String getJiagong() {
        return jiagong;
    }

    public void setJiagong(String jiagong) {
        this.jiagong = jiagong;
    }

    public String getBaozhuang() {
        return baozhuang;
    }

    public void setBaozhuang(String baozhuang) {
        this.baozhuang = baozhuang;
    }

    public String getYunshu() {
        return yunshu;
    }

    public void setYunshu(String yunshu) {
        this.yunshu = yunshu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chanpin{" +
                "产品命名为：'" + name + '\'' +
                ", 产品原材料是：'" + yuancailiao + '\'' +
                ", 加工方式是：'" + jiagong + '\'' +
                ", 包装是：'" + baozhuang + '\'' +
                ", 产品运输手段是：'" + yunshu + '\'' +
                '}';
    }
}
