package hu.procyon.seedling.model;

public class ResponseWithId {
    private boolean success;
    private int id;

    public ResponseWithId(boolean success, int id) {
        this.success = success;
        this.id = id;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}