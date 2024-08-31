package classes;


import java.util.ArrayList;
import java.util.List;

public class OBject {
    List<KeyValue> KeyValueList=new ArrayList<>();

    public List<KeyValue> getKeyValueList() {
        return KeyValueList;
    }

    public void setKeyValueList(List<KeyValue> keyValueList) {
        KeyValueList = keyValueList;
    }

    @Override
    public String toString() {
        return "\nOBject{" +
                "KeyValueList=" + KeyValueList +
                '}';
    }
}
