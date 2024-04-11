import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_app {
    @Test
    public void testComputePlateWithMediumDrinkAndSpecialDessert() {
        App app = new App();
        int result = app.Compute("assiette", "nom", "boisson", "moyen", "dessert", "special", "no");
        assertEquals("doit afficher 22", 22, result);//j'crois c'est faux
    }
    @Test
    public void testInvalidInput() {
        App app = new App();
        int result = app.Compute(null, null, null, null, null, null, null);
        assertEquals("dois afficher -1", -1, result);
    }
}
