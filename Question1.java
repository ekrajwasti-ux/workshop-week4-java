package Workshop4;
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        
    }
}

class Dog extends Animal {
    String breed;
    Dog(String name, int age, String breed) {
        super(name, age);  
        this.breed = breed;
        
    }
}


public class Question1 {
	public static void main(String[] args) {

        Dog d1 = new Dog("Buddy", 3, "Golden Retriever");

        System.out.println("Name: " + d1.name);
        System.out.println("Age: " + d1.age);
        System.out.println("Breed: " + d1.breed);
    }

}
