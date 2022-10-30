package myselfBuildr;


public class JuTiChanPin extends ChouXiangJianZaoZhe {

    @Override
    ChouXiangJianZaoZhe MingmingChanpin(String name) {
        chanpin.setName(name);
        return this;
    }

    @Override
    ChouXiangJianZaoZhe yuancailiao(String yuancailiao) {
        chanpin.setYuancailiao(yuancailiao);
        return this;
    }

    @Override
    ChouXiangJianZaoZhe jiagong(String jiagong) {
        chanpin.setJiagong(jiagong);
        return this;
    }

    @Override
    ChouXiangJianZaoZhe baozhuang(String baozhuang) {
        chanpin.setBaozhuang(baozhuang);
        return this;
    }

    @Override
    ChouXiangJianZaoZhe yunshu(String yunshu) {
        chanpin.setYunshu(yunshu);
        return this;
    }
}
