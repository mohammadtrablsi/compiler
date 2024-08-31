package classes;

import java.util.ArrayList;
import java.util.List;

public class ContentOfBody {

//    List<ItemOfContentOfBody> itemOfContentOfBodyList=new ArrayList<>();
    List<Jsx> jsx=new ArrayList<>();
    List<CallFunction> callFunction=new ArrayList<>();
    List<UseHooks> useHooks=new ArrayList<>();
    List<Function> function=new ArrayList<>();
    List<Declaration>declaration=new ArrayList<>();
    List<Assignment>assignment=new ArrayList<>();


    ValueOfReturn valueOfReturn;

    public List<Assignment> getAssignment() {
        return assignment;
    }

    public void setAssignment(List<Assignment> assignment) {
        this.assignment = assignment;
    }

    public List<Jsx> getJsx() {
        return jsx;
    }

    public void setJsx(List<Jsx> jsx) {
        this.jsx = jsx;
    }

    public List<CallFunction> getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(List<CallFunction> callFunction) {
        this.callFunction = callFunction;
    }


    public List<UseHooks> getUseHooks() {
        return useHooks;
    }

    public void setUseHooks(List<UseHooks> useHooks) {
        this.useHooks = useHooks;
    }

    public ValueOfReturn getValueOfReturn() {
        return valueOfReturn;
    }

    public void setValueOfReturn(ValueOfReturn valueOfReturn) {
        this.valueOfReturn = valueOfReturn;
    }

    public List<Function> getFunction() {
        return function;
    }

    public void setFunction(List<Function> function) {
        this.function = function;
    }

    public List<Declaration> getDeclaration() {
        return declaration;
    }

    public void setDeclaration(List<Declaration> declaration) {
        this.declaration = declaration;
    }

    @Override
    public String toString() {
        String text = "";
        if(!useHooks.isEmpty()){
            text+="useHooks=" + useHooks+',' ;
        }
        if(!declaration.isEmpty()){
            text+="declaration=" + declaration+',' ;
        }
        if(!assignment.isEmpty()){
            text+="assignment=" + assignment+',' ;
        }
        if(!function.isEmpty()){
            text+="function=" + function+',' ;
        }
        if(valueOfReturn!=null) {
            text += " valueOfReturn=" + valueOfReturn+',' ;
        }
        if (!jsx.isEmpty()){
            text +=  "jsx=" + jsx+',' ;
        }

        if(!callFunction.isEmpty()){
            text+="callFunction=" + callFunction+',' ;
        }


return "ContentOfBody{" +text+'}';

    }
}
