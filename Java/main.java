class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("PWD450", new Account("Pepito Perez", "PEP531"));
        car.setPassenger(4);
        car.printDataCar();

        System.out.println();
        UberX uberX = new UberX("JEG353", new Account("Martin Salgado", "4135457"), "Renault", "Logan")        ;
        uberX.setPassenger(4);
        uberX.printDataCar();

        System.out.println();
        UberVan uberVan = new UberVan("TER854", new Account("Jose Carmona", "54334182"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}