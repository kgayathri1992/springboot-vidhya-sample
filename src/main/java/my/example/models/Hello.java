package my.example.models;

public class Hello {

    private final long id;

    private final String msg;


    /**
     * Overloaded Hello constructor that instantiates final immutable
     * instance fields
     * @param id ID of the Hello
     * @param msg Message of the Hello
     */
    public Hello(long id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    /**
     * Getter for the Hello's ID
     * @return ID of the Hello
     */
    public long getId() {
        return id;
    }

    /**
     * Getter for the Hello's message
     * @return Message of the Hello
     */
    public String getMsg() {
        return msg;
    }

}
