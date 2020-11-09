class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("PWD450", new Account("Pepito Perez", "PEP531"));
        car.setPassenger(4);
        car.printDataCar();
    }
}