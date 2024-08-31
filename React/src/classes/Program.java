package classes;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    List<ImportStatment> importsList=new ArrayList<>();
    List<Statement> statementList=new ArrayList<>();

    public List<ImportStatment> getImportsList() {
        return importsList;
    }

    public void setImportsList(List<ImportStatment> importsList) {
        this.importsList = importsList;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    @Override
    public String toString() {
        String text=" ";
        if(!importsList.isEmpty()){
            text+= " \nimportsList=" + importsList  + "," ;
        }
        if(!statementList.isEmpty()){
            text+="\n statementList=" + statementList;
        }
        return "Program{" +
                  text+
                "}";
    }
}
