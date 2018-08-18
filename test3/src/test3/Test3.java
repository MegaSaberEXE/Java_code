package test3;

public class Test3 {
    private String xThing;
    public void makeThing() {
        String thing = "thing";
        xThing = thing;
        System.out.println(thing);
    }
    public void makeOtherThing() {
        String otherThing = "otherThing";
        System.out.println(otherThing);
        System.out.println(xThing);
    }
    public static void main(String args[]) {
       Test3 myObject = new Test3();
       myObject.makeThing();
       myObject.makeOtherThing();
    }
    
}

//mulitple classes