import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {


    private ArrayList<Attraction> attractionArrayList;
    private ArrayList<Stall> stallArrayList;

    public ThemePark(ArrayList<Attraction> attractionArrayList, ArrayList<Stall> stallArrayList) {
        this.attractionArrayList = attractionArrayList;
        this.stallArrayList = stallArrayList;
    }

    public int getAttractionArrayList() {
        return attractionArrayList.size();
    }

    public int getStallArrayList() {
        return stallArrayList.size();
    }

}


//   private ArrayList<IReviewed> attractionsAndStalls;
//
//    public ThemePark(ArrayList<IReviewed> attractionsAndStalls) {
//        this.attractionsAndStalls = attractionsAndStalls;
//    }
//
//    public ArrayList<IReviewed> getAttractionsAndStalls() {
//        return attractionsAndStalls;
//    }