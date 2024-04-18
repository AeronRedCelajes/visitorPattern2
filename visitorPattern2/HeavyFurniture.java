package visitorPattern2;

import java.util.*;

public class HeavyFurniture implements HeavyFurnitureCalculator {

    private static final Map<String, Double> heavyFurnitureMap = new HashMap<>();

    // These are the shipping rates for each furniture
    static {
        heavyFurnitureMap.put("Table", 0.3);
        heavyFurnitureMap.put("Sofa", 0.4);
        heavyFurnitureMap.put("Bed", 0.6);
    }

    @Override
    public double computeHeavyWeight(String furniture, double money, double distanceKm) {
        double rate = heavyFurnitureMap.getOrDefault(furniture, 0.0);
        double distanceFee = distanceKm * 0.8;

        /*  Heavy furniture calculation only
            This time distance fee is added as well not just shipping rate
            If furniture is not identified meaning there is no shipping rate
            If furniture is identified
            Then if the furniture is unidentified then no shipping rate cost
        */

        return (rate * money) + distanceFee + money;
    }
}