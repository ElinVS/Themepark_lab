import attractions.*;

import behaviours.IReviewed;
import org.junit.Before;

import org.junit.Test;
import stalls.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
//    ArrayList<IReviewed> attractionsAndStalls;

    ArrayList<Attraction> attractionsArrayList;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;

    ArrayList<Stall> stallArrayList;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        attractionsArrayList = new ArrayList<Attraction>();
//        attractionsAndStalls = new ArrayList<>();
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);

        attractionsArrayList.add(dodgems);
        attractionsArrayList.add(park);
        attractionsArrayList.add(playground);
        attractionsArrayList.add(rollerCoaster);

        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);

        stallArrayList = new ArrayList<Stall>();
        stallArrayList.add(candyflossStall);
        stallArrayList.add(iceCreamStall);
        stallArrayList.add(tobaccoStall);
        themePark = new ThemePark(attractionsArrayList, stallArrayList);
//        themePark = new ThemePark(attractionsAndStalls);


   }

    @Test
    public void checkNumberOfAttractionsInPark(){
        assertEquals(4, themePark.getAttractionArrayList());
    }

    @Test
    public void checkNumberOfStallsInPark(){
        assertEquals(3, themePark.getStallArrayList());
    }

}




//   @Test
//    public void checkTotalNumberOfStallsAndAttractions(){
//        assertEquals(7, themePark.getAttractionsAndStalls().size());
//   }