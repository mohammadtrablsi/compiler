package classes;

public class UseHooks {
    UseState useState;
    UseEffect useEffect;

    UseRef useRef;

    public UseState getUseState() {
        return useState;
    }

    public void setUseState(UseState useState) {
        this.useState = useState;
    }

    public UseEffect getUseEffect() {
        return useEffect;
    }

    public void setUseEffect(UseEffect useEffect) {
        this.useEffect = useEffect;
    }

    public UseRef getUseRef() {
        return useRef;
    }

    public void setUseRef(UseRef useRef) {
        this.useRef = useRef;
    }

    @Override
    public String toString() {
        String text=" ";
        if(useState!=null){
            text+="useState=" + useState ;
        }
        if(useEffect!=null){
            text+="useEffect=" + useEffect ;
        }
        if(useRef!=null){
            text+="useRef=" + useRef ;
        }
        return "\nUseHooks{" +
                text+
                '}';
    }
}
