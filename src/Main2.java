public class Main2 {
    public static void main(String[] args) {
        Edible food = new Pig();
        System.out.println(food.youMayEat());
        Edible food2 = new Tomato("Tomato");
        System.out.println(food2.youMayEat());


    }
}
