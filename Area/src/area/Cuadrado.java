package area;

public class Cuadrado extends Areas{

    @Override
    public double Area(){
        this.area = this.x * this.x;
        return this.area;
    }
}
