
package test2;

/**
 *
 * @author MegaSaber
 */
    interface Info {
        static final String language = "Java";
        public void display();
    }
    class Test2 implements Info {
        public static void main(String []args) {
            Test2 obj = new Test2();
            obj.display();
        }
        
        public void display() {
            System.out.println(language + " is awesome");
        }
    }

//example of interface