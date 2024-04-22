public class MarutiFactory implements Factory{
    @Override
    public String factoryName() {
        return "This is a Maruti Factory";
    }

    @Override
    public Vehicle createVehicle(int passengers){

        if(passengers == 2) return new Bike();

        return new Car();
    }
}


