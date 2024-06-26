public class Car implements  Comparable<Car>{
    String model;
    int productionYear;

    public Car(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public int compareTo (Car car){
        return Integer.compare(this.productionYear, car.productionYear);
    }

    public String toString(){
        return model + " (" + productionYear + ")";
    }

}
