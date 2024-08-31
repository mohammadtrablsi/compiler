package classes;

public class Declaration {
    Variable variable;
    ArrayOfObject arrayOfObject;

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public ArrayOfObject getArrayOfObject() {
        return arrayOfObject;
    }

    public void setArrayOfObject(ArrayOfObject arrayOfObject) {
        this.arrayOfObject = arrayOfObject;
    }

    @Override
    public String toString() {
        String text=" ";
        if(variable!=null){
            text+="variable=" + variable+',' ;
        }
        if(arrayOfObject!=null){
            text+="arrayOfObject=" + arrayOfObject+',' ;
        }
        return "\nDeclaration{" +
                text+
                "}";
    }
}
