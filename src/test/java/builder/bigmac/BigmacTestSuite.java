package builder.bigmac;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigmacTestSuite {
       @Test
    public void testBigmacBuilder() {
        //given
            Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.SESAME)
                .sauce(Sauce.STANDARD)
                .burgers(2)
                .ingredients(Ingredient.BACON)
                .ingredients(Ingredient.ONION)
                .ingredients(Ingredient.CHEESE)
                .build();
        //when
           System.out.println(bigmac);
           int howManyIngredients = bigmac.getIngredients().size();
        //then
            assertEquals(3, howManyIngredients);
    }
}