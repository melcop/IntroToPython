class Student:
    """En python klasse til at gemme studerendes information"""

    def __init__(self, name, address, age):
        self.name = name
        self.address = address
        self.age = age

student1 = Student("Peter Parker", "Landevej 21, 1980, Vesterbro", "32") 

print(student1.name)
print(student1.age)
print(student1.address)
   