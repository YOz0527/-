class CBox {
    int length;
    int width;
    int height;

    // (b) 定义volume()函数，用来返回box物体的体积。
    int volume() {
        return length * width * height;
    }

    // (c) 定义surfaceArea()函数，用来返回box物体的表面积。
    int surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    // (d) 定义showData()函数，用来显示box物体的length、width、height三个数据成员的值。
    void showData() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    // (e) 定义showAll()函数，用来显示box物体的length、width、height三个数据成员的值，以及其表面积和体积。
    void showAll() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Surface Area: " + surfaceArea());
        System.out.println("Volume: " + volume());
    }

    public static void main(String[] args) {
        // (a) 在main()函数中，以CBox类别建立一个box对象，并将其length、width、height三个数据成员的值均设为1。
        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;

        // 使用showData()函数显示box的数据成员值。
        System.out.println("Box Data:");
        box.showData();

        // 使用showAll()函数显示box的数据成员值、表面积和体积。
        System.out.println("\nBox Data and Calculated Values:");
        box.showAll();
    }
}
