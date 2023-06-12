import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
       VegDelight pizza1 = new VegDelight();
       ExtraCheese cheesyPizza1 = new ExtraCheese(pizza1);

       System.out.println(cheesyPizza1.cost());

    }
}
