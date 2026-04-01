package Workshop4;

class Animalia {
    protected String name;

    Animalia(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doggy extends Animalia {
    private String breed;

    Doggy(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Doggy d1 = new Doggy("Buddy", "Golden Retriever");
        Doggy d2 = new Doggy("Max", "Bulldog");

        System.out.println("Name: " + d1.getName() + ", Breed: " + d1.getBreed());
        System.out.println("Name: " + d2.getName() + ", Breed: " + d2.getBreed());
    }
}