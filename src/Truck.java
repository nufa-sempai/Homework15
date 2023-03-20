public class Truck extends WheeledTransport implements MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем шину у грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика");
    }
}
