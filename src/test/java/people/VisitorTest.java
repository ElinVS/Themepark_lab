package people;

import attractions.Attraction;
import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Dodgems dodgems;
    RollerCoaster rollerCoaster1;
    RollerCoaster rollerCoaster2;
    ArrayList<Attraction> visitedAttractions;


    @Before
    public void before(){
        visitedAttractions = new ArrayList<>();
        dodgems = new Dodgems("Bumper Cars", 5);
        rollerCoaster1 = new RollerCoaster("Blue Ridge", 10);
        rollerCoaster2 = new RollerCoaster("The Bullet", 8);
        visitor = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void visitedAttractionListStartsEmpty(){
        assertEquals(0, visitor.getVisitedAttractionsList());
    }

    @Test
    public void addAttractionToList(){
        visitor.addVisitedAttraction(rollerCoaster1);
        visitor.addVisitedAttraction(rollerCoaster2);
        visitor.addVisitedAttraction(dodgems);
        assertEquals(3, visitor.getVisitedAttractionsList());

    }
}
