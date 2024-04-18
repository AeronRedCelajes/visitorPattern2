package visitorPattern2;

public interface ShippingCalculator {
    public double accept(LightFurnitureCalculator lightFurnitureCalculator, double money);
    public double accept(HeavyFurnitureCalculator heavyFurnitureCalculator, double money, double distanceKm);
}