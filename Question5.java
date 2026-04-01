package Workshop4;

class Parent {
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    public String publicVar = "Public Variable";

    public void showParentVars() {
        System.out.println("Inside Parent:");
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}

class Child extends Parent {
    public void showChildAccess() {
        System.out.println("Inside Child:");
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}

public class Question5 {
    public static void main(String[] args) {
        Child c = new Child();
        c.showParentVars();
        c.showChildAccess();
    }
}