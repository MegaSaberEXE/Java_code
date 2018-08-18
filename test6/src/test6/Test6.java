package test6;

class One {
        public void display() {
    System.out.println("test1");
    }
    }

class Two {
    public void displaytwo() {
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
    }
}

public class Test6 {
    public static void main(String[] args) {
        One a = new One();
        a.display();
        Two b = new Two();
        b.displaytwo();
    }
    
}

// OOP test 