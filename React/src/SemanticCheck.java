import org.antlr.v4.runtime.misc.Pair;
import java.util.ArrayList;
import java.util.List;

public class SemanticCheck {
    SymboleTable symboleTable = new SymboleTable();

    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[31m";

    public SymboleTable getSymbolTable() {
        return symboleTable;
    }

    public void setSymbolTable(SymboleTable symboleTable) {
        this.symboleTable = symboleTable;
    }

    boolean check() {
        if(checkUseRef(this.symboleTable)){
            System.out.println(CYAN + "use ref don't declare"+RESET);
            return false;
        }
        else if(checkImport(this.symboleTable,"import value","name use state","useState")){
            System.out.println(CYAN + "don't imported"+RESET);
            return false;
        }
        else if(checkImport(this.symboleTable,"import value","name of use ref","useRef")){
            System.out.println(CYAN + "don't imported"+RESET);
            return false;
        }
        else if(propsDot(this.symboleTable)){
            System.out.println(CYAN + "it is not existed !"+RESET);
            return false;
        }
        else if(dublicatedVariable(this.symboleTable)){
            System.out.println(CYAN+"dublicated variable!"+RESET);
            return false;
        }
        if(checkVariable(this.symboleTable)){
            System.out.println(CYAN+"variable don't declare!"+RESET);
            return false;
        }
        if(checkUseHock(this.symboleTable)){
            System.out.println(CYAN+"can't write use hook here !"+RESET);
            return false;
        }
        else if (checkFunction(this.symboleTable)) {
            System.out.println(CYAN + "dublicated function !"+RESET);
            return false;
        } else if (checkCallFunction(symboleTable)) {
            System.out.println(CYAN + "no function with this name  !"+RESET);
            return false;
        } else if (checkParmeters(this.symboleTable)) {
            System.out.println(CYAN + "dublicated parameters!"+RESET);
            return false;
        } else if (checkMap(this.symboleTable)) {
            System.out.println(CYAN + "map dont declare!"+RESET);
            return false;
        } else if (checkJsx(this.symboleTable)) {
            System.out.println(CYAN + "can't make this with jsx!"+RESET);
            return false;
        }  else
            return true;
    }



    boolean checkImport(SymboleTable symboleTable,String importing,String statement,String valueOfStatement) {///////////////////this function make error of sorting in code generations
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i) != null) {
                if (symboleTable.rows.get(i).getType().contains(statement)) {
                    for (int j = 0; j < symboleTable.rows.size(); j++) {
                        if (symboleTable.rows.get(j).getType().contains(importing)) {
                            if(symboleTable.rows.get(j).getValueList().get(0).a.equals(valueOfStatement)) {
                                return false;
                            }
                        }
                    }
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).b.a.a+RESET);
                        System.out.print(CYAN+valueOfStatement+RESET);
                        return true;
                }
            }
        }
        return false;
    }

    boolean checkCallFunction(SymboleTable symboleTable) {
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i) != null) {
                if (symboleTable.rows.get(i).getType().contains("call function name")) {
                    int count=0;
                    if(symboleTable.rows.get(i).getValueList().size()==2){
                        PackagesInReact packagesInReact=new PackagesInReact();
                        for(int k=0;k<packagesInReact.getPackagesInReact().size();k++){
                            if(packagesInReact.getPackagesInReact().get(k).equals(symboleTable.rows.get(i).getValueList().get(1).a)){
                                count++;
                            }
                        }
                    }else if(symboleTable.rows.get(i).getValueList().size()==1){
                        for (int j = 0; j < symboleTable.rows.size(); j++) {
                            if (symboleTable.rows.get(j).getType().contains("name of function") ||
                                    symboleTable.rows.get(j).getType().contains("name set function in use state") ||
                                    symboleTable.rows.get(j).getType().contains("arrow function name")) {
                                if (symboleTable.rows.get(j).getValueList().get(0).a.equals(symboleTable.rows.get(i).getValueList().get(0).a)) {
                                    count++;
                                }
                            }
                        }
                    }
                    if(count==0) {
                            FunctionsInReact functionsInReact=new FunctionsInReact();
                            for(int k=0;k<functionsInReact.getFunctionsInReact().size();k++){
                                if(functionsInReact.getFunctionsInReact().get(k).equals(symboleTable.rows.get(i).getValueList().get(0).a)){
                                    count++;
                                }
                            }
                            if(count==0) {
                                System.out.print(CYAN + symboleTable.rows.get(i).getValueList().get(0).b.a.a + RESET);
                                System.out.print(CYAN + symboleTable.rows.get(i).getValueList().get(0).a + RESET);
                                return true;
                            }
                    }
                }
            }
        }
        for (int i = 0; i < symboleTable.rows.size(); i++) {//check if call function is existed in classes built in in react or backages
            if (symboleTable.rows.get(i) != null) {
                if (symboleTable.rows.get(i).getType().contains("call function name")) {
                    int count=0;
                    if(symboleTable.rows.get(i).getValueList().size()==2){
                        PackagesInReact packagesInReact=new PackagesInReact();
                        for(int j=0;j<packagesInReact.getPackagesInReact().size();j++){
                            if(packagesInReact.getPackagesInReact().get(j).equals(symboleTable.rows.get(i).getValueList().get(1).a)){
                                count++;
                            }
                        }
                        if(count==0){
                            System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).b.a.a+RESET);
                            System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).a+RESET);
                            return true;
                        }

                    }
                }}}
        return false;
    }


    boolean checkMap(SymboleTable symboleTable) {
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i) != null) {
                if (symboleTable.rows.get(i).getType().contains("map name")) {
                    int count=0;
                    for (int j = 0; j < symboleTable.rows.size(); j++) {
                        if (symboleTable.rows.get(j).getType().contains("name array of object")||symboleTable.rows.get(j).getType().contains("name use state")) {//name use state make an problem in code generation
                            if(symboleTable.rows.get(j).getValueList().get(0).a.equals(symboleTable.rows.get(i).getValueList().get(0).a)) {
                                count++;
                            }
                        }
                    }
                    if(count==0){
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).b.a.a+RESET);
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).a+RESET);
                        return true;
                    }

                }
            }
        }
        return false;
    }


    boolean checkUseRef(SymboleTable symboleTable) {

        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i) != null) {
                if (symboleTable.rows.get(i).getType().contains("attribute in jsx")&&symboleTable.rows.get(i).getValueList().get(0).a.equals("ref")) {
                    int count=0;
                    for (int j = 0; j < symboleTable.rows.size(); j++) {
                        if (symboleTable.rows.get(j).getType().contains("name of use ref")) {//name use state make an problem in code generation(may be this after problem)
                            String text='{'+symboleTable.rows.get(j).getValueList().get(0).a+'}';
                                if (text.equals(symboleTable.rows.get(i).getValueList().get(1).a)) {
                                    count++;
                                }
                        }
                    }
                    if(count==0){
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).b.a.a+RESET);
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).a+RESET);
                        return true;
                    }

                }
            }
        }
        return false;
    }


    boolean checkParmeters(SymboleTable symboleTable) {
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i) != null) {
                if (symboleTable.rows.get(i).getType().contains("parameters of function")) {
                    List<String> list=new ArrayList<>();
                    for (int j = 0; j < symboleTable.rows.get(i).getValueList().size(); j++) {
                        if(list.contains(symboleTable.rows.get(i).getValueList().get(j).a)){
                            System.out.print(CYAN+"line"+symboleTable.rows.get(i).getValueList().get(j).b.a.a+RESET);
                            System.out.print(CYAN+"col"+symboleTable.rows.get(i).getValueList().get(j).b.a.b+RESET);
                            System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(j).a+RESET);
                            return true;
                        }
                        list.add(symboleTable.rows.get(i).getValueList().get(j).a);
                    }
                    list.clear();
                }
            }
        }
        return false;
    }


    boolean checkJsx(SymboleTable symboleTable) {
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i) != null) {
                if (symboleTable.rows.get(i).getType().contains("name of jsx")) {
                    if(symboleTable.rows.get(i).getValueList().size()==2){
                        if(!symboleTable.rows.get(i).getValueList().get(0).a.equals(symboleTable.rows.get(i).getValueList().get(1).a)){
                            System.out.print(CYAN+"line"+symboleTable.rows.get(i).getValueList().get(1).b.a.a+RESET);
                            System.out.print(CYAN+"col"+symboleTable.rows.get(i).getValueList().get(1).b.a.b+RESET);
                            System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(1).a+RESET);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
boolean checkFunction(SymboleTable symboleTable) {
    List<Pair<String, Pair<Pair<Integer, Integer>,Pair<Integer, Integer>>>> list = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    int count=0;
    for (int i = 0; i < symboleTable.rows.size(); i++) {
        if (symboleTable.rows.get(i) != null) {
            if (symboleTable.rows.get(i).getType().contains("name of function")) {
                double smallestStartScope=Double.NEGATIVE_INFINITY;
                double smallestEndScope=Double.NEGATIVE_INFINITY;
                for (int j = 0; j < symboleTable.rows.size(); j++) {
                    if (symboleTable.rows.get(j).getType().contains("arrow function name")) {
                        if (symboleTable.rows.get(i).getValueList().get(0).b.a.a <= (symboleTable.rows.get(j).getValueList().get(0).b.b.b) && symboleTable.rows.get(i).getValueList().get(0).b.a.a >= symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                            if(smallestStartScope<symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                smallestStartScope = symboleTable.rows.get(j).getValueList().get(0).b.b.a;
                                smallestEndScope = symboleTable.rows.get(j).getValueList().get(0).b.b.b;
                            }

                        }
                    }
                }
                if(smallestStartScope==Double.NEGATIVE_INFINITY) {
                    System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).b.a.a+RESET);
                    System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).a+RESET);
                    return true;
                }else {
                    for (int r = 0; r < symboleTable.rows.size(); r++) {
                        if(i==r){}else {
                            if (symboleTable.rows.get(r).getType().contains("name of function")) {
                                double smallestStartScope2=Double.NEGATIVE_INFINITY;
                                double smallestEndScope2=Double.NEGATIVE_INFINITY;
                                for (int j = 0; j < symboleTable.rows.size(); j++) {
                                    if (symboleTable.rows.get(j).getType().contains("arrow function name")) {
                                        if (symboleTable.rows.get(r).getValueList().get(0).b.a.a <= (symboleTable.rows.get(j).getValueList().get(0).b.b.b) && symboleTable.rows.get(r).getValueList().get(0).b.a.a >= symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                            if(smallestStartScope2<symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                                smallestStartScope2 = symboleTable.rows.get(j).getValueList().get(0).b.b.a;
                                                smallestEndScope2 = symboleTable.rows.get(j).getValueList().get(0).b.b.b;
                                            }

                                        }
                                    }
                                }
                                if (smallestStartScope2== smallestStartScope && smallestEndScope2== smallestEndScope) {
                                    if (symboleTable.rows.get(r).getValueList().get(0).a.equals(symboleTable.rows.get(i).getValueList().get(0).a)) {

                                        System.out.println(smallestStartScope2);
                                        System.out.println(smallestEndScope2);
                                        System.out.print(CYAN+symboleTable.rows.get(r).getValueList().get(0).b.a.a+RESET);
                                        System.out.print(CYAN+symboleTable.rows.get(r).getValueList().get(0).a+RESET);
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return false;
}

    boolean propsDot(SymboleTable symboleTable) {///////////////////////////////////please change the name of this function and make update when alot of scop data from outer scope
        List<Pair<String, Pair<Pair<Integer, Integer>,Pair<Integer, Integer>>>> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int count=0;
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i) != null) {
                if (symboleTable.rows.get(i).getType().contains("expression")) {
                    double smallestStartScope=Double.NEGATIVE_INFINITY;
                    double smallestEndScope=Double.NEGATIVE_INFINITY;
                    boolean isMap=false;
                    for (int j = 0; j < symboleTable.rows.size(); j++) {
                        if (symboleTable.rows.get(j).getType().contains("attributes of arrow function")) {
                                    if (symboleTable.rows.get(i).getValueList().get(0).b.a.a <= (symboleTable.rows.get(j).getValueList().get(0).b.b.b) && symboleTable.rows.get(i).getValueList().get(0).b.a.a >= symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                        if(smallestStartScope<symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                            smallestStartScope = symboleTable.rows.get(j).getValueList().get(0).b.b.a;
                                            smallestEndScope = symboleTable.rows.get(j).getValueList().get(0).b.b.b;
                                            isMap=false;
                                        }

                            }
                        }else if (symboleTable.rows.get(j).getType().contains("map name")) {
                            if (symboleTable.rows.get(i).getValueList().get(0).b.a.a <= (symboleTable.rows.get(j).getValueList().get(1).b.b.b) && symboleTable.rows.get(i).getValueList().get(0).b.a.a >= symboleTable.rows.get(j).getValueList().get(1).b.b.a) {
                                if(smallestStartScope<symboleTable.rows.get(j).getValueList().get(1).b.b.a) {
                                    smallestStartScope = symboleTable.rows.get(j).getValueList().get(1).b.b.a;
                                    smallestEndScope = symboleTable.rows.get(j).getValueList().get(1).b.b.b;
                                    isMap=true;
                                }

                            }
                        }
                    }
                    if(smallestStartScope==Double.NEGATIVE_INFINITY) {
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).b.a.a+RESET);
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).a+RESET);
                        return true;
                    }else {
                        String containt;
                        int index;
                        if(isMap){
                            containt="map name";
                            index=1;
                        }else{
                            containt="attributes of arrow function";
                            index=0;
                        }
                        for (int r = 0; r < symboleTable.rows.size(); r++) {
                            if (symboleTable.rows.get(r).getType().contains(containt)) {
                                if(symboleTable.rows.get(r).getValueList().get(index).b.b.a==smallestStartScope){
                                        if (symboleTable.rows.get(r).getValueList().get(index).a.equals(symboleTable.rows.get(i).getValueList().get(0).a)) {
                                        }else{
                                            System.out.println(smallestStartScope);
                                            System.out.println(smallestEndScope);
                                            System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).b.a.a+RESET);
                                            System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).a+RESET);
                                            return true;
                                        }


                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    boolean checkUseHock(SymboleTable symboleTable) {
        int count=0;

        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i) != null) {
                if (symboleTable.rows.get(i).getType().contains("name use state")) {
                    double smallestStartScope=Double.NEGATIVE_INFINITY;
                    double smallestEndScope=Double.NEGATIVE_INFINITY;
                    for (int j = 0; j < symboleTable.rows.size(); j++) {
                        if (symboleTable.rows.get(j).getType().contains("name of function")||symboleTable.rows.get(j).getType().contains("arrow function name")) {

                                if (symboleTable.rows.get(i).getValueList().get(0).b.a.a <= (symboleTable.rows.get(j).getValueList().get(0).b.b.b) && symboleTable.rows.get(i).getValueList().get(0).b.a.a >= symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                    if(smallestStartScope<symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                        smallestStartScope = symboleTable.rows.get(j).getValueList().get(0).b.b.a;
                                        smallestEndScope = symboleTable.rows.get(j).getValueList().get(0).b.b.b;
                                    }
                                }
                            }
                    }
                    if(smallestStartScope==Double.NEGATIVE_INFINITY) {
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).b.a.a+RESET);
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).a+RESET);
                        return true;
                    }else {
                        for (int r = 0; r < symboleTable.rows.size(); r++) {
                            if (symboleTable.rows.get(r).getType().contains("name of function")||symboleTable.rows.get(r).getType().contains("arrow function name")) {
                                if(symboleTable.rows.get(r).getValueList().get(0).b.b.a==smallestStartScope){
                                    if(Character.isUpperCase(symboleTable.rows.get(r).getValueList().get(0).a.charAt(0))){

                                    }
                                    else{
                                        System.out.println(smallestStartScope);
                                        System.out.println(smallestEndScope);
                                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).b.a.a+RESET);
                                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).a+RESET);
                                        return true;
                                    }

                                }
                            }
                        }
                    }

                }
            }
        }

            return false;
    }

