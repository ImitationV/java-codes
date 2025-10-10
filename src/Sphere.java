import java.text.NumberFormat;

public class Sphere {
    int diameter;

    public Sphere(int diameter) {
        this.diameter = diameter;

    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getVolume(){
        double v=0;
        double r= diameter;
        v=(4.00/3)*Math.pow(diameter,3)*Math.PI;
        return v;
    }
    public double getArea(){
        double area =0;
        area = 4*Math.PI*Math.pow(diameter,2);
        return area;
    }
    public String toString(){
        NumberFormat fmt =NumberFormat.getNumberInstance();
        return fmt.format(getDiameter());
    }
}
