package classes;

import java.util.ArrayList;
import java.util.List;

public class Jsx {
    String name;
    KeyValue aTribute;
    KeyValue props;
    List<JsxContent> jsxContent=new ArrayList<>();
    // content



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JsxContent> getJsxContent() {
        return jsxContent;
    }

    public void setJsxContent(List<JsxContent> jsxContent) {
        this.jsxContent = jsxContent;
    }
    public KeyValue getaTribute() {
        return aTribute;
    }

    public void setaTribute(KeyValue aTribute) {
        this.aTribute = aTribute;
    }

    public KeyValue getProps() {
        return props;
    }

    public void setProps(KeyValue props) {
        this.props = props;
    }

    @Override
    public String toString() {
        String text="";
        if(name!=null) {
            text+="name=" + name;
        }
        if(aTribute!=null){
            text+=",aTribute=" + aTribute;

        }
        if(!jsxContent.isEmpty()) {
            text+=",jsxContent=" + jsxContent;
        }
        if(props!=null) {
            text+=",props=" + props;
        }

        return " " +
                text
                + " ";
    }

}
