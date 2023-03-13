public class ServiceStation {

    public void check(Car car) {
        checkWheels(car);
        car.checkEngine();
    }
    public void check (Bicycle bicycle){
        checkWheels(bicycle);
    }

    public void check (Truck truck){
        checkWheels(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    private void checkWheels(WheeledTransport wheeledTransport) {
        System.out.println("\nОбслуживаем " + wheeledTransport.getModelName());
        for (int i = 0; i < wheeledTransport.getWheelsCount(); i++) {
            wheeledTransport.updateTyre();
        }
    }
}
