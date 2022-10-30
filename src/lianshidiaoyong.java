public class lianshidiaoyong {
    private String name = "name";
    private int age = 1;
    private String name1 ="name1";
    private int age1=2;
    public lianshidiaoyong() {
    }

    public lianshidiaoyong setName(String name) {
        this.name = name;
        return this;
    }
    public lianshidiaoyong setName1(String name) {
        this.name1 = name;
        return this;
    }

    public lianshidiaoyong setAge(int age) {
        this.age = age;
        return this;
    }
    public lianshidiaoyong setAge1(int age) {
        this.age1 = age;
        return this;
    }

    @Override
    public String toString() {
        return "解决参数过多问题可选赋值{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", name1='" + name1 + '\'' +
                ", age1=" + age1 +
                '}';
    }
}
