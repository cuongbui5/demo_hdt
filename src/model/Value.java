package src.model;

public class Value {
    private int id;
    private String data;

    public Value(int id,String data) {
        this.id=id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
