from Car import Car


class Truck(Car):
    def __init__(self, model, max_speed, load_capacity):
        super().__init__(model, max_speed)
        self.load_capacity = load_capacity
        self._load = 0

    def load_cargo(self, weight):
        if self._load + weight < self.load_capacity:
            self._load += weight
        else:
            self._load = self.load_capacity

    def unload_cargo(self, weight):
        if self._load - weight > 0:
            self._load -= weight
        else:
            self._load = 0

    def get_load(self):
        return self._load

    def get_load_capacity(self):
        return self.load_capacity