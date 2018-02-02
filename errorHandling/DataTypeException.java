package errorHandling;

public class DataTypeException extends Exception {
    private double amount;
    private String from, to;

    public DataTypeException(String e, String fromType, String toType){
        super(e);
        this.from = fromType;
        this.to = toType;
    }

    public DataTypeException(String e, double amt){
        super(e);
        this.amount = amt;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public double getamt() {
        return this.amount;
    }

}
