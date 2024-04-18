package visitorPattern2;

public interface ShippingCalculator {
    public double accept(LightFurnitureCalculator lightWeightCalculator, double money);
    public double accept(HeavyFurnitureCalculator heavyWeightCalculator, double money, double distanceKm);
}