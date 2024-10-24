package ymfc.recipe;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecipeTest {

    @Test
    public void getName_validName_returnCorrectName() {
        Recipe recipe = new Recipe("Pasta", new ArrayList<>(), new ArrayList<>());
        assertEquals("Pasta", recipe.getName());
    }

    @Test
    void setName_validName_nameUpdatedCorrectly() {
        Recipe recipe = new Recipe("Pasta", new ArrayList<>(), new ArrayList<>());
        recipe.setName("Pizza");
        assertEquals("Pizza", recipe.getName());
    }

    @Test
    void getIngredients_validIngredients_returnCorrectIngredients() {
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("Tomato");
        ingredients.add("Cheese");
        Recipe recipe = new Recipe("Pasta", ingredients, new ArrayList<>());
        assertEquals(ingredients, recipe.getIngredients());
    }

    @Test
    void setIngredients_validIngredients_ingredientsUpdatedCorrectly() {
        Recipe recipe = new Recipe("Pasta", new ArrayList<>(), new ArrayList<>());
        ArrayList<String> newIngredients = new ArrayList<>();
        newIngredients.add("Flour");
        newIngredients.add("Water");
        recipe.setIngredients(newIngredients);
        assertEquals(newIngredients, recipe.getIngredients());
    }

    @Test
    void getSteps_validSteps_returnCorrectSteps() {
        ArrayList<String> steps = new ArrayList<>();
        steps.add("Boil water");
        steps.add("Add pasta");
        Recipe recipe = new Recipe("Pasta", new ArrayList<>(), steps);
        assertEquals(steps, recipe.getSteps());
    }

    @Test
    void setSteps_validSteps_stepsUpdatedCorrectly() {
        Recipe recipe = new Recipe("Pasta", new ArrayList<>(), new ArrayList<>());
        ArrayList<String> newSteps = new ArrayList<>();
        newSteps.add("Mix flour and water");
        newSteps.add("Knead dough");
        recipe.setSteps(newSteps);
        assertEquals(newSteps, recipe.getSteps());
    }

    @Test
    void toString_validIngredientsAndSteps_correctFormat() {

        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("Flour");
        ingredients.add("Eggs");
        ingredients.add("Milk");
        ingredients.add("Sugar");
        ingredients.add("Baking powder");

        ArrayList<String> steps = new ArrayList<>();
        steps.add("Mix ingredients");
        steps.add("Heat the pan");
        steps.add("Pour batter");
        steps.add("Flip the pancake");
        steps.add("Serve hot");

        Recipe recipe = new Recipe("Pancakes", ingredients, steps);

        // Expected string representation
        String expected = "Recipe: Pancakes" + System.lineSeparator() +
                "  Ingredients: " + System.lineSeparator() +
                "    - Flour" + System.lineSeparator() +
                "    - Eggs" + System.lineSeparator() +
                "    - Milk" + System.lineSeparator() +
                "    - Sugar" + System.lineSeparator() +
                "    - Baking powder" + System.lineSeparator() +
                "  Steps: " + System.lineSeparator() +
                "    1. Mix ingredients" + System.lineSeparator() +
                "    2. Heat the pan" + System.lineSeparator() +
                "    3. Pour batter" + System.lineSeparator() +
                "    4. Flip the pancake" + System.lineSeparator() +
                "    5. Serve hot";

        // Assert the output of toString method matches expected
        assertEquals(expected, recipe.toString());
    }
}
