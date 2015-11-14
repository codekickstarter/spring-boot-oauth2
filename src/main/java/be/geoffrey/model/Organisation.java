package be.geoffrey.model;

public class Organisation {

    private long id;
    private String name;

    protected Organisation() {
    }

    public Organisation(long id, String content) {
        this.id = id;
        this.name = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
