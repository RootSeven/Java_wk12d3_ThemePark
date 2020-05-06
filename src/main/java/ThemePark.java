import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Stall> allStalls;
    private ArrayList<Attraction> allAttractions;

    public ThemePark() {
        this.allStalls = new ArrayList<>();
        this.allAttractions = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> allReviewed = new ArrayList<IReviewed>();
        for ( IReviewed reviewed : allStalls ){
            allReviewed.add(reviewed);
        }
        for ( IReviewed reviewed : allAttractions ){
            allReviewed.add(reviewed);
        }
        return this.getAllReviewed();
    }
}
