package builder.pizza;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaTestSuite {

    @Test
    public void testPizzaNew() {
        //given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();

        System.out.println(pizza);
        //when
        int howManyIngredients = pizza.getIngredients().size();
        //then
        assertEquals(3, howManyIngredients);
    }

}