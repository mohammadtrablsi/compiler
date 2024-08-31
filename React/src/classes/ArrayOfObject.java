package classes;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfObject {
    String name;
    List<OBject> objectList=new ArrayList<>();

    public List<OBject> getoBjectList() {
        return objectList;
    }

    public void setoBjectList(List<OBject> oBjectList) {
        this.objectList = oBjectList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String text=" ";
        text+="name='" + name ;
        if(!objectList.isEmpty()){
            text+=", objectList=" + objectList;
        }
        return "\nArrayOfObject{" +
                text+
                "}";
    }
}
