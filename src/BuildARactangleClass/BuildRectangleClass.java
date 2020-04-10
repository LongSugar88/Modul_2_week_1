package BuildARactangleClass;
// tạo lớp Rectangle
public class BuildRectangleClass {
    //khai báo các thuộc tính của lớp HCN, trường dữ liệu đặc trưng của hình chữ nhật
    int width, height;
    //định nghĩa phương thức khởi tạo để tạo một đối tượng mới
    public BuildRectangleClass(int width, int height){
        this.width = width;
        this.height = height;
    }
    //xây dựng phương thức của lớp
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getParameter(){
        return 2*(this.width + this.height);
    }
    public String display(){
        return "Rectangle: " + "width = "+ this.width+" height = "+ this.height;
    }
}