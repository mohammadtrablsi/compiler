package classes;

import java.util.ArrayList;
import java.util.List;

public class JsxContent {
    List<Jsx> jsxList=new ArrayList<>();

    String string;

    List<ValueInt> identifierInt=new ArrayList<>();


    
    //////////////////////

    MAp mAp;


    JsxStatement jsxStatement;

    List<String> propsCall=new ArrayList<>();

    List<String> identifierString=new ArrayList<>();

    public List<Jsx> getJsxList() {
        return jsxList;
    }

    public void setJsxList(List<Jsx> jsxList) {
        this.jsxList = jsxList;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public List<ValueInt> getIdentifierInt() {
        return identifierInt;
    }

    public void setIdentifierInt(List<ValueInt> identifierInt) {
        this.identifierInt = identifierInt;
    }

    public List<String> getIdentifierString() {
        return identifierString;
    }

    public void setIdentifierString(List<String> identifierString) {
        this.identifierString = identifierString;
    }



    public List<String> getpropsCall() {
        return propsCall;
    }

    public void setpropsCall(List<String> propsCall) {
        this.propsCall = propsCall;
    }

    public MAp getmAp() {
        return mAp;
    }

    public void setmAp(MAp mAp) {
        this.mAp = mAp;
    }


    public JsxStatement getJsxStatement() {
        return jsxStatement;
    }

    public void setJsxStatement(JsxStatement jsxStatement) {
        this.jsxStatement = jsxStatement;
    }

    @Override
    public String toString() {
        String text="";
        if(jsxStatement!=null) {
            text+=" " + jsxStatement;
        }
        if(!identifierString.isEmpty()) {
            text+="String=" + identifierString+',';
        }
        if(string!=null) {
            text+="string=" + string+',';
        }
        if(!jsxList.isEmpty()){
            text+="jsxList=" + jsxList+',';

        }///////////////////////////////////////////////////////////////////
        if(mAp!=null){
            text+="map=" + mAp+',';

        }
        if(!propsCall.isEmpty()){
            text+="expression=" + propsCall+',';

        }
       
        return " " +
                text
                + " ";
    }
}
