class CSphere {
    private int x;
    private int y;
    private int z;
    private int radius;

    // (a) 设置圆心位置的函数
    void setLocation(int newX, int newY, int newZ) {
        x = newX;
        y = newY;
        z = newZ;
    }

    // (b) 设置半径的函数
    void setRadius(int newRadius) {
        radius = newRadius;
    }

    // (c) 计算表面积的函数
    double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    // (d) 计算体积的函数
    double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    // (e) 显示圆心座标的函数
    void showCenter() {
        System.out.println("Center: (" + x + ", " + y + ", " + z + ")");
    }

    public static void main(String[] args) {
        CSphere sphere = new CSphere();

        // (a) 设置圆心位置为(3, 4, 5)
        sphere.setLocation(3, 4, 5);

        // (b) 设置半径为1
        sphere.setRadius(1);

        // 显示圆心座标
        sphere.showCenter();

        // 计算并显示表面积
        double surfaceArea = sphere.surfaceArea();
        System.out.println("Surface Area: " + surfaceArea);

        // 计算并显示体积
        double volume = sphere.volume();
        System.out.println("Volume: " + volume);
    }
}
