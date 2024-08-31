import antlr.ReactGrammarBaseVisitor;
import antlr.ReactGrammarParser;
import classes.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BaseVisitor extends ReactGrammarBaseVisitor {
    SymboleTable symboleTable = new SymboleTable();
    @Override
    public Program visitProgram(ReactGrammarParser.ProgramContext ctx) {
        Program program = new Program();

        for (int i = 0; i < ctx.import_statement().size(); i++) {

            if (ctx.import_statement(i) != null)
                program.getImportsList().add(visitImport_statement(ctx.import_statement().get(i)));
        }
        for (int i = 0; i < ctx.statement().size(); i++) {
            program.getStatementList().add(visitStatement(ctx.statement().get(i)));
        }
        this.symboleTable.print();
        SemanticCheck semanticCheck = new SemanticCheck();
        semanticCheck.setSymbolTable(this.symboleTable);
        //     semanticCheck.check();
        if(semanticCheck.check()){
            CodeGeneration codeGeneration =new CodeGeneration();
            codeGeneration.setSymbolTable(this.symboleTable);
            codeGeneration.createBooleanList();
            codeGeneration.createScopsList();
            codeGeneration.determinateSmallestScop();
            codeGeneration.generate(this.symboleTable);
//            for(int i=0;i<codeGeneration.booleanList.size();i++){
//                System.out.println(codeGeneration.booleanList.get(i)+" "+i+"    "+symboleTable.rows.get(i).getValueList());
//            }
//            for(int i=0;i<codeGeneration.scopsList.size();i++){
//                System.out.println(codeGeneration.scopsList.get(i)+" "+i+"    "+symboleTable.rows.get(i).getValueList());
//            }

        }
        return program;
    }


    @Override
    public ImportStatment visitImport_statement(ReactGrammarParser.Import_statementContext ctx) {
        ImportStatment importStatment = new ImportStatment();

        int lineValue=0 ;
        int columnValue=0;

        int lineFromValue=0 ;
        int columnFromValue=0;


        if (!ctx.specific_identifier().isEmpty() && Objects.equals(ctx.getChild(1).getText(), ctx.specific_identifier().get(0).getText())) {
            importStatment.setFromValue(ctx.STRING().get(0).getText());
            importStatment.setValue(ctx.specific_identifier().get(0).getText());

            lineValue=getLineNumber(ctx.specific_identifier().get(0).IDENTIFIER());
            columnValue=getColumnNumber(ctx.specific_identifier().get(0).IDENTIFIER());

            lineFromValue=getLineNumber(ctx.STRING().get(0));
            columnFromValue=getColumnNumber(ctx.STRING().get(0));


        }
        if (!ctx.USE_HOOK().isEmpty() && Objects.equals(ctx.getChild(2).getText(), ctx.USE_HOOK().get(0).getText())) {
            importStatment.setFromValue(ctx.STRING().get(0).getText());
            importStatment.setValue(ctx.USE_HOOK().get(0).getText());

            lineValue=getLineNumber(ctx.USE_HOOK().get(0));
            columnValue=getColumnNumber(ctx.USE_HOOK().get(0));

            lineFromValue=getLineNumber(ctx.STRING().get(0));
            columnFromValue=getColumnNumber(ctx.STRING().get(0));


        }
        if (ctx.specific_identifier().isEmpty() && Objects.equals(ctx.getChild(1).getText(), ctx.STRING().get(0).getText())) {
            importStatment.setFromValue(ctx.STRING().get(0).getText());



            lineFromValue=getLineNumber(ctx.STRING().get(0));
            columnFromValue=getColumnNumber(ctx.STRING().get(0));
        }


        Row row =new Row();
        row.setType("import value");
        row.getValueList().add(new Pair<>(importStatment.getValue(), new Pair<>(new Pair<>(lineValue, columnValue),new Pair<>(-1,-1))));
        this.symboleTable.getRows().add(row);


        Row row1 =new Row();
        row1.setType("import from");
        row1.getValueList().add(new Pair<>(importStatment.getFromValue(), new Pair<>(new Pair<>(lineFromValue, columnFromValue),new Pair<>(-1,-1))));
        if(lineFromValue!=0) {
            this.symboleTable.getRows().add(row1);
        }

        return importStatment;
    }

    @Override
    public Statement visitStatement(ReactGrammarParser.StatementContext ctx) {
        Statement statement = new Statement();


        if (ctx.function() != null && !ctx.function().isEmpty() &&
                Objects.equals(ctx.getChild(0).getText(), ctx.function().getText())) {
            statement.setFunction(visitFunction(ctx.function())); //function
        }


        if (ctx.arrowfunction() != null && !ctx.arrowfunction().isEmpty() &&
                Objects.equals(ctx.getChild(0).getText(), ctx.arrowfunction().getText())) {
            statement.setFunction(visitArrowfunction(ctx.arrowfunction())); // arrowfunction
        }

        if (ctx.declaration() != null && !ctx.declaration().isEmpty() &&//arrayOfObject
                Objects.equals(ctx.getChild(0).getText(), ctx.declaration().getText())) {
            statement.setDeclaration(visitDeclaration(ctx.declaration()));
        }

        if (ctx.usehooks() != null && !ctx.usehooks().isEmpty() &&
                Objects.equals(ctx.getChild(0).getText(), ctx.usehooks().getText())) {
            statement.setUseHooks(visitUsehooks(ctx.usehooks())); //add after taslem///////////////////////////////////
        }


        return statement;
    }


    @Override
    public Function visitFunction(ReactGrammarParser.FunctionContext ctx) {
        Function function = new Function();

        int lineName=0 ;
        int columnName=0;

        int startScope=0 ;
        int endScope=0;

        int lineParameter=0 ;
        int columnParameter=0;

        Row row1 =new Row();

        function.setTypeOfFunction("fucntion");//function
        function.setName(visitFunction_identifier(ctx.function_identifier()).get(0).getText());

        lineName=getLineNumber(visitFunction_identifier(ctx.function_identifier()).get(0));
        columnName=getColumnNumber(visitFunction_identifier(ctx.function_identifier()).get(0));


        for (int i = 1; i < visitFunction_identifier(ctx.function_identifier()).size(); i++) {
            function.getParametersList().add(visitFunction_identifier(ctx.function_identifier()).get(i).getText());

            lineParameter=getLineNumber(visitFunction_identifier(ctx.function_identifier()).get(i));
            columnParameter=getColumnNumber(visitFunction_identifier(ctx.function_identifier()).get(i));

            row1.getValueList().add(new Pair<>(visitFunction_identifier(ctx.function_identifier()).get(i).getText(), new Pair<>(new Pair<>(lineParameter, columnParameter),new Pair<>(-1,-1))));
        }

        startScope=ctx.function_body().LBRACE().getSymbol().getLine();
        endScope=ctx.function_body().RBRACE().getSymbol().getLine();

        Row row =new Row();
        row.setType("name of function");
        row.getValueList().add(new Pair<>(function.getName(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(startScope,endScope))));
        for(int i=0;i<ctx.function_body().children.size();i++){
            if(ctx.function_body().getChild(i).getChild(0)!=null&&Objects.equals(ctx.function_body().getChild(i).getChild(0).getText(), "return")){
                row.getValueList().add(new Pair<>(ctx.function_body().getChild(i).getChild(0).getText(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
            }
        }
        this.symboleTable.getRows().add(row);



        row1.setType("parameters of function");
        if(lineParameter!=0) {
            this.symboleTable.getRows().add(row1);
        }


        function.setContentOfBody(visitFunction_body(ctx.function_body()));
        return function;
    }

    @Override
    public List<TerminalNode> visitFunction_identifier(ReactGrammarParser.Function_identifierContext ctx) {//name and parameters

        List<TerminalNode> functionIdentifierList = new ArrayList<>();
        functionIdentifierList.add(ctx.IDENTIFIER());
        if (ctx.parameter_list().children != null) {
            for (int i = 0; i < ctx.parameter_list().data_type().size(); i++) {

                functionIdentifierList.add(ctx.parameter_list().data_type(i).IDENTIFIER());

            }
        }

        return functionIdentifierList;
    }

    @Override
    public ContentOfBody visitFunction_body(ReactGrammarParser.Function_bodyContext ctx) {
        ContentOfBody contentOfBody = new ContentOfBody();

        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement().get(i).functionCall() != null && !ctx.statement().get(i).functionCall().isEmpty() ) {

                contentOfBody.getCallFunction().add(visitFunctionCall(ctx.statement().get(i).functionCall()));
            }
        }

        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement().get(i).usehooks() != null && !ctx.statement().get(i).usehooks().isEmpty() ) {
                contentOfBody.getUseHooks().add(visitUsehooks(ctx.statement().get(i).usehooks()));
            }
        }
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement().get(i).declaration() != null && !ctx.statement().get(i).declaration().isEmpty() ) {
                contentOfBody.getDeclaration().add(visitDeclaration(ctx.statement().get(i).declaration()));
            }
        }
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement().get(i).assignment() != null && !ctx.statement().get(i).assignment().isEmpty() ) {
                contentOfBody.getAssignment().add(visitAssignemento(ctx,i));
            }
        }
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement().get(i).function() != null && !ctx.statement().get(i).function().isEmpty() ) {
                contentOfBody.getFunction().add(visitFunction(ctx.statement().get(i).function()));
            }
        }

        if (ctx.returnStatement() != null && !ctx.returnStatement().isEmpty() ) {
            contentOfBody.setValueOfReturn(visitReturnStatement(ctx.returnStatement()));
        }


        return contentOfBody;
    }

    @Override
    public CallFunction visitFunctionCall(ReactGrammarParser.FunctionCallContext ctx) {

        CallFunction callFunction = new CallFunction();

        int lineName=0 ;
        int columnName=0;

        int lineParameter=0 ;
        int columnParameter=0;

        Row row1 =new Row();

        callFunction.setName(ctx.IDENTIFIER().get(ctx.IDENTIFIER().size()-1).getText());

        lineName=getLineNumber(ctx.IDENTIFIER().get(ctx.IDENTIFIER().size()-1));
        columnName=getColumnNumber(ctx.IDENTIFIER().get(ctx.IDENTIFIER().size()-1));



        if (ctx.parameter_list().children != null&&!ctx.parameter_list().data_type().isEmpty()&&ctx.parameter_list().data_type()!=null) {
            for (int i = 0; i < ctx.parameter_list().data_type().size(); i++) {
                if(ctx.parameter_list().data_type().get(i).IDENTIFIER()!=null) {
                    callFunction.getParametersList().add(ctx.parameter_list().data_type(i).IDENTIFIER().toString());//i*2//ahmad is dog

                    lineParameter=getLineNumber(ctx.parameter_list().data_type(i).IDENTIFIER());
                    columnParameter=getColumnNumber(ctx.parameter_list().data_type(i).IDENTIFIER());

                    row1.getValueList().add( new Pair<>(ctx.parameter_list().data_type(i).IDENTIFIER().toString(),new Pair<>( new Pair<>(lineParameter, columnParameter),new Pair<>(-1,-1))));

                }else if(ctx.parameter_list().data_type().get(i).STRING()!=null) {
                    callFunction.getParametersList().add(ctx.parameter_list().data_type(i).STRING().toString());//i*2//ahmad is dog

                    lineParameter=getLineNumber(ctx.parameter_list().data_type(i).STRING());
                    columnParameter=getColumnNumber(ctx.parameter_list().data_type(i).STRING());

                    row1.getValueList().add( new Pair<>(ctx.parameter_list().data_type(i).STRING().toString(), new Pair<>(new Pair<>(lineParameter, columnParameter),new Pair<>(-1,-1))));

                }

            }
        }


        if(!ctx.IDENTIFIER().isEmpty()&&ctx.IDENTIFIER()!=null) {
            List<ObjectOfClass> ids=new ArrayList<>();
            for (int i = 0; i < ctx.IDENTIFIER().size() - 1; i++) {
                ids.add(new ObjectOfClass());
            }

            for (int i = 0; i < ctx.IDENTIFIER().size() - 1; i++) {
                ids.get(i).setName(ctx.IDENTIFIER().get(i).getText());

            }
            callFunction.setObjectsName(ids);
            //System.out.print("3"+callFunction.getObjectsName());
        }
        if (ctx.parameter_list().children != null&&!ctx.parameter_list().functionCall().isEmpty()&&ctx.parameter_list().functionCall()!=null) {

            if(ctx.parameter_list().IDENTIFIER()!=null) {
                ObjectOfClass objectOfClass=new ObjectOfClass();
                objectOfClass.setName(ctx.parameter_list().IDENTIFIER().toString());
                callFunction.getObjectsName().add(objectOfClass);
                //System.out.print("1");
            }
            if(ctx.parameter_list().functionCall().get(0)!=null) {
                callFunction.setCallFunction(visitFunctionCall(ctx.parameter_list().functionCall().get(0)));//i*2
                //System.out.print("2");
            }


        }
        if(!ctx.CURRENT().isEmpty()&&ctx.CURRENT()!=null) {
            callFunction.setCurrent(ctx.CURRENT().get(0).toString());
        }
//        if (!ctx.parameter_list().IDENTIFIER().isEmpty()&&ctx.parameter_list().IDENTIFIER()!=null) {////////because ahmad i dont get any way instead of this
//            for (int i = 0; i < ctx.parameter_list().getChildCount(); i++) {
//                callFunction.getParametersList().add(ctx.parameter_list().getChild(i).toString());
//
//            }
//        }
        Row row =new Row();
        row.setType("call function name");
        row.getValueList().add(new Pair<>(callFunction.getName(),new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
        if(ctx.parent.getChildCount()>1) {
            if (ctx.parent.getChild(1).getText().equals(".")) {//for classes like axios
                row.getValueList().add(new Pair<>(ctx.parent.getChild(0).getText(), new Pair<>(new Pair<>(-1, -1), new Pair<>(-1, -1))));
            }
        }
//        row.getValueList().add(callFunction.getName());
        this.symboleTable.getRows().add(row);


        row1.setType("parameters of call function");
//        row1.setValueList(callFunction.getParametersList());
        if (lineParameter!=0) {
            this.symboleTable.getRows().add(row1);
        }

        return callFunction;

    }


    public  Assignment visitAssignemento(ReactGrammarParser.Function_bodyContext ctx,int i) {
        int lineName=0;
        int columnName=0;
        Assignment assignment=new Assignment();
        if(ctx.statement().get(i).assignment()!=null){
            assignment.setName(ctx.statement().get(i).assignment().getChild(0).getText());
            assignment.setValue(ctx.statement().get(i).assignment().getChild(2).getText());
            lineName=getLineNumber((TerminalNode) ctx.statement().get(i).assignment().getChild(0));
            columnName=getColumnNumber((TerminalNode) ctx.statement().get(i).assignment().getChild(0));
        }
        Row row =new Row();
        row.setType("assign variable");
        row.getValueList().add(new Pair<>(assignment.getName(),new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
//        row.getValueList().add(callFunction.getName());
        this.symboleTable.getRows().add(row);
        return assignment;
    }

    //arrow function

    @Override
    public Function visitArrowfunction(ReactGrammarParser.ArrowfunctionContext ctx) {

        Function function = new Function();

        int lineName=0 ;
        int columnName=0;

        int lineParameter=0 ;
        int columnParameter=0;

        int startScope=0;
        int endScope=0;

        int startNameFunctionScope=0;
        int endNameFunctionScope=0;

        Row row1 =new Row();

        function.setTypeOfFunction("arrow function");//arrow function
        function.setName(visitArrow_function_identifier(ctx.arrow_function_identifier()).get(0).getText());

        lineName=getLineNumber(visitArrow_function_identifier(ctx.arrow_function_identifier()).get(0));
        columnName=getColumnNumber(visitArrow_function_identifier(ctx.arrow_function_identifier()).get(0));

        for (int i = 1; i < visitArrow_function_identifier(ctx.arrow_function_identifier()).size(); i++) {
            function.getParametersList().add(visitArrow_function_identifier(ctx.arrow_function_identifier()).get(i).getText());

            lineParameter=getLineNumber(visitArrow_function_identifier(ctx.arrow_function_identifier()).get(i));
            columnParameter=getColumnNumber(visitArrow_function_identifier(ctx.arrow_function_identifier()).get(i));

            startScope=ctx.function_body().LBRACE().getSymbol().getLine();
            endScope=ctx.function_body().RBRACE().getSymbol().getLine();


            row1.getValueList().add(new Pair<>(visitArrow_function_identifier(ctx.arrow_function_identifier()).get(i).getText(),new Pair<>(new Pair<>(lineParameter, columnParameter),new Pair<>(startScope,endScope))));
        }

        startNameFunctionScope=ctx.function_body().LBRACE().getSymbol().getLine();
        endNameFunctionScope=ctx.function_body().RBRACE().getSymbol().getLine();
        Row row =new Row();
        row.setType("arrow function name");
        row.getValueList().add(new Pair<>(function.getName(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(startNameFunctionScope,endNameFunctionScope))));
        for(int i=0;i<ctx.function_body().children.size();i++){
            if(ctx.function_body().getChild(i).getChild(0)!=null&&Objects.equals(ctx.function_body().getChild(i).getChild(0).getText(), "return")){
                row.getValueList().add(new Pair<>(ctx.function_body().getChild(i).getChild(0).getText(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
            }
        }

        this.symboleTable.getRows().add(row);


        row1.setType("attributes of arrow function");
//        row1.setValueList(function.getParametersList());
        if(lineParameter!=0) {
            this.symboleTable.getRows().add(row1);
        }

        function.setContentOfBody(visitFunction_body(ctx.function_body()));
        return function;
    }

    @Override
    public List<TerminalNode> visitArrow_function_identifier(ReactGrammarParser.Arrow_function_identifierContext ctx) {
        List<TerminalNode> arrowFunctionIdentifierList = new ArrayList<>();
        arrowFunctionIdentifierList.add(ctx.IDENTIFIER());
        if (ctx.parameter_list().children != null) {
            for (int i = 0; i < ctx.parameter_list().data_type().size(); i++) {//fpor not

                arrowFunctionIdentifierList.add(ctx.parameter_list().data_type(i).IDENTIFIER());


            }
        }
        return arrowFunctionIdentifierList;
    }




    @Override
    public UseHooks visitUsehooks(ReactGrammarParser.UsehooksContext ctx) {
        UseHooks useHooks = new UseHooks();
        if(ctx.useState()!=null&&!ctx.useState().isEmpty()) {
            useHooks.setUseState(visitUseState(ctx.useState()));
        }
        if(ctx.useEffect()!=null&&!ctx.useEffect().isEmpty()) {
            useHooks.setUseEffect(visitUseEffect(ctx.useEffect()));
        }
        if(ctx.useRef()!=null&&!ctx.useRef().isEmpty()) {
            useHooks.setUseRef(visitUseRef(ctx.useRef()));
        }

        return useHooks;
    }

    @Override
    public UseState visitUseState(ReactGrammarParser.UseStateContext ctx) {
        UseState useState=new UseState();

        int lineName=0 ;
        int columnName=0;

        int lineFunction=0 ;
        int columnFunction=0;

        useState.setNameOfUseState(ctx.getChild(2).getText());
        useState.setNameOfSetFunction(ctx.getChild(4).getText());

        lineName=getLineNumber( ctx.IDENTIFIER().get(0));
        columnName=getColumnNumber( ctx.IDENTIFIER().get(0));

        lineFunction=getLineNumber( ctx.IDENTIFIER().get(1));
        columnFunction=getColumnNumber( ctx.IDENTIFIER().get(1));


        Row row =new Row();
        row.setType("name use state");
        row.getValueList().add( new Pair<>(ctx.getChild(2).getText(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
        if(!ctx.data_type().isEmpty()&&ctx.data_type()!=null) {
            row.getValueList().add(new Pair<>(ctx.data_type().get(0).getText(), new Pair<>(new Pair<>(lineName, columnName), new Pair<>(-1, -1))));
        }
//        row.getValueList().add(ctx.getChild(2).getText());
        this.symboleTable.getRows().add(row);

        Row row1 =new Row();
        row1.setType("name set function in use state");
//        row1.getValueList().add(ctx.getChild(4).getText());
        row1.getValueList().add( new Pair<>(ctx.getChild(4).getText(), new Pair<>(new Pair<>(lineFunction, columnFunction),new Pair<>(-1,-1))));

        this.symboleTable.getRows().add(row1);
        return useState;
    }

    @Override
    public Declaration visitDeclaration(ReactGrammarParser.DeclarationContext ctx) {
        Declaration declaration=new Declaration();
        if(!ctx.object().isEmpty()) {
            int lineName=0 ;
            int columnName=0;
            ArrayOfObject arrayOfObject = new ArrayOfObject();
            arrayOfObject.setName(ctx.IDENTIFIER().getText());


            lineName = getLineNumber(ctx.IDENTIFIER());
            columnName = getColumnNumber(ctx.IDENTIFIER());

            Row row = new Row();
            row.setType("name array of object");
            row.getValueList().add(new Pair<>(ctx.IDENTIFIER().getText(), new Pair<>(new Pair<>(lineName, columnName), new Pair<>(ctx.LBRACKET().getSymbol().getLine(), ctx.RBRACKET().getSymbol().getLine()))));
//        row.getValueList().add(ctx.getChild(2).getText());
            this.symboleTable.getRows().add(row);

            if (!ctx.object().isEmpty() && ctx.object() != null) {
                for (int i = 0; i < visitObject(ctx.object().get(0), 1).size(); i++) {
                    if (i == 0) {
                        arrayOfObject.getoBjectList().add(visitObject(ctx.object().get(0), 0).get(i));
                    } else {
                        arrayOfObject.getoBjectList().add(visitObject(ctx.object().get(0), 1).get(i));
                    }
                }
            }
            declaration.setArrayOfObject(arrayOfObject);
        }else if(ctx.IDENTIFIER()!=null){
            int lineType=0 ;
            int columnType=0;
            int lineName=0 ;
            int columnName=0;
            int lineValue=0 ;
            int columnValue=0;
            Variable variable=new Variable();
            variable.setType(ctx.varModifier().getText());
            variable.setName(ctx.IDENTIFIER().getText());
            variable.setValue(ctx.expression().getText());
            declaration.setVariable(variable);
            lineType = getLineNumber((TerminalNode) ctx.varModifier().getChild(0));
            columnType = getColumnNumber((TerminalNode) ctx.varModifier().getChild(0));
            lineName = getLineNumber(ctx.IDENTIFIER());
            columnName = getColumnNumber(ctx.IDENTIFIER());
            lineValue = getLineNumber((TerminalNode) ctx.expression().getChild(0));
            columnValue = getColumnNumber((TerminalNode) ctx.expression().getChild(0));
            Row row1 = new Row();
            row1.setType("name of variable");
            row1.getValueList().add(new Pair<>(ctx.varModifier().getText(), new Pair<>(new Pair<>(lineType, columnType), new Pair<>(-1, -1))));
            row1.getValueList().add(new Pair<>(ctx.IDENTIFIER().getText(), new Pair<>(new Pair<>(lineName, columnName), new Pair<>(-1, -1))));
            row1.getValueList().add(new Pair<>(ctx.expression().getText(), new Pair<>(new Pair<>(lineValue, columnValue), new Pair<>(-1, -1))));

//        row.getValueList().add(ctx.getChild(2).getText());
            this.symboleTable.getRows().add(row1);
        }
        return declaration;
    }




    public List<OBject> visitObject(ReactGrammarParser.ObjectContext ctx,int number) {
        List<OBject> objects=new ArrayList<>();
        List<Row>rows=new ArrayList<>();


        int lineArray=0 ;
        int columnArray=0;

        Row row =new Row();

        int current=0;
        int k=0;//for list of key_value_list

        for(int i=0;i<ctx.children.size();i++){
            if(Objects.equals(ctx.getChild(i).getText(), ctx.LBRACE().get(0).getText())){
                objects.add(new OBject());
                rows.add(new Row());
            }
        }

        for(int i=0;i<ctx.children.size();i++){


            if (!Objects.equals(ctx.getChild(i).getText(), ctx.RBRACE().get(0).getText())&&!Objects.equals(ctx.getChild(i).getText(), ctx.LBRACE().get(0).getText())&&!Objects.equals(ctx.getChild(i).getText(), ctx.COMMA().get(0).getText())) {



                KeyValue keyValue=new KeyValue();
                keyValue.setKey(ctx.key_value_pair().get(k).IDENTIFIER().get(0).getText());

                lineArray=getLineNumber(ctx.key_value_pair().get(k).IDENTIFIER().get(0));
                columnArray=getColumnNumber(ctx.key_value_pair().get(k).IDENTIFIER().get(0));
                rows.get(current).setType("content of array of object");//+' '+(current+1)
                rows.get(current).getValueList().add( new Pair<>(ctx.key_value_pair().get(k).IDENTIFIER().get(0).getText(), new Pair<>(new Pair<>(lineArray, columnArray),new Pair<>(-1,-1))));

                if (ctx.key_value_pair().get(k).data_type() != null && !ctx.key_value_pair().get(k).data_type() .isEmpty() ) {
                    keyValue.setValueString(ctx.key_value_pair().get(k).data_type().getChild(0).getText());

                    lineArray=getLineNumber((TerminalNode) ctx.key_value_pair().get(k).data_type().getChild(0));
                    columnArray=getColumnNumber((TerminalNode) ctx.key_value_pair().get(k).data_type().getChild(0));
                    rows.get(current).getValueList().add( new Pair<>(ctx.key_value_pair().get(k).data_type().getChild(0).getText(), new Pair<>(new Pair<>(lineArray, columnArray),new Pair<>(-1,-1))));
                }else{
                    keyValue.setValueString(ctx.key_value_pair().get(k).IDENTIFIER().get(1).getText());

                    lineArray=getLineNumber(ctx.key_value_pair().get(k).IDENTIFIER().get(1));
                    columnArray=getColumnNumber(ctx.key_value_pair().get(k).IDENTIFIER().get(1));
                    rows.get(current).getValueList().add( new Pair<>(ctx.key_value_pair().get(k).IDENTIFIER().get(1).getText(), new Pair<>(new Pair<>(lineArray, columnArray),new Pair<>(-1,-1))));

                }
                objects.get(current).getKeyValueList().add(keyValue);
                k++;
            }
            if(Objects.equals(ctx.getChild(i).getText(), ctx.RBRACE().get(0).getText())){


                ++current;
            }


        }



//        row.getValueList().add(ctx.getChild(2).getText());

        for(int i=0;i<rows.size();i++){
            if(number==0) {
                System.out.print(number);
                this.symboleTable.getRows().add(rows.get(i));
            }
        }


        return objects;
    }








    @Override
    public ValueOfReturn visitReturnStatement(ReactGrammarParser.ReturnStatementContext ctx) {
        ValueOfReturn valueOfReturn =new ValueOfReturn();
        valueOfReturn.setJsxStatement(visitJsxStatement(ctx.jsxStatement()));
        return valueOfReturn;
    }


    @Override
    public JsxStatement visitJsxStatement(ReactGrammarParser.JsxStatementContext ctx) {
        JsxStatement jsxStatement = new JsxStatement();



        if(ctx.div()!=null&&!ctx.div().isEmpty()) {
            jsxStatement.setJsx(visitDiv(ctx.div()));
        }
        if(ctx.h1()!=null&&!ctx.h1().isEmpty()) {
            jsxStatement.setJsx(visitH1(ctx.h1()));
        }
        if(ctx.h2()!=null&&!ctx.h2().isEmpty()) {
            jsxStatement.setJsx(visitH2(ctx.h2()));
        }
        if(ctx.h3()!=null&&!ctx.h3().isEmpty()) {
            jsxStatement.setJsx(visitH3(ctx.h3()));
        }
        if(ctx.img()!=null&&!ctx.img().isEmpty()) {
            jsxStatement.setJsx(visitImg(ctx.img()));
        }
        if(ctx.p()!=null&&!ctx.p().isEmpty()) {
            jsxStatement.setJsx(visitP(ctx.p()));
        }
        if(ctx.button()!=null&&!ctx.button().isEmpty()) {
            jsxStatement.setJsx(visitButton(ctx.button()));
        }
        if(ctx.a()!=null&&!ctx.a().isEmpty()) {
            jsxStatement.setJsx(visitA(ctx.a()));
        }
        if(ctx.br()!=null&&!ctx.br().isEmpty()) {
            jsxStatement.setJsx(visitBr(ctx.br()));
        }
        if(ctx.hr()!=null&&!ctx.hr().isEmpty()) {
            jsxStatement.setJsx(visitHr(ctx.hr()));
        }
        if(ctx.component()!=null&&!ctx.component().isEmpty()) {
            jsxStatement.setJsx(visitComponent(ctx.component()));
        }


        return jsxStatement;
    }

    @Override
    public Jsx visitDiv(ReactGrammarParser.DivContext ctx) {
        Jsx jsx = new Jsx();

        int lineName=0 ;
        int columnName=0 ;


        int lineAttributeKey=0 ;
        int columnAttributeKey=0 ;
        int lineAttributeValue=0 ;
        int columnAttributeValue=0 ;

        Row row2 =new Row();

        jsx.setName(ctx.getChild(1).getText());

        lineName=getLineNumber( ctx.DIV_TAG().get(0));
        columnName=getColumnNumber(ctx.DIV_TAG().get(0));


        if(!ctx.attributes().isEmpty()&&ctx.attributes()!=null) {
            KeyValue keyValue = new KeyValue();
            keyValue.setKey(ctx.attributes().get(0).getChild(0).getText());/////////////////////////////
            keyValue.setValueString(ctx.attributes().get(0).getChild(2).getText());
            jsx.setaTribute(keyValue);

            lineAttributeKey=getLineNumber((TerminalNode) ctx.attributes().get(0).getChild(0));
            columnAttributeKey=getColumnNumber((TerminalNode) ctx.attributes().get(0).getChild(0));

            lineAttributeValue=getLineNumber((TerminalNode) ctx.attributes().get(0).getChild(2));
            columnAttributeValue=getColumnNumber((TerminalNode) ctx.attributes().get(0).getChild(2));

            row2.getValueList().add( new Pair<>(ctx.attributes().get(0).getChild(0).getText(), new Pair<>(new Pair<>(lineAttributeKey, columnAttributeKey),new Pair<>(-1,-1))));
            row2.getValueList().add( new Pair<>(ctx.attributes().get(0).getChild(2).getText(), new Pair<>(new Pair<>(lineAttributeValue, columnAttributeValue),new Pair<>(-1,-1))));

        }

        Row row =new Row();
        row.setType("name of jsx");
        row.getValueList().add( new Pair<>(jsx.getName(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
        if(ctx.DIV_TAG().size()==2) {
            row.getValueList().add(new Pair<>(ctx.DIV_TAG().get(1).getText(), new Pair<>(new Pair<>(getLineNumber(ctx.DIV_TAG().get(1)), getColumnNumber(ctx.DIV_TAG().get(1))), new Pair<>(-1, -1))));
        }
//        row.getValueList().add(jsxStatement.getJsx().getName());
        this.symboleTable.getRows().add(row);

//        Row row1 =new Row();
//        row1.setType("props in jsx");

       /* if (jsxStatement.getJsx().getProps() != null) {
            if (jsxStatement.getJsx().getProps().getKey() != null) {
//                row1.getValueList().add(jsxStatement.getJsx().getProps().getKey());
                // row1.getValueList().add( new Pair<>(ctx.getChild(2).getText(), new Pair<>(lineName, columnName)));

            }
            if (jsxStatement.getJsx().getProps().getValueString() != null) {
//                row1.getValueList().add(jsxStatement.getJsx().getProps().getValueString());
            }
            this.symboleTable.getRows().add(row1);
        } else {

        }

*/
        row2.setType("attribute in jsx");
        if(lineAttributeKey!=0) {
            this.symboleTable.getRows().add(row2);
        }

        for(int i=0;i<ctx.jsxContent().size();i++) {
            jsx.getJsxContent().add(visitJsxContent(ctx.jsxContent().get(i)));
        }

       /* if (jsxStatement.getJsx().getaTribute()!= null) {
            if (jsxStatement.getJsx().getaTribute().getKey() != null) {
//                row2.getValueList().add(jsxStatement.getJsx().getaTribute().getKey());
            }
            if (jsxStatement.getJsx().getaTribute().getValueString() != null) {
//                row2.getValueList().add(jsxStatement.getJsx().getaTribute().getValueString());
            }
            this.symboleTable.getRows().add(row2);
        } else {

        }*/
        return jsx;
    }

    @Override
    public JsxContent visitJsxContent(ReactGrammarParser.JsxContentContext ctx) {
        JsxContent jsxContent = new JsxContent();

        int lineString=0 ;
        int columnString=0 ;

        int linePropsCall=0 ;
        int columnPropsCall=0 ;


        Row row =new Row();
        Row row1 =new Row();

        if(ctx.jsxStatement()!=null&&!ctx.jsxStatement().isEmpty()) {
            jsxContent.setJsxStatement(visitJsxStatement(ctx.jsxStatement()));
        }
        if(ctx.expression()!=null&&!ctx.expression().isEmpty()) {
            for (int i=0;i<ctx.expression().getChildCount();i++) {
                jsxContent.getpropsCall().add(ctx.expression().getChild(i).getText());

                linePropsCall=getLineNumber((TerminalNode) ctx.expression().getChild(i));
                columnPropsCall=getColumnNumber((TerminalNode) ctx.expression().getChild(i));
                row1.getValueList().add( new Pair<>(ctx.expression().getChild(i).getText(), new Pair<>(new Pair<>(linePropsCall, columnPropsCall),new Pair<>(-1,-1))));
            }
        }
        if(ctx.mapStatement()!=null&&!ctx.mapStatement().isEmpty()) {
            jsxContent.setmAp(visitMapStatement(ctx.mapStatement()));
        }
        if(ctx.text()!=null&&!ctx.text().isEmpty()) {
            for(int i=0;i<visitText(ctx.text()).size();i++) {
                jsxContent.getIdentifierString().add(visitText(ctx.text()).get(i).getText());

                lineString=getLineNumber( visitText(ctx.text()).get(i));
                columnString=getColumnNumber( visitText(ctx.text()).get(i));
                row.getValueList().add( new Pair<>(visitText(ctx.text()).get(i).getText(), new Pair<>(new Pair<>(lineString, columnString),new Pair<>(-1,-1))));
            }
            //jsxContent.setmAp(visitMapStatement(ctx.mapStatement()));

        }

        row.setType("String content of jsx ");
//            row.setValueList(visitText(ctx.text()));
        if(lineString!=0) {
            this.symboleTable.getRows().add(row);
        }

        row1.setType("expression");//props call
        if(linePropsCall!=0) {
            this.symboleTable.getRows().add(row1);
        }

//        if (jsxContent.getpropsCall()!= null) {
//            if (!jsxContent.getpropsCall().isEmpty()) {
////                row1.setValueList(jsxContent.getpropsCall());
//            }
//
//        } else {
//
//        }
        return jsxContent;
    }

    @Override
    public Jsx visitH1(ReactGrammarParser.H1Context ctx) {
        Jsx jsx = new Jsx();

        int lineName=0 ;
        int columnName=0 ;

        jsx.setName(ctx.getChild(1).getText());

        lineName=getLineNumber((TerminalNode) ctx.getChild(1));
        columnName=getColumnNumber((TerminalNode) ctx.getChild(1));



        Row row =new Row();
        row.setType("name of jsx");
        row.getValueList().add( new Pair<>(jsx.getName(),new Pair<>( new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
        row.getValueList().add( new Pair<>(ctx.H1_TAG().get(1).getText(), new Pair<>(new Pair<>(getLineNumber( ctx.H1_TAG().get(1)), getColumnNumber( ctx.H1_TAG().get(1))),new Pair<>(-1,-1))));
//        row.getValueList().add(jsxStatement.getJsx().getName());
        this.symboleTable.getRows().add(row);


        for(int i=0;i<ctx.jsxContent().size();i++) {
            jsx.getJsxContent().add(visitJsxContent(ctx.jsxContent().get(i)));
        }


        return jsx;
    }

    @Override
    public Jsx visitH2(ReactGrammarParser.H2Context ctx) {
        Jsx jsx = new Jsx();

        int lineName=0 ;
        int columnName=0 ;

        jsx.setName(ctx.getChild(1).getText());

        lineName=getLineNumber((TerminalNode) ctx.getChild(1));
        columnName=getColumnNumber((TerminalNode) ctx.getChild(1));



        Row row =new Row();
        row.setType("name of jsx");
        row.getValueList().add( new Pair<>(jsx.getName(),new Pair<>( new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
        row.getValueList().add( new Pair<>(ctx.H2_TAG().get(1).getText(), new Pair<>(new Pair<>(getLineNumber( ctx.H2_TAG().get(1)), getColumnNumber( ctx.H2_TAG().get(1))),new Pair<>(-1,-1))));
//        row.getValueList().add(jsxStatement.getJsx().getName());
        this.symboleTable.getRows().add(row);

        for(int i=0;i<ctx.jsxContent().size();i++) {
            jsx.getJsxContent().add(visitJsxContent(ctx.jsxContent().get(i)));
        }

        return jsx;
    }

    @Override
    public Jsx visitH3(ReactGrammarParser.H3Context ctx) {
        Jsx jsx = new Jsx();

        int lineName=0 ;
        int columnName=0 ;

        jsx.setName(ctx.getChild(1).getText());

        lineName=getLineNumber((TerminalNode) ctx.getChild(1));
        columnName=getColumnNumber((TerminalNode) ctx.getChild(1));



        Row row =new Row();
        row.setType("name of jsx");
        row.getValueList().add( new Pair<>(jsx.getName(),new Pair<>( new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
        row.getValueList().add( new Pair<>(ctx.H3_TAG().get(1).getText(), new Pair<>(new Pair<>(getLineNumber( ctx.H3_TAG().get(1)), getColumnNumber( ctx.H3_TAG().get(1))),new Pair<>(-1,-1))));
//        row.getValueList().add(jsxStatement.getJsx().getName());
        this.symboleTable.getRows().add(row);

        for(int i=0;i<ctx.jsxContent().size();i++) {
            jsx.getJsxContent().add(visitJsxContent(ctx.jsxContent().get(i)));
        }

        return jsx;
    }




    @Override
    public Jsx visitImg(ReactGrammarParser.ImgContext ctx) {//no content
        Jsx jsx = new Jsx();

        int lineName=0 ;
        int columnName=0 ;

        int lineSrcKey=0 ;
        int columnSrcKey=0 ;

        int lineSrcValue=0 ;
        int columnSrcValue=0 ;

        jsx.setName(ctx.getChild(1).getText());

        lineName=getLineNumber((TerminalNode) ctx.getChild(1));
        columnName=getColumnNumber((TerminalNode) ctx.getChild(1));

        KeyValue keyValue=new KeyValue();
        keyValue.setKey(ctx.srcAttr().getChild(0).getText());/////////////////////////////
        keyValue.setValueString(ctx.srcAttr().getChild(2).getText());
        jsx.setaTribute(keyValue);

        lineSrcKey=getLineNumber((TerminalNode) ctx.srcAttr().getChild(0));
        columnSrcKey=getColumnNumber((TerminalNode) ctx.srcAttr().getChild(0));
        lineSrcValue=getLineNumber((TerminalNode) ctx.srcAttr().getChild(2));
        columnSrcValue=getColumnNumber((TerminalNode) ctx.srcAttr().getChild(2));

        Row row =new Row();
        row.setType("name of jsx");
        row.getValueList().add( new Pair<>(jsx.getName(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
//        row.getValueList().add(jsxStatement.getJsx().getName());
        this.symboleTable.getRows().add(row);

        Row row1 =new Row();
        row1.setType("attribute in jsx");
        row1.getValueList().add( new Pair<>(ctx.srcAttr().getChild(0).getText(), new Pair<>(new Pair<>(lineSrcKey, columnSrcKey),new Pair<>(-1,-1))));
        row1.getValueList().add( new Pair<>(ctx.srcAttr().getChild(2).getText(), new Pair<>(new Pair<>(lineSrcValue, columnSrcValue),new Pair<>(-1,-1))));

//        row.getValueList().add(jsxStatement.getJsx().getName());
        this.symboleTable.getRows().add(row1);

        return jsx;
    }

    @Override
    public Jsx visitP(ReactGrammarParser.PContext ctx) {
        Jsx jsx = new Jsx();

        int lineName=0 ;
        int columnName=0 ;

        jsx.setName(ctx.getChild(1).getText());

        lineName=getLineNumber((TerminalNode) ctx.getChild(1));
        columnName=getColumnNumber((TerminalNode) ctx.getChild(1));



        Row row =new Row();
        row.setType("name of jsx");
        row.getValueList().add( new Pair<>(jsx.getName(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
        if(ctx.PARAGRAPH_TAG().size()==2) {
            row.getValueList().add(new Pair<>(ctx.PARAGRAPH_TAG().get(1).getText(), new Pair<>(new Pair<>(getLineNumber(ctx.PARAGRAPH_TAG().get(1)), getColumnNumber(ctx.PARAGRAPH_TAG().get(1))), new Pair<>(-1, -1))));
        }
//        row.getValueList().add(jsxStatement.getJsx().getName());
        this.symboleTable.getRows().add(row);


        for(int i=0;i<ctx.jsxContent().size();i++) {
            jsx.getJsxContent().add(visitJsxContent(ctx.jsxContent().get(i)));
        }


        return jsx;
    }

    @Override
    public Jsx visitButton(ReactGrammarParser.ButtonContext ctx) {
        Jsx jsx = new Jsx();

        int lineName=0 ;
        int columnName=0 ;

        int lineKey=0 ;
        int columnKey=0 ;

        Row row =new Row();
        Row row1 =new Row();


        jsx.setName(ctx.getChild(1).getText());

        lineName=getLineNumber((TerminalNode) ctx.getChild(1));
        columnName=getColumnNumber((TerminalNode) ctx.getChild(1));
        row.getValueList().add( new Pair<>(jsx.getName(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
        row.getValueList().add( new Pair<>(ctx.BUTTON_TAG().get(1).getText(), new Pair<>(new Pair<>(getLineNumber( ctx.BUTTON_TAG().get(1)), getColumnNumber( ctx.BUTTON_TAG().get(1))),new Pair<>(-1,-1))));



        if(!ctx.buttonAttr().isEmpty()&&ctx.buttonAttr()!=null) {
            KeyValue keyValue = new KeyValue();
            keyValue.setKey(ctx.buttonAttr().getChild(0).getText());/////////////////////////////
            lineKey=getLineNumber((TerminalNode) ctx.buttonAttr().getChild(0));
            columnKey=getColumnNumber((TerminalNode) ctx.buttonAttr().getChild(0));
            row1.getValueList().add( new Pair<>(ctx.buttonAttr().getChild(0).getText(), new Pair<>(new Pair<>(lineKey, columnKey),new Pair<>(-1,-1))));
            if(ctx.buttonAttr().functionCall()!=null&&!ctx.buttonAttr().functionCall().isEmpty()) {
                keyValue.setCallFunction(visitFunctionCall(ctx.buttonAttr().functionCall()));
            }
            jsx.setaTribute(keyValue);
        }


        row.setType("name of jsx");
//        row.getValueList().add(jsxStatement.getJsx().getName());
        this.symboleTable.getRows().add(row);


        row1.setType("attribute in jsx");
//        row.getValueList().add(jsxStatement.getJsx().getName());
        if(lineKey!=0) {
            this.symboleTable.getRows().add(row1);
        }

        for(int i=0;i<ctx.jsxContent().size();i++) {
            jsx.getJsxContent().add(visitJsxContent(ctx.jsxContent().get(i)));
        }

        return jsx;
    }

    @Override
    public Jsx visitA(ReactGrammarParser.AContext ctx) {
        Jsx jsx = new Jsx();

        int lineName=0 ;
        int columnName=0 ;

        int lineKey=0 ;
        int columnKey=0 ;

        int lineValue=0 ;
        int columnValue=0 ;

        Row row =new Row();
        Row row1 =new Row();

        jsx.setName(ctx.getChild(1).getText());

        lineName=getLineNumber((TerminalNode) ctx.getChild(1));
        columnName=getColumnNumber((TerminalNode) ctx.getChild(1));

        row.getValueList().add( new Pair<>(jsx.getName(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
        row.getValueList().add( new Pair<>(ctx.A_LINK_TAG().get(1).getText(), new Pair<>(new Pair<>(getLineNumber( ctx.A_LINK_TAG().get(1)), getColumnNumber( ctx.A_LINK_TAG().get(1))),new Pair<>(-1,-1))));



        if(!ctx.hrefAttr().isEmpty()&&ctx.hrefAttr()!=null) {
            KeyValue keyValue = new KeyValue();
            keyValue.setKey(ctx.hrefAttr().getChild(0).getText());/////////////////////////////

            lineKey=getLineNumber((TerminalNode) ctx.hrefAttr().getChild(0));
            columnKey=getColumnNumber((TerminalNode) ctx.hrefAttr().getChild(0));

            row1.getValueList().add( new Pair<>(ctx.hrefAttr().getChild(0).getText(), new Pair<>(new Pair<>(lineKey, columnKey),new Pair<>(-1,-1))));

            if(ctx.hrefAttr().STRING()!=null) {
                keyValue.setValueString(ctx.hrefAttr().STRING().getText());

                lineValue=getLineNumber(ctx.hrefAttr().STRING());
                columnValue=getColumnNumber(ctx.hrefAttr().STRING());

                row1.getValueList().add( new Pair<>(ctx.hrefAttr().STRING().getText(), new Pair<>(new Pair<>(lineValue, columnValue),new Pair<>(-1,-1))));

            }
            jsx.setaTribute(keyValue);
        }


        row.setType("name of jsx");
//        row.getValueList().add(jsxStatement.getJsx().getName());
        this.symboleTable.getRows().add(row);


        row1.setType("attribute in jsx");


//        row.getValueList().add(jsxStatement.getJsx().getName());
        if(lineKey!=0) {
            this.symboleTable.getRows().add(row1);
        }



        for(int i=0;i<ctx.jsxContent().size();i++) {
            jsx.getJsxContent().add(visitJsxContent(ctx.jsxContent().get(i)));
        }

        return jsx;
    }

    @Override
    public Jsx visitBr(ReactGrammarParser.BrContext ctx) {
        Jsx jsx = new Jsx();

        int lineName=0 ;
        int columnName=0 ;

        jsx.setName(ctx.getChild(1).getText());

        lineName=getLineNumber((TerminalNode) ctx.getChild(1));
        columnName=getColumnNumber((TerminalNode) ctx.getChild(1));



        Row row =new Row();
        row.setType("name of jsx");
        row.getValueList().add( new Pair<>(jsx.getName(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
//        row.getValueList().add(jsxStatement.getJsx().getName());
        this.symboleTable.getRows().add(row);

        return jsx;
    }

    @Override
    public Jsx visitHr(ReactGrammarParser.HrContext ctx) {
        Jsx jsx = new Jsx();

        int lineName=0 ;
        int columnName=0 ;

        jsx.setName(ctx.getChild(1).getText());

        lineName=getLineNumber((TerminalNode) ctx.getChild(1));
        columnName=getColumnNumber((TerminalNode) ctx.getChild(1));



        Row row =new Row();
        row.setType("name of jsx");
        row.getValueList().add( new Pair<>(jsx.getName(),new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
//        row.getValueList().add(jsxStatement.getJsx().getName());
        this.symboleTable.getRows().add(row);

        return jsx;
    }

    @Override
    public Jsx visitComponent(ReactGrammarParser.ComponentContext ctx) {//no content
        Jsx jsx = new Jsx();

        int lineName=0 ;
        int columnName=0 ;

        int lineKey=0 ;
        int columnKey=0 ;
        int lineValue=0 ;
        int columnValue=0 ;

        Row row =new Row();
        Row row1 =new Row();

        jsx.setName(ctx.getChild(1).getText());

        lineName=getLineNumber((TerminalNode) ctx.getChild(1));
        columnName=getColumnNumber((TerminalNode) ctx.getChild(1));

        row.getValueList().add( new Pair<>(jsx.getName(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));


        if(!ctx.props().isEmpty() && ctx.props()!=null) {
            KeyValue keyValue = new KeyValue();
            keyValue.setKey(ctx.props().get(0).getChild(0).getText());/////////////////////////////
            keyValue.setValueString(ctx.props().get(0).getChild(2).getText());
            jsx.setProps(keyValue);

            lineKey = getLineNumber((TerminalNode) ctx.props().get(0).getChild(0));
            columnKey = getColumnNumber((TerminalNode) ctx.props().get(0).getChild(0));
            lineValue = getLineNumber((TerminalNode) ctx.props().get(0).getChild(2));
            columnValue = getColumnNumber((TerminalNode) ctx.props().get(0).getChild(2));

            row1.getValueList().add( new Pair<>( ctx.props().get(0).getChild(0).getText(), new Pair<>(new Pair<>(lineKey, columnKey),new Pair<>(-1,-1))));
            row1.getValueList().add( new Pair<>(ctx.props().get(0).getChild(2).getText(), new Pair<>(new Pair<>(lineValue, columnValue),new Pair<>(-1,-1))));
        }


        row.setType("name of jsx");

//        row.getValueList().add(jsxStatement.getJsx().getName());
        this.symboleTable.getRows().add(row);


        row1.setType("props in component");

//        row.getValueList().add(jsxStatement.getJsx().getName());
        if(lineKey!=0) {
            this.symboleTable.getRows().add(row1);
        }

        return jsx;

    }

    @Override
    public MAp visitMapStatement(ReactGrammarParser.MapStatementContext ctx) {
        MAp mAp=new MAp();

        int lineName=0 ;
        int columnName=0 ;
        int lineItem=0 ;
        int columnItem=0 ;

        int startScope=0;
        int endScope=0;

        Row row =new Row();

        mAp.setnameOfArray(ctx.IDENTIFIER().getText());
        mAp.setItem(ctx.parameter_list().data_type(0).getText());

        lineName=getLineNumber( ctx.IDENTIFIER());
        columnName=getColumnNumber(ctx.IDENTIFIER());

        lineItem=ctx.parameter_list().data_type().get(0).IDENTIFIER().getSymbol().getLine();
        columnItem=ctx.parameter_list().data_type().get(0).IDENTIFIER().getSymbol().getCharPositionInLine()+1;

        startScope=ctx.LBRACE().get(1).getSymbol().getLine();
        endScope=ctx.RBRACE().get(0).getSymbol().getLine();

        row.getValueList().add( new Pair<>(mAp.getnameOfArray(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
        row.getValueList().add( new Pair<>(mAp.getItem(), new Pair<>(new Pair<>(lineItem, columnItem),new Pair<>(startScope,endScope))));


        ValueOfReturn valueOfReturn = new ValueOfReturn();
        valueOfReturn.setJsxStatement(visitJsxStatement(ctx.jsxStatement()));
        mAp.setValueOfReturn(valueOfReturn);





        row.setType("map name ");
//        row.getValueList().add(mAp.getnameOfArray());
        this.symboleTable.getRows().add(row);

        return mAp;

    }

    @Override
    public UseEffect visitUseEffect(ReactGrammarParser.UseEffectContext ctx) {
        UseEffect useEffect = new UseEffect();

        int lineParameter=0 ;
        int columnParameter=0 ;

        int lineUseEffect=0 ;
        int columnUseEffect=0 ;

        Row row= new Row();
        Row row1= new Row();
        row1.getValueList().add( new Pair<>("useEffect", new Pair<>(new Pair<>(ctx.USE_HOOK().getSymbol().getLine(), ctx.USE_HOOK().getSymbol().getCharPositionInLine()+1),new Pair<>(ctx.LBRACE().getSymbol().getLine(),ctx.RBRACE().getSymbol().getLine()))));
        for(int i=0;i<ctx.statement().size();i++) {
            useEffect.getCallFunction().add(visitFunctionCall(ctx.statement().get(i).functionCall()));
        }
        if(ctx.parameter_list().getChildCount()!=0) {
            for (int i = 0; i < ctx.parameter_list().children.size(); i++) {

                useEffect.getParameters().add(ctx.parameter_list().data_type(i).IDENTIFIER().toString());//i*2

                lineParameter=getLineNumber( ctx.parameter_list().data_type(i).IDENTIFIER());
                columnParameter=getColumnNumber(ctx.parameter_list().data_type(i).IDENTIFIER());

                row.getValueList().add( new Pair<>(ctx.parameter_list().data_type(i).IDENTIFIER().getText(), new Pair<>(new Pair<>(lineParameter, columnParameter),new Pair<>(-1,-1))));

            }
        }
        row1.setType("use effect");
        row.setType("parameter of use effect");
//        row.setValueList(useEffect.getParameters());
        this.symboleTable.getRows().add(row1);
        this.symboleTable.getRows().add(row);
        return useEffect;
    }

    @Override
    public List<TerminalNode> visitText(ReactGrammarParser.TextContext ctx) {
        List<TerminalNode>strings=new ArrayList<>();
        for (int i=0;i<ctx.IDENTIFIER().size();i++){
            strings.add(ctx.IDENTIFIER().get(i));
        }
        return strings;
    }

    @Override
    public UseRef visitUseRef(ReactGrammarParser.UseRefContext ctx) {
        UseRef useRef=new UseRef();

        int lineName=0 ;
        int columnName=0 ;

        int lineValue=0 ;
        int columnValue=0 ;



        useRef.setNameOfUseRef(ctx.IDENTIFIER().getText());

        lineName=getLineNumber( ctx.IDENTIFIER());
        columnName=getColumnNumber(ctx.IDENTIFIER());

        if(!ctx.data_type().isEmpty()&&ctx.data_type()!=null) {
            useRef.setValueOfUseRef(ctx.data_type().get(0).getText());

            lineValue=getLineNumber( ctx.data_type().getFirst().NULL());
            columnValue=getColumnNumber(ctx.data_type().getFirst().NULL());
        }





        Row row =new Row();
        row.setType("name of use ref");

//        row.getValueList().add(useRef.getNameOfUseRef());
        row.getValueList().add( new Pair<>(useRef.getNameOfUseRef(), new Pair<>(new Pair<>(lineName, columnName),new Pair<>(-1,-1))));
        this.symboleTable.getRows().add(row);

        Row row1 =new Row();
        row1.setType("value of use ref");
        row1.getValueList().add( new Pair<>(useRef.getValueOfUseRef(), new Pair<>(new Pair<>(lineValue, columnValue),new Pair<>(-1,-1))));
//        row1.getValueList().add(useRef.getValueOfUseRef());
        if(lineValue!=0) {
            this.symboleTable.getRows().add(row1);
        }
        return useRef;
    }
    int getLineNumber(TerminalNode x){
        return x.getSymbol().getLine();
    }

    int getColumnNumber(TerminalNode x){
        return x.getSymbol().getCharPositionInLine()+1;
    }
}

