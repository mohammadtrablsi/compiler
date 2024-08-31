package classes;

public class MAp {
    String nameOfArray;
    ValueOfReturn valueOfReturn;

    String item;

    public String getnameOfArray() {
        return nameOfArray;
    }

    public void setnameOfArray(String nameOfArray) {
        this.nameOfArray = nameOfArray;
    }

    public ValueOfReturn getValueOfReturn() {
        return valueOfReturn;
    }

    public void setValueOfReturn(ValueOfReturn valueOfReturn) {
        this.valueOfReturn = valueOfReturn;
    }

    public String getNameOfArray() {
        return nameOfArray;
    }

    public void setNameOfArray(String nameOfArray) {
        this.nameOfArray = nameOfArray;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        String text="";
        text+="nameOfArray=" + nameOfArray ;
        if(item!=null){
            text+=", item=" + item;
        }
        if(valueOfReturn!=null){
            text+=", valueOfReturn=" + valueOfReturn;
        }
        return "\nMap{" +
                text
                 +
                "}";
    }
}
