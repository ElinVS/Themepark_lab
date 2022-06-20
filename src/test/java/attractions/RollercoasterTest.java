package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        visitor1 = new Visitor(25,2.10,25.50);
        visitor2 = new Visitor(10,1.65,16.80);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasADefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void priceDependentOnHeightOVERLimit(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.01);

    }

    @Test
    public void priceDependentOnHeightUNDERLimit(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.01);
    }



    @Test
    public void checkIfVisitorIsAllowedOnRollerCoasterTRUE(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void checkIfVisitorIsAllowedOnRollerCoasterFALSE(){
        assertEquals(false,rollerCoaster.isAllowedTo(visitor2));
    }
}