package usingthesetandgetmethod;

/**
 * Driver class
 */
class main13 {

    public static void main(String[] args) {
         
         Dog lab = new Dog();
         
         lab.setName("Barker");
         // my code below
         lab.setColor("Brown");
         lab.birthday();

         System.out.println(lab.getName() + " is " + lab.getAge());
         // my code below
         System.out.println(lab.getName() + " is " + lab.getColor());
    }
    
}
/**
 * Dog class
 */
class Dog {    
    private String name;
    private String color;
    private int age;
    private double height;
    private boolean male;
    //    
    public Dog() {
        name = "";
        color = "";
        age = 0;
        height = 0.5;
        male = true;
    }
    //
    public Dog(String n, String c, boolean g) {
        name = n;
        color = c;
        age = 0; 
        height = 0.5;
        male = g;
    }
    // change name of dog
    public void setName(String n) {
        name = n;
    }
    // get the name of the dog
    public String getName() {
        return name;
    }
    
    
    // my code below
    public void setColor(String c) {
        color = c;
    }
    public String getColor() {
        return color;
    }
    
    
    // get age of the dog
    public int getAge() {
        // return the human equivalent age of the dog instead of its actual age
        int humanAge = calcHumanAge(age);
        return humanAge;
    }
    // update age by 1 everytime method is called
    public void birthday() {
        age++;
    }
    // a helper function inside my class that no one outside of the class can use
    private int calcHumanAge(int dogAge) {
        return (dogAge * 7);
    }

}

//example