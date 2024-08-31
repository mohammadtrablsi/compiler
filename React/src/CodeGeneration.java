import org.antlr.v4.runtime.misc.Pair;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class CodeGeneration {
    public static final String RESET = "\u001B[0m";
    public static final String COLOR = "\u001B[32m";
    SymboleTable symboleTable = new SymboleTable();
    List<Boolean> booleanList;
    String input = Main.getSource();
    int startIndex = input.indexOf("test") + 4;
    String numberStr = input.substring(startIndex, input.indexOf(".txt"));
    int s = Integer.parseInt(numberStr);
    List<Integer> so = Arrays.asList(1, 2, 3);
    List<Pair<List<String>, Pair<Integer, Integer>>> scopsList;

    String text = "";

    public void createBooleanList() {
        int numRows = symboleTable.getRows().size();
        booleanList = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            booleanList.add(false);
        }
    }

    public void createScopsList() {
        int numRows = symboleTable.getRows().size();
        scopsList = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            List<String> stringList = new ArrayList<>();


            Pair<Integer, Integer> minMaxPair = new Pair<>(Integer.MIN_VALUE, Integer.MAX_VALUE);


            scopsList.add(new Pair<>(stringList, minMaxPair));
        }
    }


    void determinateSmallestScop() {
        determinateSmallestScopForJsx2();
        determinateSmallestScopForJsx1();
        determinateSmallestScopForFunction();////////////////////////////////////////////////
        determinateSmallestScopForCallFunction();
        determinateSmallestScopForCallComponent();
        determinateSmallestScopForjsxInFunction();//change 7
    }

    void determinateSmallestScopForJsx2() {
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i).getType().contains("name of jsx")) {//inner
                for (int j = 0; j < symboleTable.rows.size(); j++) {
                    if (symboleTable.rows.get(j).getType().contains("name of jsx")) {
                        if (i == j) {
                        } else {
                            if (symboleTable.rows.get(i).getValueList().size() == 2) {
                                if (symboleTable.rows.get(j).getValueList().size() == 2) {
                                    if (scopsList.get(j).b.b > (symboleTable.rows.get(j).getValueList().get(0).b.a.a) && (symboleTable.rows.get(j).getValueList().get(0).b.a.a) < symboleTable.rows.get(i).getValueList().get(0).b.a.a && (symboleTable.rows.get(j).getValueList().get(1).b.a.a) > (symboleTable.rows.get(i).getValueList().get(1).b.a.a)) {
                                        List<String> stringList = new ArrayList<>();
                                        stringList.add(symboleTable.rows.get(j).getType());
                                        stringList.add(symboleTable.rows.get(j).getValueList().get(0).a);
                                        scopsList.set(i, new Pair<>(stringList, new Pair<>(symboleTable.rows.get(j).getValueList().get(0).b.a.a, symboleTable.rows.get(j).getValueList().get(1).b.a.a)));
                                    }
                                }
                            }
                        }
                    }
                }

            }

        }
    }

    void determinateSmallestScopForJsx1() {
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i).getType().contains("name of jsx")) {//inner
                for (int j = 0; j < symboleTable.rows.size(); j++) {
                    if (symboleTable.rows.get(j).getType().contains("name of jsx")) {
                        if (i == j) {
                        } else {
                            if (symboleTable.rows.get(i).getValueList().size() == 1) {
                                if (symboleTable.rows.get(j).getValueList().size() == 2) {
                                    if (scopsList.get(j).b.b > (symboleTable.rows.get(j).getValueList().get(0).b.a.a) && (symboleTable.rows.get(j).getValueList().get(0).b.a.a) < symboleTable.rows.get(i).getValueList().get(0).b.a.a && (symboleTable.rows.get(j).getValueList().get(1).b.a.a) > (symboleTable.rows.get(i).getValueList().get(0).b.a.a)) {
                                        List<String> stringList = new ArrayList<>();
                                        stringList.add(symboleTable.rows.get(j).getType());
                                        stringList.add(symboleTable.rows.get(j).getValueList().get(0).a);
                                        scopsList.set(i, new Pair<>(stringList, new Pair<>(symboleTable.rows.get(j).getValueList().get(0).b.a.a, symboleTable.rows.get(j).getValueList().get(1).b.a.a)));
                                    }
                                }
                            }
                        }
                    }
                }

            }

        }
    }


    void determinateSmallestScopForFunction() {
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i).getType().contains("arrow function name") || symboleTable.rows.get(i).getType().contains("name of function")) {//inner
                for (int j = 0; j < symboleTable.rows.size(); j++) {
                    if (symboleTable.rows.get(j).getType().contains("arrow function name") || symboleTable.rows.get(j).getType().contains("name of function")) {/////////////////////////////////////////////////
                        if (i == j) {
                        } else {
//                            if (symboleTable.rows.get(i).getValueList().size()==2) {
//                                if (symboleTable.rows.get(j).getValueList().size()==2) {
                            if (scopsList.get(j).b.b > (symboleTable.rows.get(j).getValueList().get(0).b.b.b) && (symboleTable.rows.get(j).getValueList().get(0).b.b.a) < symboleTable.rows.get(i).getValueList().get(0).b.a.a && (symboleTable.rows.get(j).getValueList().get(0).b.b.b) > (symboleTable.rows.get(i).getValueList().get(0).b.a.a)) {
                                List<String> stringList = new ArrayList<>();
                                stringList.add(symboleTable.rows.get(j).getType());
                                stringList.add(symboleTable.rows.get(j).getValueList().get(0).a);
                                scopsList.set(i, new Pair<>(stringList, new Pair<>(symboleTable.rows.get(j).getValueList().get(0).b.b.a, symboleTable.rows.get(j).getValueList().get(0).b.b.b)));
                            }
//                                }
//                            }
                        }
                    }
                }

            }

        }
    }

    void determinateSmallestScopForCallFunction() {
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i).getType().contains("call function name")) {//inner
                for (int j = 0; j < symboleTable.rows.size(); j++) {
                    if (symboleTable.rows.get(j).getType().contains("arrow function name") || symboleTable.rows.get(j).getType().contains("name of function")) {
                        if (i == j) {
                        } else {
//                            if (symboleTable.rows.get(i).getValueList().size()==2) {
//                                if (symboleTable.rows.get(j).getValueList().size()==2) {
                            if (scopsList.get(j).b.b > (symboleTable.rows.get(j).getValueList().get(0).b.b.b) && (symboleTable.rows.get(j).getValueList().get(0).b.b.a) < symboleTable.rows.get(i).getValueList().get(0).b.a.a && (symboleTable.rows.get(j).getValueList().get(0).b.b.b) > (symboleTable.rows.get(i).getValueList().get(0).b.a.a)) {
                                List<String> stringList = new ArrayList<>();
                                stringList.add(symboleTable.rows.get(j).getType());
                                stringList.add(symboleTable.rows.get(j).getValueList().get(0).a);
                                scopsList.set(i, new Pair<>(stringList, new Pair<>(symboleTable.rows.get(j).getValueList().get(0).b.b.a, symboleTable.rows.get(j).getValueList().get(0).b.b.b)));
                            }
//                                }
//                            }
                        }
                    }
                }

            }

        }
    }

    void determinateSmallestScopForCallComponent() {//////////
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i).getType().contains("name of jsx")) {//inner
                for (int j = 0; j < symboleTable.rows.size(); j++) {
                    if (symboleTable.rows.get(j).getType().contains("name of jsx")) {
                        if (i == j) {
                        } else {
                            if (symboleTable.rows.get(i).getValueList().size() == 1 && !Objects.equals(symboleTable.rows.get(i).getValueList().get(0).a, "a") && !Objects.equals(symboleTable.rows.get(i).getValueList().get(0).a, "img") && !Objects.equals(symboleTable.rows.get(i).getValueList().get(0).a, "hr") && !Objects.equals(symboleTable.rows.get(i).getValueList().get(0).a, "br")) {
                                if (symboleTable.rows.get(j).getValueList().size() == 2) {
                                    if (scopsList.get(j).b.b > (symboleTable.rows.get(j).getValueList().get(0).b.a.a) && (symboleTable.rows.get(j).getValueList().get(0).b.a.a) < symboleTable.rows.get(i).getValueList().get(0).b.a.a && (symboleTable.rows.get(j).getValueList().get(1).b.a.a) > (symboleTable.rows.get(i).getValueList().get(0).b.a.a)) {
                                        List<String> stringList = new ArrayList<>();
                                        stringList.add(symboleTable.rows.get(j).getType());
                                        stringList.add(symboleTable.rows.get(j).getValueList().get(0).a);
                                        scopsList.set(i, new Pair<>(stringList, new Pair<>(symboleTable.rows.get(j).getValueList().get(0).b.a.a, symboleTable.rows.get(j).getValueList().get(1).b.a.a)));
                                    }
                                }
                            }
                        }
                    }
                }

            }

        }
    }

    void determinateSmallestScopForjsxInFunction() {//change 6
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            if (symboleTable.rows.get(i).getType().contains("name of jsx")) {//inner
                for (int j = 0; j < symboleTable.rows.size(); j++) {
                    if (symboleTable.rows.get(j).getType().contains("arrow function name") || symboleTable.rows.get(j).getType().contains("name of function")) {//
//                        if(i==j){}else {
//                            if (symboleTable.rows.get(i).getValueList().size()==1&& !Objects.equals(symboleTable.rows.get(i).getValueList().get(0).a, "a") && !Objects.equals(symboleTable.rows.get(i).getValueList().get(0).a, "img") && !Objects.equals(symboleTable.rows.get(i).getValueList().get(0).a, "hr") && !Objects.equals(symboleTable.rows.get(i).getValueList().get(0).a, "br")) {
//                                if (symboleTable.rows.get(j).getValueList().size()==2) {
                        if (scopsList.get(i).b.b > (symboleTable.rows.get(j).getValueList().get(0).b.b.b) && (symboleTable.rows.get(j).getValueList().get(0).b.b.a) < symboleTable.rows.get(i).getValueList().get(0).b.a.a && (symboleTable.rows.get(j).getValueList().get(0).b.b.b) > (symboleTable.rows.get(i).getValueList().get(0).b.a.a)) {
                            List<String> stringList = new ArrayList<>();
                            stringList.add(symboleTable.rows.get(j).getType());
                            stringList.add(symboleTable.rows.get(j).getValueList().get(0).a);
                            scopsList.set(i, new Pair<>(stringList, new Pair<>(symboleTable.rows.get(j).getValueList().get(0).b.b.a, symboleTable.rows.get(j).getValueList().get(0).b.b.b)));
                        }
//                                }
//                            }
//                        }
                    }
                }

            }

        }
    }

    public void generate(SymboleTable symboleTable) {
        PrintWriter writer;
//        boolean isFooter = false;
//        this.Nav = navCode();
//        this.Footer = footerCode();
//        this.FileName = symboleTable.rows.get(0).getValue().replaceAll(" ","");
//        this.text=
//                System.out.print(code());
//        try{
//            writer = new PrintWriter("output3");
//        }catch (FileNotFoundException e){
//            throw new RuntimeException(e);
//        }

//        for (int i=0;i<symboleTable.rows.size();i++){
//            if(symboleTable.rows.get(i)!=null){
//                if (symboleTable.rows.get(i).getType().contains("footer"))
//                {
//                    isFooter=true;
//                    break;
//                }
//            }
//        }
//        if (!isFooter){this.Footer="";}
//        writer.println(code());
        System.out.println(COLOR + code() + RESET);
//        System.out.println(s+"u0u0");

//        writer.println(code());
//        writer.close();

    }

    String code() {
        String text = "";
        text += "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <title>Product List</title>\n";
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            text += declareImport(i);
        }

        text += "</head>\n" +
                "<body>\n";

        for (int i = 0; i < symboleTable.rows.size(); i++) {
            text += appComponent(i).a;
        }
        //      for(int i=0;i<symboleTable.rows.size();i++){
