public class Bicycle extends WheeledTransport {

    public Bicycle(String modelName, int whealCount) {
        super(modelName, whealCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем шину у велосипеда");
    }
}

