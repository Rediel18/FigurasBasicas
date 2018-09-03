package area;

public class Triangulo extends Areas{
        
    @Override
    public double Area(){
        this.area = (this.x* this.y)/2;
        return this.area;
    }
}
