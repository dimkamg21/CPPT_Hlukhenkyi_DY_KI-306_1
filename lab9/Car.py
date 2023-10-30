class Car:
    def __init__(self, model, max_speed):
        self.model = model
        self.max_speed = max_speed
        self._current_speed = 0

    def start(self):
        print(f"Start Car {self.model}")

    def stop(self):
        print(f'Stop Car {self.model}')

    def set_speed(self, speed):
        if speed < self.max_speed:
            self._current_speed = speed
        else:
            print(f"Max speed for this model is {self.max_speed} km/h")

    def get_current_speed(self):
        return self._current_speed

    def honk(self):
        print(f"{self.model} is honking")

