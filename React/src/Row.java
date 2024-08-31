import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class Row {
    String type;
//    String value;
List<Pair<String, Pair<Pair<Integer, Integer>,Pair<Integer, Integer>>>> valueList=new ArrayList<>();
//    int lineNumber;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

//    public List<String> getValueList() {
//        return valueList;
//    }
//
//    public void setValueList(List<String> valueList) {
//        this.valueList = valueList;
//    }

//    public int getLineNumber() {
//        return lineNumber;
//    }

//    public void setLineNumber(int lineNumber) {
//        this.lineNumber = lineNumber;
//    }

    public List<Pair<String, Pair<Pair<Integer, Integer>,Pair<Integer, Integer>>>> getValueList() {
        return valueList;
    }

    public void setValueList(List<Pair<String, Pair<Pair<Integer, Integer>,Pair<Integer, Integer>>>> valueList) {
        this.valueList = valueList;
    }
}
