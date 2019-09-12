package cn.kgc.spring;

public class HelloSpring {
    private String HelloSpring;

    public String getHelloSpring() {
        return HelloSpring;
    }

    public void setHelloSpring(String helloSpring) {
        HelloSpring = helloSpring;
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "HelloSpring='" + HelloSpring + '\'' +
                '}';
    }
}
