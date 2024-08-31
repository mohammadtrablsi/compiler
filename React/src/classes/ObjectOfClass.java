package classes;

public class ObjectOfClass {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String text="";
        if(name!=null){
            text+=name;
        }
        return "ObjectOfClass{" +
                text+
                '}';
    }
}