//          System.out.println(i+""+symboleTable.rows.get(i).getValueList().get(0).b.a.a);
//      }
        for (int i = 0; i < symboleTable.rows.size(); i++) {
            text += layout(i).a;
        }

//        symboleTable.rows.remove(10);
//        symboleTable.rows.sort(Comparator.comparing(row -> row.getValueList().get(0).b.a.a));

        text += "\n<script>\n";

        for (int i = 0; i < symboleTable.rows.size(); i++) {
//            if(rows.get(i).getValue()!=null) {
//                System.out.println(CYAN +rows.get(i).getType() + "\t\t\t\t" + rows.get(i).getValue()+RESET);
//            }
//            if(!symboleTable.rows.get(i).getValueList().isEmpty()){
//                System.out.println(symboleTable.rows.get(i).getType() + "\t\t\t\t" + symboleTable.rows.get(i).getValueList()+ "\t");
//            }
//            text+=;
            for (int j = 0; j < symboleTable.rows.size(); j++) {//change3
                text += useState(i, j);
//                if(Objects.equals(scopsList.get(j).a, symboleTable.rows.get(i).getValueList().get(0).b.b.a) && Objects.equals(scopsList.get(j).b, symboleTable.rows.get(i).getValueList().get(0).b.b.b)) {
//                    text+=component(j);
            }
            text += declarationOfArray(i) + appComponent(i).b;
//            if(Objects.equals(scopsList.get(i).a,Integer.MIN_VALUE ) && Objects.equals(scopsList.get(i).b, Integer.MAX_VALUE)) {
            text += component(i);
//            }

//            }
        }
        text += "</script>\n" +
                "</body>\n" +
                "</html>\n";

        return text;
    }

    String declarationOfArray(int i) {
        int count = 0;
        String text = "";
        if (symboleTable.rows.get(i).getType().contains("name array of object")) {
            text += "const  " + symboleTable.rows.get(i).getValueList().get(0).a + "= [";
        }

        for (int k = 0; k < symboleTable.rows.size(); k++) {
            if (symboleTable.rows.get(k).getType().contains("content of array of object")) {
                int isAllVisted=0;
                if (!symboleTable.rows.get(k).getValueList().isEmpty() && !symboleTable.rows.get(i).getValueList().isEmpty()) {
                    if (symboleTable.rows.get(k).getValueList().get(0).b.a.a >= symboleTable.rows.get(i).getValueList().get(0).b.b.a && symboleTable.rows.get(k).getValueList().get(0).b.a.a <= symboleTable.rows.get(i).getValueList().get(0).b.b.b) {
                        text += '{';
                        for (int j = 0; j < symboleTable.rows.get(k).getValueList().size(); j++) {
                            if (j % 2 == 1) {
                                text += ':';
                            }

                            text += symboleTable.rows.get(k).getValueList().get(j).a;
                            if (j % 2 == 1) {
                                text += ',';
                            }
                        }
                        text += "},\n";
                    }
                }
//                booleanList.set(k, true);
            }
        }
        if (symboleTable.rows.get(i).getType().contains("name array of object")) {
            text += "]";
        }
//        if (symboleTable.rows.get(i).getType().contains("name array of object")) {
//            int isAllVisted = 0;
//            for (int j = 0; j < symboleTable.rows.size(); j++) {
//                if (symboleTable.rows.get(j).getType().contains("content of array of object")) {
//                    if (!booleanList.get(j)) {
////                        System.out.println(j+"...................");
//                        isAllVisted++;
//                    }
//                }
//            }
//
//
//            if (isAllVisted == 0) {
//                booleanList.set(i, true);
////                if (symboleTable.rows.get(i).getType().contains("name array of object")) {
//                text += ']';
////                }
//
//            }
//        }


        return text;
    }

    Pair<String, String> appComponent(int i) {
        String text1 = "";
        String text2 = "";
        Pair<String, String> text;
        if (symboleTable.rows.get(i).getType().contains("arrow function name")) {
//            char firstChar = symboleTable.rows.get(i).getValueList().get(0).a.charAt(0);
            if (Objects.equals(symboleTable.rows.get(i).getValueList().get(0).a, "App")) {
                text1 += "<div id=" + '"' + "app" + '"' + "></div>";//symboleTable.rows.get(i).getValueList().get(0).a //change1
                text2 += "\nfunction render() {\n";
//                for(int j=0;j<symboleTable.rows.size();j++){//change2
//                    text2+=useState(i,j);
//                    if(Objects.equals(scopsList.get(j).a, symboleTable.rows.get(i).getValueList().get(0).b.b.a) && Objects.equals(scopsList.get(j).b, symboleTable.rows.get(i).getValueList().get(0).b.b.b)) {
//                        text2+=component(j);
//                    }
//                }
                text2 += "\ndocument.getElementById( " +
//                        Character.toLowerCase(symboleTable.rows.get(i).getValueList().get(0).a.charAt(0))+ symboleTable.rows.get(i).getValueList().get(0).a.substring(1)
                        '"' + "app" + '"' +

                        " ).innerHTML = \n";

                for (int j = 0; j < symboleTable.rows.size(); j++) {
                    if ((Objects.equals(scopsList.get(j).b.a, Integer.MIN_VALUE) && Objects.equals(scopsList.get(j).b.b, Integer.MAX_VALUE)) ||
                            (Objects.equals(scopsList.get(j).b.a, symboleTable.rows.get(i).getValueList().get(0).b.b.a) && Objects.equals(scopsList.get(j).b.b, symboleTable.rows.get(i).getValueList().get(0).b.b.b))) {


                        text2 += jsx(i, j, "div", false);
                        text2 += jsx(i, j, "h1", false);
                        text2 += jsx(i, j, "img", false);
                        text2 += jsx(i, j, "p", false);
                        text2 += jsx(i, j, "button", false);
                        text2 += jsx(i, j, "h2", false);
                        text2 += jsx(i, j, "h3", false);
                        text2 += jsx(i, j, "a", false);
                    }


//                    text2+=callFunctionOfUseState(i,j);
//                    text2+=useArray(i,j);
                }
                text2 += " \n";
//                text2 +=" `;" +
//                        "  }\n";

                text2 += "}";
                text2 += "document.addEventListener(\"DOMContentLoaded\", function() {\n";
                boolean thereIsUseEffect = false;

                for (int b = 0; b < symboleTable.rows.size(); b++) {
                    if (Objects.equals(symboleTable.rows.get(b).getType(), "call function name")) {
                        for (int v = 0; v < symboleTable.rows.size(); v++) {
                            if (Objects.equals(symboleTable.rows.get(v).getType(), "use effect")) {
                                if (symboleTable.rows.get(b).getValueList().get(0).b.a.a > symboleTable.rows.get(v).getValueList().get(0).b.b.a && symboleTable.rows.get(b).getValueList().get(0).b.a.a < symboleTable.rows.get(v).getValueList().get(0).b.b.b) {
                                    text2 += symboleTable.rows.get(b).getValueList().get(0).a + "();\n  });\n";
                                    thereIsUseEffect = true;
                                }
                            }
                        }
                    }
                }
                if (!thereIsUseEffect) {
                    text2 += "render();\n  });\n";
                }


            }
        }
        text = new Pair<>(text1, text2);


        return text;
    }

    String useState(int i, int innerId) {
        String text = "";
//        if(symboleTable.rows.get(i).getType().contains("arrow function name")) {
        if (symboleTable.rows.get(innerId).getType().contains("name use state")) {
            if (!symboleTable.rows.get(i).getValueList().isEmpty()) {
                if (symboleTable.rows.get(i).getValueList().get(0).b.b.a <= (symboleTable.rows.get(innerId).getValueList().get(0).b.a.a) && symboleTable.rows.get(i).getValueList().get(0).b.b.b >= symboleTable.rows.get(innerId).getValueList().get(0).b.a.a) {
                    if (symboleTable.rows.get(innerId).getValueList().size() == 1) {
                        text += "\nlet " + symboleTable.rows.get(innerId).getValueList().get(0).a + "=null;\n";
                    } else {
                        text += "\nlet " + symboleTable.rows.get(innerId).getValueList().get(0).a + "=" + symboleTable.rows.get(innerId).getValueList().get(1).a + ";\n";
                    }
                }
            }
        }
//        }
        return text;
    }

    String component(int i) {


        String text = "";
        if (symboleTable.rows.get(i).getType().contains("arrow function name") || symboleTable.rows.get(i).getType().contains("name of function")) {
//            char firstChar = symboleTable.rows.get(i).getValueList().get(0).a.charAt(0);
            if (!Objects.equals(symboleTable.rows.get(i).getValueList().get(0).a, "App")) {
                text += "\nfunction " + symboleTable.rows.get(i).getValueList().get(0).a + "(";
                booleanList.set(i, true);
                for (int j = 0; j < symboleTable.rows.size(); j++) {

                    text += attributeInComponent(i, j);
//                    text+=useArray(i,j);
                }
                text += "){\n";
//                if(s==so.get(2)) {
//                    for (int j = 0; j < symboleTable.rows.size(); j++) {
//                        if (!booleanList.get(j)) {
//                            text += component(j);
//                        }
//                    }
//                }
                if (symboleTable.rows.get(i).getValueList().size() == 2 && Objects.equals(symboleTable.rows.get(i).getValueList().get(1).a, "return")) {///////////////////////////////////////change5 but return
                    text += "return";
                }
                for (int j = 0; j < symboleTable.rows.size(); j++) {
                    if ((Objects.equals(scopsList.get(j).b.a, Integer.MIN_VALUE) && Objects.equals(scopsList.get(j).b.b, Integer.MAX_VALUE)) ||
                            (Objects.equals(scopsList.get(j).b.a, symboleTable.rows.get(i).getValueList().get(0).b.b.a) && Objects.equals(scopsList.get(j).b.b, symboleTable.rows.get(i).getValueList().get(0).b.b.b))) {


                        text += jsx(i, j, "div", false);
                        text += jsx(i, j, "h1", false);
                        text += jsx(i, j, "img", false);
                        text += jsx(i, j, "p", false);
                        text += jsx(i, j, "button", false);
                        text += jsx(i, j, "h2", false);
                        text += jsx(i, j, "h3", false);
                        text += jsx(i, j, "a", false);
                    }


                    text += callFunctionOfUseState(i, j);

                    if (Objects.equals(scopsList.get(j).b.a, symboleTable.rows.get(i).getValueList().get(0).b.b.a) && Objects.equals(scopsList.get(j).b.b, symboleTable.rows.get(i).getValueList().get(0).b.b.b)) {
                        text += callFunction(i, j);
                    }
//                    if (!booleanList.get(j)) {
//                        text+=component(j);
//                    }

//                    text+=useArray(i,j);
                }
                text += "\n}\n";
                text+=layout(i).b;
            }
        }

        return text;
    }

    String attributeInComponent(int i, int innerId) {
        String text = "";
        if (symboleTable.rows.get(innerId).getType().contains("parameters of function") || symboleTable.rows.get(innerId).getType().contains("attributes of arrow function")) {
            if (Objects.equals(symboleTable.rows.get(i).getValueList().get(0).b.a.a, symboleTable.rows.get(innerId).getValueList().get(0).b.a.a)) {
//                System.out.println("mmm");
                for (int o = 0; o < symboleTable.rows.get(innerId).getValueList().size(); o++) {
                    if (symboleTable.rows.get(innerId).getValueList().size() == 1) {
                        if (Objects.equals(symboleTable.rows.get(innerId).getValueList().get(0).a, "props")) {
                            text += "item";
                        } else {
                            text += symboleTable.rows.get(innerId).getValueList().get(o).a;
                        }
                    } else {
                        text += symboleTable.rows.get(innerId).getValueList().get(o).a + ",";
                    }
                }
            }
        }
        return text;
    }

    String jsx(int i, int innerId, String name, boolean parentIsMap) {


        String text = "";
        if (symboleTable.rows.get(innerId).getType().contains("name of jsx")) {


            if (symboleTable.rows.get(innerId).getValueList().get(0).a.equals(name)) {

//
                int positionOfScop = 0;
                if (parentIsMap) {
                    positionOfScop = 1;
                }
                if (symboleTable.rows.get(i).getValueList().get(positionOfScop).b.b.a <= (symboleTable.rows.get(innerId).getValueList().get(0).b.a.a) && symboleTable.rows.get(i).getValueList().get(positionOfScop).b.b.b >= symboleTable.rows.get(innerId).getValueList().get(0).b.a.a) {
//                    System.out.println("Badrrrrrrrrrr");
//                    System.out.println("093");
                    System.out.println("pppp" + innerId + name);


                    if (Objects.equals(scopsList.get(innerId).a.get(0), "arrow function name") || Objects.equals(scopsList.get(innerId).a.get(0), "name of function") && !Objects.equals(scopsList.get(innerId).a.get(1), "App")) {///////////////////////////////////jjjjjj
                        text += "`";
                        System.out.println("lololololololo");
                    }
//                    }


                    text += "\n<" + name;
                    System.out.println("nmnm" + name + i + "/" + innerId);
                    for (int j = 0; j < symboleTable.rows.size(); j++) {
                        text += attributeInJsx(innerId, j);
                    }
                    text += ">";
                    booleanList.set(innerId, true);
                    for (int j = 0; j < symboleTable.rows.size(); j++) {
                        if (symboleTable.rows.get(j).getType().contains("name of jsx")) {
                            if (!booleanList.get(j)) {////////////////
//                                if(s!=so.get(2)) {
                                if (!symboleTable.rows.get(innerId).getValueList().isEmpty() && !symboleTable.rows.get(j).getValueList().isEmpty()) {
                                    if (symboleTable.rows.get(j).getValueList().size()==1&&(!Objects.equals(symboleTable.rows.get(j).getValueList().get(0).a, "a"))&&(!Objects.equals(symboleTable.rows.get(j).getValueList().get(0).a, "hr"))&&(!Objects.equals(symboleTable.rows.get(j).getValueList().get(0).a, "br"))&&(!Objects.equals(symboleTable.rows.get(j).getValueList().get(0).a, "img"))) {//!Objects.equals(symboleTable.rows.get(j).getValueList().get(0).a, "div") && !Objects.equals(symboleTable.rows.get(j).getValueList().get(0).a, "p") && !Objects.equals(symboleTable.rows.get(j).getValueList().get(0).a, "img") && !Objects.equals(symboleTable.rows.get(j).getValueList().get(0).a, "h1") && !Objects.equals(symboleTable.rows.get(j).getValueList().get(0).a, "button")
                                        if (symboleTable.rows.get(innerId).getValueList().size() == 2) {
                                            if (symboleTable.rows.get(innerId).getValueList().get(0).b.a.a <= (symboleTable.rows.get(j).getValueList().get(0).b.a.a) && symboleTable.rows.get(innerId).getValueList().get(1).b.a.a >= symboleTable.rows.get(j).getValueList().get(0).b.a.a) {
//                                                            System.out.println("Badrrrrrrrrrr");
                                                if (Objects.equals(scopsList.get(j).b.a, symboleTable.rows.get(innerId).getValueList().get(0).b.a.a) && Objects.equals(scopsList.get(j).b.b, symboleTable.rows.get(innerId).getValueList().get(1).b.a.a)) {
                                                    text += "\n${" + symboleTable.rows.get(j).getValueList().get(0).a + "(";
                                                    for (int o = 0; o < symboleTable.rows.size(); o++) {
                                                        text += propsInComponent(j, o);
                                                    }
                                                    text += ")}\n";
                                                }

                                            }
                                        }
                                    }
//                                    }
                                }
                                if (Objects.equals(scopsList.get(j).b.a, symboleTable.rows.get(innerId).getValueList().get(0).b.a.a) && Objects.equals(scopsList.get(j).b.b, symboleTable.rows.get(innerId).getValueList().get(1).b.a.a)) {
                                    text += jsx(i, j, "h1", false);
                                    text += jsx(i, j, "img", false);
                                    text += jsx(i, j, "p", false);
                                    text += jsx(i, j, "button", false);
                                    text += jsx(i, j, "div", false);
                                    text += jsx(i, j, "h2", false);
                                    text += jsx(i, j, "h3", false);
                                    text += jsx(i, j, "a", false);
                                }
                            }
                        } else {
                            text += useArray(innerId, j);//i
                            text += expressionInJsx(innerId, j);
                            text += stringContentInJsx(innerId, j);
                        }
                    }
                    if (symboleTable.rows.get(innerId).getValueList().size() == 2) {
                        text += "</" + name + ">\n";
                    }
//                    for(int j=0;j<symboleTable.rows.size();j++) {//change 4
                    if (Objects.equals(scopsList.get(innerId).a.get(0), "arrow function name") || Objects.equals(scopsList.get(innerId).a.get(0), "name of function") && !Objects.equals(scopsList.get(innerId).a.get(1), "App")) {
                        text += "`";
                        System.out.println("lololololololo");
                    }
//                    }
                }
            }
        }
        return text;
    }


    String expressionInJsx(int i, int innerId) {
        String text = "";

        if (symboleTable.rows.get(innerId).getType().contains("expression")) {


            if (Objects.equals(symboleTable.rows.get(i).getValueList().get(0).b.a.a, symboleTable.rows.get(innerId).getValueList().get(0).b.a.a)) {
//                System.out.println("mmm");
                text += "${item" + symboleTable.rows.get(innerId).getValueList().get(symboleTable.rows.get(innerId).getValueList().size() - 2).a + symboleTable.rows.get(innerId).getValueList().get(symboleTable.rows.get(innerId).getValueList().size() - 1).a + "}";
            }
        }
        return text;
    }

    String stringContentInJsx(int i, int innerId) {
        String text = "";

        if (symboleTable.rows.get(innerId).getType().contains("String content of jsx")) {


            if (Objects.equals(symboleTable.rows.get(i).getValueList().get(0).b.a.a, symboleTable.rows.get(innerId).getValueList().get(0).b.a.a)) {
//                System.out.println("mmm");
                for (int q = 0; q < symboleTable.rows.get(innerId).getValueList().size(); q++) {
                    text += symboleTable.rows.get(innerId).getValueList().get(q).a + " ";
                }
            }
        }
        return text;
    }


    String attributeInJsx(int i, int innerId) {
        String text = "";
        if (symboleTable.rows.get(innerId).getType().contains("attribute in jsx")) {
            if (Objects.equals(symboleTable.rows.get(i).getValueList().get(0).b.a.a, symboleTable.rows.get(innerId).getValueList().get(0).b.a.a)) {
//                System.out.println("mmm");
                if (Objects.equals(symboleTable.rows.get(innerId).getValueList().get(0).a, "ref")) {
                    text += " " + "id" + "=";
                    if (symboleTable.rows.get(innerId).getValueList().size() == 2) {
                        String original = symboleTable.rows.get(innerId).getValueList().get(1).a;
                        String withoutBraces = original.replaceAll("[{}]", ""); // Remove the braces


                        text += '"' + withoutBraces + '"';
                    }
                } else if (Objects.equals(symboleTable.rows.get(innerId).getValueList().get(0).a, "src")) {
                    boolean ImageDeclareInImport = false;
                    for (int r = 0; r < symboleTable.rows.size(); r++) {
                        if (symboleTable.rows.get(r).getType().contains("import value")) {
                            if (Objects.equals('{' + symboleTable.rows.get(r).getValueList().get(0).a + '}', symboleTable.rows.get(innerId).getValueList().get(1).a)) {
                                text += " src=" + symboleTable.rows.get(r + 1).getValueList().get(0).a;
                                ImageDeclareInImport = true;
                            }
                        }
                    }
                    if (!ImageDeclareInImport) {
                        String original = symboleTable.rows.get(innerId).getValueList().get(1).a;
//                    String withoutBraces = original.replaceAll("[{}]", ""); // Remove the braces
                        String modified = original.replace("props.data.", "item.");
                        text += " src=" + "$" + modified;
                    }

                } else {
                    if (Objects.equals(symboleTable.rows.get(innerId).getValueList().get(0).a, "className")) {
                        text += " " + "class" + "=";
                    } else {
                        text += " " + symboleTable.rows.get(innerId).getValueList().get(0).a + "=";
                    }
                    if (symboleTable.rows.get(innerId).getValueList().size() == 2) {
                        text += symboleTable.rows.get(innerId).getValueList().get(1).a;
                    }
                }
                if (Objects.equals(symboleTable.rows.get(innerId).getValueList().get(0).a, "onClick")) {

                    for (int f = 0; f < symboleTable.rows.size(); f++) {
                        if (symboleTable.rows.get(f).getType().contains("call function name")) {

                            System.out.println("nono");
                            if (Objects.equals(symboleTable.rows.get(innerId).getValueList().get(0).b.a.a, symboleTable.rows.get(f).getValueList().get(0).b.a.a)) {
                                text += '"' + symboleTable.rows.get(f).getValueList().get(0).a + "(";

                                for (int h = 0; h < symboleTable.rows.size(); h++) {
                                    if (symboleTable.rows.get(h).getType().contains("parameters of call function")) {
                                        System.out.println("nono");
                                        if (Objects.equals(symboleTable.rows.get(h).getValueList().get(0).b.a.a, symboleTable.rows.get(f).getValueList().get(0).b.a.a)) {
                                            for (int z = 0; z < symboleTable.rows.get(h).getValueList().size(); z++) {
                                                text += "'" + symboleTable.rows.get(h).getValueList().get(z).a + "'";
                                            }
                                        }


                                    }
                                }
                                text += layout2(f);
                                text += ")"+'"';
                            }


                        }
                    }


                }


            }
        }
        return text;
    }

    String propsInComponent(int i, int innerId) {
        String text = "";

        if (symboleTable.rows.get(innerId).getType().contains("props in component")) {


            if (Objects.equals(symboleTable.rows.get(i).getValueList().get(0).b.a.a, symboleTable.rows.get(innerId).getValueList().get(1).b.a.a)) {
//                System.out.println("mmm");
                String original = symboleTable.rows.get(innerId).getValueList().get(1).a;
                String withoutBraces = original.replaceAll("[{}]", ""); // Remove the braces


                text += withoutBraces;
            }
        }
        return text;
    }

    String callFunctionOfUseState(int i, int innerId) {
        String text = "";
        boolean isOfUseState = false;
        if (symboleTable.rows.get(innerId).getType().contains("call function name")) {
            for (int k = 0; k < symboleTable.rows.size(); k++) {
                if (symboleTable.rows.get(k).getType().contains("name set function in use state")) {
                    if (Objects.equals(symboleTable.rows.get(innerId).getValueList().get(0).a, symboleTable.rows.get(k).getValueList().get(0).a)) {
                        isOfUseState = true;
                    }
                }
            }
            if (isOfUseState) {
                if (symboleTable.rows.get(i).getValueList().get(0).b.b.a <= (symboleTable.rows.get(innerId).getValueList().get(0).b.a.a) && symboleTable.rows.get(i).getValueList().get(0).b.b.b >= symboleTable.rows.get(innerId).getValueList().get(0).b.a.a) {
//                    System.out.println("Badrrrrrrrrrr");
                    for (int t = 0; t < symboleTable.rows.size(); t++) {
                        if (symboleTable.rows.get(t).getType().contains("name use state")) {
                            for (int k = 0; k < symboleTable.rows.size(); k++) {
                                if (symboleTable.rows.get(k).getType().contains("name set function in use state")) {
                                    if (Objects.equals(symboleTable.rows.get(t).getValueList().get(0).b.a.a, symboleTable.rows.get(k).getValueList().get(0).b.a.a)) {
//                                        System.out.println("jfjfjfj");
                                        booleanList.set(innerId, true);
                                        text += symboleTable.rows.get(t).getValueList().get(0).a + "=";
                                    }
                                }
                            }


                        }
                    }

                    String parameterOfCall = "";
                    boolean isRecuri = false;
                    for (int t = 0; t < symboleTable.rows.size(); t++) {
                        if (symboleTable.rows.get(t).getType().contains("parameters of call function")) {
                            for (int x = 0; x < symboleTable.rows.size(); x++) {
                                if (symboleTable.rows.get(x).getType().contains("call function name")) {
                                    if (!booleanList.get(x)) {
                                        System.out.println("xxx");
                                        if (Objects.equals(symboleTable.rows.get(x).getValueList().get(0).b.a.a, symboleTable.rows.get(t).getValueList().get(0).b.a.a)) {
                                            text += symboleTable.rows.get(x).getValueList().get(1).a + "." + symboleTable.rows.get(x).getValueList().get(0).a + "(";
                                            isRecuri = true;
                                        }
//                                        text+=callFunctionOfUseState(innerId,x);
//                                        isRecuri=false
                                    }
                                }
                            }
                            if (Objects.equals(symboleTable.rows.get(t).getValueList().get(0).b.a.a, symboleTable.rows.get(innerId).getValueList().get(0).b.a.a)) {
                                text += symboleTable.rows.get(t).getValueList().get(0).a + ';';
                            }
                            if (isRecuri) {
                                text += ");";
                            }
                            text += " \n";
                        }
                    }

                    text += " render();";

                }
            }
        }
        return text;
    }

    String callFunction(int i, int innerId) {
        String text = "";
        if (symboleTable.rows.get(innerId).getType().contains("call function name")) {
            if (Objects.equals(symboleTable.rows.get(innerId).getValueList().get(0).a, "scrollIntoView")) {
                if (symboleTable.rows.get(i).getValueList().get(0).b.b.a <= (symboleTable.rows.get(innerId).getValueList().get(0).b.a.a) && symboleTable.rows.get(i).getValueList().get(0).b.b.b >= symboleTable.rows.get(innerId).getValueList().get(0).b.a.a) {
                    text += "document.getElementById(refer).scrollIntoView({ behavior: 'smooth' });";
                }
            }

        }
        return text;
    }

    String useArray(int i, int innerId) {

        String text = "";
        if (symboleTable.rows.get(innerId).getType().contains("map name")) {

//            System.out.println(symboleTable.rows.get(innerId).getValueList().get(0).b.a.a);
            if (symboleTable.rows.get(i).getValueList().get(0).b.a.a <= (symboleTable.rows.get(innerId).getValueList().get(0).b.a.a) && symboleTable.rows.get(i).getValueList().get(1).b.a.a >= symboleTable.rows.get(innerId).getValueList().get(0).b.a.a) {

                text += "${" + symboleTable.rows.get(innerId).getValueList().get(0).a + ".map((item, index) =>`";//change 4
                for (int j = 0; j < symboleTable.rows.size(); j++) {

                    text += jsx(innerId, j, "button", true);////i
                    text += jsx(innerId, j, "div", true);////i
                    text += jsx(innerId, j, "h1", true);
                    text += jsx(innerId, j, "img", true);
                    text += jsx(innerId, j, "p", true);
                    text += jsx(innerId, j, "h2", true);
                    text += jsx(innerId, j, "h3", true);
                    text += jsx(innerId, j, "a", true);

                }
                text += "`).join('')\n}\n";
            }
        }
        return text;
    }

    String declareImport(int i) {

        String text = "";
        if (symboleTable.rows.get(i).getType().contains("import value")) {
            if (Objects.equals(symboleTable.rows.get(i).getValueList().get(0).a, "axios")) {
                text += "<script src=\"https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js\"></script>";
            }
        }
        return text;
    }

    public SymboleTable getSymboleTable() {
        return symboleTable;
    }

    String layout2(int f) {
        String text = "";
        if (Objects.equals(symboleTable.rows.get(f).getValueList().get(0).a, "handleClick")) {
            text += "'${item.productId}'";
        }
        return text;
    }

    public void setSymbolTable(SymboleTable symboleTable) {
        this.symboleTable = symboleTable;
    }

    Pair<String, String> layout(int i) {
        String text1 = "";
        String text2 = "";
        Pair<String, String> text;
        if (symboleTable.rows.get(i).getType().contains("arrow function name")) {
//            char firstChar = symboleTable.rows.get(i).getValueList().get(0).a.charAt(0);
            if (!Objects.equals(symboleTable.rows.get(i).getValueList().get(0).a, "App")) {
                if(s==so.get(2)) {
                    text1 += "<div id=" + '"' + "app" + '"' + "></div>";
                    text2 += "\ndocument.getElementById( " +
                            '"' + "app" + '"' +
                            " ).innerHTML = Test(); \n";
                }


            }
        }
        text = new Pair<>(text1, text2);
        return text;
    }
}
