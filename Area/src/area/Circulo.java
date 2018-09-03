package area;

public class Circulo extends Areas{
    
    @Override
    public double Area(){
        this.area = (this.x*this.x)*3.1415f;
        return this.area;
    }
}
