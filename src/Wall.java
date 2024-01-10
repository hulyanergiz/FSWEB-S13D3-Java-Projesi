public class Wall {
    double width;
    double height;

    public Wall(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double newWidth){
        width=newWidth;

        if(newWidth<0){
            width=0;
        }
    }
    public void setHeight(double newHeight){
        height=newHeight;

        if(newHeight<0){
            height=0;
        }
    }
    public double getArea(){
        return width*height;
    }
}
