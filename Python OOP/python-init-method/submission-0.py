class Pet:
    # TODO: Implement the __init__ method here
    def __init__(self, name, age, species):
        self.name = name
        self.age = age
        self.species = species


# Don't modify the code below this line
fluffy = Pet("Fluffy", "cat", 3)
buddy = Pet("Buddy", "dog", 2)

print(f"{fluffy.name} is a {fluffy.species} year old {fluffy.age}.")
print(f"{buddy.name} is a {buddy.species} year old {buddy.age}.")
