
package area;

public class Rectangulo extends Areas {
    
     @Override
    public double Area(){
        this.area = (this.x* this.y);
        return this.area;
    }
    
}
