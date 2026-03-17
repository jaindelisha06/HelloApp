import java.util.*;
class HelloApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = sc.nextLine(); 
        if (name.isEmpty()) {
            System.out.println("Hello World!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}
 
