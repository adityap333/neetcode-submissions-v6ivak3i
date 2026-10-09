class Hero:
    def __init__(self, name: str, base_power: int, attributes: dict):
        self.name = name
        self.base_power = base_power
        self.attributes = attributes

    # Static method does not receive self or cls automatically.
    # It only needs the two values passed by the caller.
    @staticmethod
    def calculate_effective_power(base_power: int, attributes: dict):

        # attributes is a dictionary, for example:
        # {'strength': 7, 'speed': 6, 'intelligence': 8}

        # attributes.values() returns the values: 7, 6, 8
        # sum() adds them: 7 + 6 + 8 = 21
        # len(attributes) counts the dictionary entries: 3
        # Average = 21 / 3 = 7.0
        attribute_bonus = sum(attributes.values()) / len(attributes)

        # Formula: base_power * (1 + attribute_bonus)
        # For base_power = 8:
        # 8 * (1 + 7.0) = 8 * 8 = 64.0
        effective_power = base_power * (1 + attribute_bonus)

        # Round to one decimal place and return the result.
        return round(effective_power, 1)


# DON'T CHANGE THE FOLLOWING CODE

base_power1 = 8
attributes1 = {'strength': 7, 'speed': 6, 'intelligence': 8}

# Calling the static method directly using the class name.
# No Hero object needs to be created.
# base_power = 8
# attributes = attributes1
# The method returns 64.0, which is stored in power1.
power1 = Hero.calculate_effective_power(base_power1, attributes1)

print(f"Base Power: {base_power1}")
print(f"Attributes: {attributes1}")
print(f"Effective Power: {power1}\n")


base_power2 = 6
attributes2 = {'strength': 4, 'speed': 5, 'intelligence': 6}

# Average = (4 + 5 + 6) / 3 = 5.0
# Effective power = 6 * (1 + 5.0) = 36.0
power2 = Hero.calculate_effective_power(base_power2, attributes2)

print(f"Base Power: {base_power2}")
print(f"Attributes: {attributes2}")
print(f"Effective Power: {power2}")