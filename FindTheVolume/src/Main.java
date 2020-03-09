import java.util.Scanner;
public class Main {
    //remove answer fielld to avoid temporary field problem
    
    //refactor
    private int menu(){
        System.out.println();
        System.out.println("Type 1 to find the properties of a rectangle");
        System.out.println("Type 2 to find the properties of a sphere");
        System.out.println("Type something else to exit");
        int answer = input.nextInt();
        return answer;
    }
    
    //refactor
    private void showMenu(int answer){
        if(answer==1){
            RectangularPrism s1 = new RectangularPrism();
            s1.getValues();
            s1.calculateValues();
            s1.displayValues();
        }else{
            Sphere() s1 = new Sphere();
            s1.getValues();
            s1.calculateValues();
            s1.displayValues();
        }
    }
    public Main(){
        int answer=0;
        Scanner input = new Scanner (System.in);
        while (true){
            answer=menu();
            if (answer == 1 || answer == 2){
               showMenu(answer);
            } else {
               break; 
            }
        }
    }
    
    //changed from long code to new Main();
    public static void main(String[] args) {
        new Main();
    }
    
