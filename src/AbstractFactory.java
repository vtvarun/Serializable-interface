public class AbstractFactory {

    public static Factory createFactory(String brand){

        if(brand.equalsIgnoreCase("BMW")){
            return new BMWFactory();
        }

        return new MarutiFactory();
    }
}
