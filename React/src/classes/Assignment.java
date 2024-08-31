package classes;

public class Assignment {
    String name;
    String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String text="";
        text+="name=" + name + '\n' ;
        text+="value=" + value + '\n' ;
        return "Assignment{\n" +
                text+
                "}\n";
    }
}
