public class Tomato implements Edible{
    protected String vegetableName;

    public Tomato(String vegetableName){
        this.vegetableName = vegetableName;
    }

    @Override
    public String youMayEat() {
        return "You may eat" + this.vegetableName;
    }
}
