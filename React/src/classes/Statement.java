package classes;

public class Statement {
//    ArrayOfObject arrayOfObject;
    Declaration declaration;
    Function  function;

    UseHooks useHooks;

    /////////////////////////////////////////////tadel update after recieve the project  add use hook

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public Declaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
    }

    public UseHooks getUseHooks() {
        return useHooks;
    }

    public void setUseHooks(UseHooks useHooks) {
        this.useHooks = useHooks;
    }

    @Override
    public String toString() {
        String text="";
        if(declaration!=null){
           text+= "declaration=" + declaration+',' ;
        }
        if (function!=null) {
            text += "function=" + function+',';
        }
        if (useHooks!=null) {
            text += "useHooks=" + useHooks+',';
        }
            return "\nStatement{" +
                    text+
                    '}';
        }

    }

