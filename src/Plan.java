public class Plan {
    private String type;
    private double value;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
        setValue(type);
    }

    public double getValue() {
        return this.value;
    }

    private void setValue(String type) {
        if (type.equals("mensal")) {
            this.value = 44.90;
        } else if (type.equals("semestral")) {
            this.value = 31.90;
        } else if (type.equals("anual")) {
            this.value = 24.90;
        }
    }
}
