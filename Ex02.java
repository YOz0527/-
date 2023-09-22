public class Cbbb {
    double x;
    double y;
    
    public static void main(String[] args) {
        // (a) 创建Cbbb类别型态的物件obj1、obj2 与avg。
        Cbbb obj1 = new Cbbb();
        Cbbb obj2 = new Cbbb();
        Cbbb avg = new Cbbb();
        
        // (b) 设置obj1的x值为5.2，y值为3.9。
        obj1.x = 5.2;
        obj1.y = 3.9;
        
        // (c) 设置obj2的x值为6.5，y值为4.6。
        obj2.x = 6.5;
        obj2.y = 4.6;
        
        // (d) 计算obj1和obj2的x值平均并赋值给avg的x。
        avg.x = (obj1.x + obj2.x) / 2.0;
        
        // (e) 计算obj1和obj2的y值平均并赋值给avg的y。
        avg.y = (obj1.y + obj2.y) / 2.0;
        
        // (f) 打印obj1、obj2和avg的值。
        System.out.println("obj1: x=" + obj1.x + ", y=" + obj1.y);
        System.out.println("obj2: x=" + obj2.x + ", y=" + obj2.y);
        System.out.println("avg: x=" + avg.x + ", y=" + avg.y);
    }
}
