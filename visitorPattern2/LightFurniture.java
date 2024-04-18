package visitorPattern2;

import java.util.*;

public class LightFurniture implements LightFurnitureCalculator {

    private static final Map<String, Double> lightFurnitureMap = new HashMap<>();

    // These are the shipping rates for each furniture
    static {
        lightFurnitureMap.put("Chair", 0.5);
        lightFurnitureMap.put("Night Stand", 0.3);
        lightFurnitureMap.put("Shoe Rack", 0.2);
    }

    @Override
    public double computeLightWeight(String furniture, double money) {
        double rate = lightFurnitureMap.getOrDefault(furniture, 0.0);

        /*  Light furniture calculation only
            Shipping rate is only added
            If furniture is not identified meaning there is no shipping rate
            If furniture is identified
            Then if the furniture is unidentified then no shipping rate cost
        */
            return (rate * money) + money;
    }
}