

import java.util.ArrayList;
import java.util.List;

public class SymboleTable {
    List<Row> rows=new ArrayList<>();

    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
    public void print(){
        for(int i=0;i<rows.size();i++){
//            if(rows.get(i).getValue()!=null) {
//                System.out.println(CYAN +rows.get(i).getType() + "\t\t\t\t" + rows.get(i).getValue()+RESET);
//            }
            if(!rows.get(i).getValueList().isEmpty()){
                System.out.println(CYAN +i+" "+rows.get(i).getType() + "\t\t\t\t" + rows.get(i).getValueList()+ "\t" +RESET);
            }
        }
    }
}
