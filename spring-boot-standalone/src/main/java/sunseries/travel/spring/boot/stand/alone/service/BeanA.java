package sunseries.travel.spring.boot.stand.alone.service;

/**
 * Created by pea.chiwa on 6/23/16.
 */
public class BeanA {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("===========================");
        System.out.println("Name : " + this.name);
        System.out.println("===========================");
    }
}
