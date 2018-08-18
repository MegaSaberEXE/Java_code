package test5;
        
        class One {
        public void display() {
    System.out.println("test1");
    }
    }
    class Two extends One {
    @Override
    public void display() {
    System.out.println("Two");
}
    public int add(int x, int y) {
return x+y;
}

//Overload
public double add(double x,double y) {
return x+y;
}
}
        
    class Test5 {
    public static void main(String[] args) {
        One a = new One();
        a.display();
        Two b = new Two();
        b.display();
        System.out.println(b.add(4,2));
        System.out.println(b.add(5.,2.));
    }
    }


// all OOP things