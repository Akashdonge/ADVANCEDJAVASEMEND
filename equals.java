import java.util.Objects;

class Pet {
    String name;
    int age;
    String breed;

    Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Overriding equals() method to compare objects by their attributes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                Objects.equals(name, pet.name) &&
                Objects.equals(breed, pet.breed);
    }
}

public class GFG {
    public static void main(String args[]) {
        Pet dog1 = new Pet("Snow", 3, "German Shepherd");
        Pet cat = new Pet("Jack", 2, "Tabby");
        Pet dog2 = new Pet("Snow", 3, "German Shepherd");

        System.out.println(dog1.equals(dog2)); // Output will be true now
    }
}
