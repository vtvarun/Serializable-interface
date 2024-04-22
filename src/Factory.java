public interface Factory {

    public String factoryName();

    public Vehicle createVehicle(int passengers);
}
