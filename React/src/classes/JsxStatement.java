package classes;

public class JsxStatement {
    Jsx jsx = new Jsx();

    public Jsx getJsx() {
        return jsx;
    }

    public void setJsx(Jsx jsx) {
        this.jsx = jsx;
    }

    @Override
    public String toString() {
        return "\nJsx{" +
                 jsx +
                "}";
    }
}
