package model;

/**
 * 电脑部件 实体类
 */
public class Part {
    private String type;
    private String name;
    private Double price;
    public Part(){
    }
    public Part(String type,String name,double price){
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
