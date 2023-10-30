from Truck import Truck
from Car import Car


if __name__ == "__main__":
    truck1 = Truck('Truck1', 120, 2000)
    truck1.start()
    truck1.load_cargo(500)
    print(truck1.get_load())
    truck1.load_cargo(300)
    print(truck1.get_load())
    print(truck1.honk())


    car1 = Car("Car1", 180)
    car1.set_speed(80)
    car1.set_speed(90)
    print(car1.get_current_speed())

    truck1.unload_cargo(200)
    print(truck1.get_load())