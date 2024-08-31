package classes;

public class UseRef {
    String nameOfUseRef;
    String valueOfUseRef;

    public String getNameOfUseRef() {
        return nameOfUseRef;
    }

    public void setNameOfUseRef(String nameOfUseRef) {
        this.nameOfUseRef = nameOfUseRef;
    }

    public String getValueOfUseRef() {
        return valueOfUseRef;
    }

    public void setValueOfUseRef(String valueOfUseRef) {
        this.valueOfUseRef = valueOfUseRef;
    }

    @Override
    public String toString() {
        String text=" ";
        if(nameOfUseRef!=null){
            text+="nameOfUseRef=" + nameOfUseRef+',' ;
        }
        if(valueOfUseRef!=null){
            text+="valueOfUseRef=" + valueOfUseRef ;
        }
        return "\nUseRef{" +
                text+
                '}';
    }
}
