
package area;

public abstract class Areas {
    
    protected double x;
    protected double y;
    protected double area;
    
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }    
    
    public Areas(){
        this.x = 0;
        this.y = 0;
    }
    abstract double Area();
}
