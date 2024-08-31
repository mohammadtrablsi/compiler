package classes;

public class KeyValue{
    String key;
    String value;
//    ValueBoolean valueBoolean;
//    ValueInt valueInt;
//    ValueChar valueChar;
    CallFunction callFunction;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValueString() {
        return value;
    }

    public void setValueString(String valueString) {
        this.value = valueString;
    }

//    public ValueBoolean getValueBoolean() {
//        return valueBoolean;
//    }
//
//    public void setValueBoolean(ValueBoolean valueBoolean) {
//        this.valueBoolean = valueBoolean;
//    }
//
//    public ValueInt getValueInt() {
//        return valueInt;
//    }
//
//    public void setValueInt(ValueInt valueInt) {
//        this.valueInt = valueInt;
//    }
//
//    public ValueChar getValueChar() {
//        return valueChar;
//    }

//    public void setValueChar(ValueChar valueChar) {
//        this.valueChar = valueChar;
//    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    @Override
    public String toString() {
        String text = "";
        if(key!=null) {
            text += " key=" + key ;
        }
        if(value!=null) {
            text += " value=" + value ;
        }
        if(callFunction!=null) {
            text += " valueCallFunction=" +callFunction ;
        }
            return "KeyValue{" +
                    text+
                    '}';
        }

    }

