package Workshop4;

final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}


class Base {
    public final void showMessage() {
        System.out.println("This is a final method in Base.");
    }
}

class Derived extends Base {
  
}

public class Question6 {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.display();

        Derived d = new Derived();
        d.showMessage();
    }
}