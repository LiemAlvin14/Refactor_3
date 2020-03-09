import java.util.Scanner;

public class Sphere extends Shape3d{
    double radius;
    double surfaceArea;
    double volume;
    // a cunstructor that actually does something
    public Sphere(double rad){
        this.radius = rad;
    }
    
    //refactor
    @override
    public void getValues(){
        System.out.println("What is the radius of the sphere");
        this.radius = input.nextInt();
    }
    
    @override
    public void calculateValues(){
        this.surfaceArea = 4*3.14*this.radius*this.radius;
        this.volume = (this.radius*this.radius*this.radius)*(4/3)*3.14;
    }
    
    @override
    public void displayValues(){
        System.out.println("The volume of the sphere is " + this.volume);
        System.out.println("The surface area of the sphere is " + this.surfaceArea);
    }
}
