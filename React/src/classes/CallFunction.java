package classes;

import java.util.ArrayList;
import java.util.List;

public class CallFunction {
    String name;
    List<String> parametersList=new ArrayList<>();
    CallFunction callFunction;
    List<ObjectOfClass> objectsName=new ArrayList<>();
    String current;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getParametersList() {
        return parametersList;
    }

    public void setParametersList(List<String> parametersList) {
        this.parametersList = parametersList;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public List<ObjectOfClass> getObjectsName() {
        return objectsName;
    }

    public void setObjectsName(List<ObjectOfClass> objectsName) {
        this.objectsName = objectsName;
    }

    @Override
    public String toString() {
        String text=" ";
        if(!objectsName.isEmpty()){
            text+="objects=" + objectsName+',' ;
        }
        if(current!=null){
            text+="current=" +current+',' ;
        }
        text+="functionName=" + name+',';
        if(!parametersList.isEmpty()){
            text+="parametersList=" + parametersList+',';
        }
        if(callFunction!=null){
            text+="callFunction=" + callFunction;
        }
        return "\nCallFunction{" +
                text+
                "}";
    }

}
