abstract class shap{ //abstract class
    protected double area;

    public abstract void draw();//abstract method
}
class squere extends shap{
    private double size;
    public squere(double size){
        this.size = size;
        this.area = size * size;
    }

    public void draw(){
        System.out.println("I am Squere");
    }
}
class mainshape{
    public static void main(String args[]){
        squere sq = new squere(13);
        System.out.println(sq.area);
        sq.draw();
    }
}
