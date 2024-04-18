package visitorPattern2;

public class ElectronicFurnitureBusiness {

    public static void main(String[] args){
        Furniture chair = new Furniture("Chair", 400.0, 30);
        Furniture nightStand = new Furniture("Night Stand", 50, 20);
        Furniture sofa = new Furniture("Sofa", 5000.0, 50);
        Furniture bed = new Furniture("Bed", 7000.0, 300);
        Furniture shoeRack = new Furniture("Shoe Rack", 50, 20); // This is a not listed furniture

        LightFurnitureCalculator lightFurnitureCalculator = new LightFurniture();
        HeavyFurnitureCalculator heavyFurnitureCalculator = new HeavyFurniture();

        // Display
        System.out.println(chair.getFurniture() + " costs: ₱" + chair.accept(lightFurnitureCalculator, chair.getPrice()) + " with a fixed shipping rate only.");
        System.out.println(nightStand.getFurniture() + " costs: ₱" + nightStand.accept(lightFurnitureCalculator, nightStand.getPrice()) + " with a fixed shipping rate only.");
        System.out.println(sofa.getFurniture() + " costs: ₱" + sofa.accept(heavyFurnitureCalculator, sofa.getPrice(), sofa.getDistanceKm()) + " with additional distance fee.");
        System.out.println(bed.getFurniture() + " costs: ₱" + bed.accept(heavyFurnitureCalculator, bed.getPrice(), bed.getDistanceKm()) + " with additional distance fee.");
        System.out.println(shoeRack.getFurniture() + " costs: ₱" + shoeRack.accept(lightFurnitureCalculator, shoeRack.getPrice()) + " with a fixed shipping rate only.");
    }
}