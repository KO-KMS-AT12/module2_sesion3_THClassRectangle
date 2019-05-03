public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 5;
        this.height = 3;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public void display() {
        System.out.printf("Dien tich va chu vi hinh chu nhat lan luot la %.2f, %.2f\n", getArea(), getPerimeter());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
