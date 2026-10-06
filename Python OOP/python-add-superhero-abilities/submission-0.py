class SuperHero:
    """
    A class to represent a superhero.
    """

    def __init__(self, name: str, power: str, health: int):
        self.name = name
        self.power = power
        self.health = health

    def attack(self):
        print(f"{self.name} attacks with {self.power}!")

    def heal(self):
        self.health += 10
        print(f"{self.name} heals 10 points. New health: {self.health}.")


# Create superhero
catwoman = SuperHero("Catwoman", "Agility", 120)

# Use abilities
catwoman.attack()
catwoman.heal()