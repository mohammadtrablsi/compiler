package classes;

import java.util.ArrayList;
import java.util.List;

public class Function {
//    ValueString name;
   String name;
    List<String> parametersList=new ArrayList<>();/////////////////////

    ContentOfBody contentOfBody;
    String typeOfFunction;/////to optimize the print////



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



    public ContentOfBody getContentOfBody() {
        return contentOfBody;
    }

    public void setContentOfBody(ContentOfBody contentOfBody) {
        this.contentOfBody = contentOfBody;
    }

    public String getTypeOfFunction() {
        return typeOfFunction;
    }

    public void setTypeOfFunction(String typeOfFunction) {
        this.typeOfFunction = typeOfFunction;
    }

    @Override
    public String toString() {
        String text=" ";
        text+="name=" + name;

        if (!parametersList.isEmpty()){
            text+=",parametersList=" + parametersList;
        }
        if (contentOfBody!=null){
            text+=",contentOfBody=" + contentOfBody;
        }
            return "\n"+typeOfFunction+"{" +
                    text+
                    "}";
        }

}
