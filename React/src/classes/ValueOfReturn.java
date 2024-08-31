package classes;

public class ValueOfReturn {
    JsxStatement jsxStatement;

    public JsxStatement getJsxStatement() {
        return jsxStatement;
    }

    public void setJsxStatement(JsxStatement jsxStatement) {
        this.jsxStatement = jsxStatement;
    }

    @Override
    public String toString() {
        return "\nValueOfReturn{" +
                  jsxStatement +
                '}';
    }
}
