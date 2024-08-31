package classes;

import java.util.ArrayList;
import java.util.List;

public class UseEffect {
    List<CallFunction> callFunction=new ArrayList<>();
    List<String> parameters=new ArrayList<>();

    public List<CallFunction> getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(List<CallFunction> callFunction) {
        this.callFunction = callFunction;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        String text=" ";
        if(!callFunction.isEmpty()){
            text+="callFunction=" + callFunction ;
        }
        if(!parameters.isEmpty()){
            text+=", parameters=" + parameters;
        }
        return "\nUseEffect{" +
                text+
                '}';
    }
}
