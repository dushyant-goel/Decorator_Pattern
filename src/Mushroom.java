public class Mushroom extends Topping{


    public Mushroom(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
       return this.pizza.cost() + 45;
    }
    
}
