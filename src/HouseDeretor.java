public class HouseDeretor {
    Builder builder;

    public HouseDeretor(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public House constratHouse1(){
        builder.buildBasic();
        builder.buildWall();
        builder.roofed();
        return builder.Builder();
    }
    public House constratHouse2(){
        builder.buildBasic();
        builder.buildWall();
        builder.roofed();
        return builder.Builder();
    }
}
