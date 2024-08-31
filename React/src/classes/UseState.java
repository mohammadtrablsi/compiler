package classes;

public class UseState {
    String nameOfUseState;
    String nameOfSetFunction;

//    ValueBoolean valueBoolean;
//    ValueInt valueInt;
//    ValueChar valueChar;

    public String getNameOfUseState() {
        return nameOfUseState;
    }

    public void setNameOfUseState(String nameOfUseState) {
        this.nameOfUseState = nameOfUseState;
    }

    public String getNameOfSetFunction() {
        return nameOfSetFunction;
    }

    public void setNameOfSetFunction(String nameOfSetFunction) {
        this.nameOfSetFunction = nameOfSetFunction;
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
//
//    public void setValueChar(ValueChar valueChar) {
//        this.valueChar = valueChar;
//    }

    @Override
    public String toString() {
        String text=" ";
        text+="nameOfUseState="+nameOfUseState+",";
        text+="nameOfSetFunction="+nameOfSetFunction+",";

            return "\nUseState{" +
                    text+
                    '}';
        }

}
