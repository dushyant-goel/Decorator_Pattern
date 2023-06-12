public class ExtraCheese extends Topping{


    public ExtraCheese(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
       return this.pizza.cost() + 70;
    }
    
}
