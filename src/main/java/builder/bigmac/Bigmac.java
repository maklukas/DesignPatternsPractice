package builder.bigmac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bigmac {
    private final Bun bun;
    private final int burgers;
    private final Sauce sauce;
    private final List<String> ingredients;

    private Bigmac(Bun bun, int burgers, Sauce sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigmacBuilder {
        private Bun bun;
        private int burgers;
        private Sauce sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {
            Set<String> allIngredients = new HashSet<>();
            allIngredients.add(Ingredient.CHEESE);
            allIngredients.add(Ingredient.BACON);
            allIngredients.add(Ingredient.CUCUMBER);
            allIngredients.add(Ingredient.CHILI);
            allIngredients.add(Ingredient.MUSHROOMS);
            allIngredients.add(Ingredient.PRAWNS);
            allIngredients.add(Ingredient.SALAD);
            allIngredients.add(Ingredient.ONION);
            if (!allIngredients.contains(ingredient)) {
                throw new IllegalStateException("We can't make Bigmac with " + ingredient);
            }
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
}
