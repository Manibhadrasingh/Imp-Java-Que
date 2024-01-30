class A {
    public void showMeTheMistakeOfYourCodes() {
        System.out.println("Annotation");
    }    
}

class B extends A {
    @Override  // Optional annotation to indicate method override
    public void showMeTheMistakeOfYourCodes() {
        System.out.println("Annotation is seen by method override :");
    }
}

public class AnnotationJava {
    public static void main(String[] args) {
        B b = new B();  // Create an object of class B
        b.showMeTheMistakeOfYourCodes();
    }
}
