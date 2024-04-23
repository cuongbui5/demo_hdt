package src.model;

import java.util.ArrayList;
import java.util.List;

public class Property {
    private int id;
    private String name;
    List<Value> values;

    public Property(int id,String name) {
        this.id=id;
        this.name = name;
        this.values=new ArrayList<>();
    }





    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", values=" +values +
                '}';
    }

    public void addValue(Value value){
        values.add(value);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }
}
