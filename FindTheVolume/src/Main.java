import java.util.Scanner;
public class Main {
    //changed from static to not static
    int answer;
    
    //refactor
    private void menu(){
        System.out.println();
        System.out.println("Type 1 to find the properties of a rectangle");
        System.out.println("Type 2 to find the properties of a sphere");
        System.out.println("Type something else to exit");
        answer = input.nextInt();
    }
    
    //refactor
    private void (Shape)
    
    public Main(){
        Scanner input = new Scanner (System.in);
        while (true){
            menu();
            
            if (answer == 1){
            RectangularPrism r1 = new RectangularPrism();
            r1.getValues();
            //r1.calculateValues();
            r1.displayValues();
            
            } else if (answer == 2){
            System.out.println("What is the radius of the sphere");
            Sphere s1 = new Sphere(input.nextDouble());
            s1.calculateValues();
            s1.displayValues();
            
            } else {
                   break; 
                }
            }
        }
    }
    
    //changed from long code to new Main();
    public static void main(String[] args) {
        new Main();
    }
    
