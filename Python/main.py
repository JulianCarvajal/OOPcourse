from car import Car


if __name__ == "__main__":
    print('Hola mundo')
    car = Car()
    car.license = "JEL681"
    car.driver = "Julio Cesar"
    print(vars(car))