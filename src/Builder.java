// 抽象建造者
public abstract class Builder {
    private House house = new House();
//    具体的流程
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void  roofed();

    public House Builder() {
       return house;
    }
}
class Height extends Builder{

    @Override
    public void buildBasic() {
        System.out.println("base");
    }

    @Override
    public void buildWall() {
        System.out.println("wall");
    }

    @Override
    public void roofed() {
        System.out.println("roof");
    }
}