boolean checkVariable(SymboleTable symboleTable) {
    List<Pair<String, Pair<Pair<Integer, Integer>,Pair<Integer, Integer>>>> list = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    for (int i = 0; i < symboleTable.rows.size(); i++) {
        if (symboleTable.rows.get(i) != null) {
            if (symboleTable.rows.get(i).getType().contains("assign variable")) {
                int count=0;
                double smallestStartScope=Double.NEGATIVE_INFINITY;
                double smallestEndScope=Double.NEGATIVE_INFINITY;
                for (int j = 0; j < symboleTable.rows.size(); j++) {
                    if (symboleTable.rows.get(j).getType().contains("name of function")||symboleTable.rows.get(j).getType().contains("arrow function name")) {
                        if (symboleTable.rows.get(i).getValueList().get(0).b.a.a <= (symboleTable.rows.get(j).getValueList().get(0).b.b.b) && symboleTable.rows.get(i).getValueList().get(0).b.a.a >= symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                            if(smallestStartScope<symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                smallestStartScope = symboleTable.rows.get(j).getValueList().get(0).b.b.a;
                                smallestEndScope = symboleTable.rows.get(j).getValueList().get(0).b.b.b;
                            }

                        }
                    }
                }
                if(smallestStartScope==Double.NEGATIVE_INFINITY) {
                    System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).b.a.a+RESET);
                    System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).a+RESET);
                    return true;
                }else {
                    for (int r = 0; r < symboleTable.rows.size(); r++) {
                            if (symboleTable.rows.get(r).getType().contains("name of variable")) {
                                double smallestStartScope2=Double.NEGATIVE_INFINITY;
                                double smallestEndScope2=Double.NEGATIVE_INFINITY;
                                for (int j = 0; j < symboleTable.rows.size(); j++) {
                                    if (symboleTable.rows.get(j).getType().contains("name of function")||symboleTable.rows.get(j).getType().contains("arrow function name")) {
                                        if (symboleTable.rows.get(r).getValueList().get(0).b.a.a <= (symboleTable.rows.get(j).getValueList().get(0).b.b.b) && symboleTable.rows.get(r).getValueList().get(0).b.a.a >= symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                            if(smallestStartScope2<symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                                smallestStartScope2 = symboleTable.rows.get(j).getValueList().get(0).b.b.a;
                                                smallestEndScope2 = symboleTable.rows.get(j).getValueList().get(0).b.b.b;
                                            }

                                        }
                                    }
                                }
                                if (smallestStartScope2== smallestStartScope && smallestEndScope2== smallestEndScope) {
                                    if (symboleTable.rows.get(r).getValueList().get(1).a.equals(symboleTable.rows.get(i).getValueList().get(0).a)) {
                                        count++;
                                    }
                                }
                            }
                    }
                    if(count==0){
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).b.a.a+RESET);
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).a+RESET);
                        return true;
                    }
                }
            }
        }
    }
    return false;
}

    boolean dublicatedVariable(SymboleTable symboleTable) {
        List<Pair<String, Pair<Pair<Integer, Integer>,Pair<Integer, Integer>>>> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int count=0;
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i) != null) {
                if (symboleTable.rows.get(i).getType().contains("name of variable")) {
                    double smallestStartScope=Double.NEGATIVE_INFINITY;
                    double smallestEndScope=Double.NEGATIVE_INFINITY;
                    for (int j = 0; j < symboleTable.rows.size(); j++) {
                        if (symboleTable.rows.get(j).getType().contains("name of function")||symboleTable.rows.get(j).getType().contains("arrow function name")) {
                            if (symboleTable.rows.get(i).getValueList().get(0).b.a.a <= (symboleTable.rows.get(j).getValueList().get(0).b.b.b) && symboleTable.rows.get(i).getValueList().get(0).b.a.a >= symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                if(smallestStartScope<symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                    smallestStartScope = symboleTable.rows.get(j).getValueList().get(0).b.b.a;
                                    smallestEndScope = symboleTable.rows.get(j).getValueList().get(0).b.b.b;
                                }

                            }
                        }
                    }
                    if(smallestStartScope==Double.NEGATIVE_INFINITY) {
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).b.a.a+RESET);
                        System.out.print(CYAN+symboleTable.rows.get(i).getValueList().get(0).a+RESET);
                        return true;
                    }else {
                        for (int r = 0; r < symboleTable.rows.size(); r++) {
                            if(i==r){}else {
                                if (symboleTable.rows.get(r).getType().contains("name of variable")) {
                                    double smallestStartScope2=Double.NEGATIVE_INFINITY;
                                    double smallestEndScope2=Double.NEGATIVE_INFINITY;
                                    for (int j = 0; j < symboleTable.rows.size(); j++) {
                                        if (symboleTable.rows.get(j).getType().contains("name of function")||symboleTable.rows.get(j).getType().contains("arrow function name")) {
                                            if (symboleTable.rows.get(r).getValueList().get(0).b.a.a <= (symboleTable.rows.get(j).getValueList().get(0).b.b.b) && symboleTable.rows.get(r).getValueList().get(0).b.a.a >= symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                                if(smallestStartScope2<symboleTable.rows.get(j).getValueList().get(0).b.b.a) {
                                                    smallestStartScope2 = symboleTable.rows.get(j).getValueList().get(0).b.b.a;
                                                    smallestEndScope2 = symboleTable.rows.get(j).getValueList().get(0).b.b.b;
                                                }

                                            }
                                        }
                                    }
                                    if (smallestStartScope2== smallestStartScope && smallestEndScope2== smallestEndScope) {
                                        if (symboleTable.rows.get(r).getValueList().get(1).a.equals(symboleTable.rows.get(i).getValueList().get(1).a)) {
                                            System.out.println(smallestStartScope2);
                                            System.out.println(smallestEndScope2);
                                            System.out.print(CYAN+symboleTable.rows.get(r).getValueList().get(1).b.a.a+RESET);
                                            System.out.print(CYAN+symboleTable.rows.get(r).getValueList().get(1).a+RESET);
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
