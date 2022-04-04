package G_Percobaan07;

public class G_Percobaan07 {
    //Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called whitout creating objects");
    }

    //public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    //main method
    public static void main(String[] args) {
        myStaticMethod();//call the static method
        //myPublicMethod(); This would output an error

        G_Percobaan07 myObj = new G_Percobaan07();//Create an object of myclass
        myObj.myPublicMethod();
    }
}
