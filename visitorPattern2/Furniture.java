package visitorPattern2;

public class Furniture implements ShippingCalculator{
    private String furniture;
    private double price;
    private double distanceKm;

    public Furniture(String furniture, double money, double distanceKm){
        this.furniture = furniture;
        this.price = money;
        this.distanceKm = distanceKm;
    }

    @Override
    public double accept(LightFurnitureCalculator lightFurnitureCalculator, double money) {
        this.price = money;
        return lightFurnitureCalculator.computeLightWeight(furniture, money);
    }

    @Override
    public double accept(HeavyFurnitureCalculator heavyFurnitureCalculator, double money, double distanceKm) {
        this.price = money;
        return heavyFurnitureCalculator.computeHeavyWeight(furniture, money, distanceKm);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(double distanceKm) {
        this.distanceKm = distanceKm;
    }
}