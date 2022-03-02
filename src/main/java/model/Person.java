package model;

public class Person {
    String name;
    Integer id;
    Integer point;

    public Person(String name, Integer id, Integer point) {
        this.name = name;
        this.id = id;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", point=" + point +
                '}';
    }
}
