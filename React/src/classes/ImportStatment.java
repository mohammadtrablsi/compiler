package classes;

public class ImportStatment {
    String value;
    String fromValue;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFromValue() {
        return fromValue;
    }

    public void setFromValue(String fromValue) {
        this.fromValue = fromValue;
    }

//    @Override
    public String toString() {
        String text=" ";
        text+="value=" + value ;
        if(fromValue!=null){
            text+=", fromValue=" + fromValue ;
        }
        return "\nImportStatment{" +
                text+
                "}";
    }
}
