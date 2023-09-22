class CCircle {
    double pi = 3.14;
    double radius;

    void show_periphery() {
        System.out.println("periphery=" + 2 * pi * radius);
    }
}

public class Main {
    public static void main(String[] args) {
        // (a) 建立一个CCircle类别型态的物件cirl。
        CCircle cirl = new CCircle();

        // (b) 将cirl的数据成员radius的值设为3.0。
        cirl.radius = 3.0;

        // (c) 利用关键字this修改CCircle类别里的函数成员。
        // 这里不需要使用关键字this来调用函数成员。

        // (d) 在main()函数里调用show_periphery()函数。
        cirl.show_periphery();
    }
}
