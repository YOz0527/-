class CCircle {
    // (a) 计算圆面积的函数，返回类型为double
    double area(double r) {
        return Math.PI * r * r;
    }

    // (b) 多重载的area函数，计算圆面积，返回类型为float
    float area(float r) {
        return (float) (Math.PI * r * r);
    }

    // (c) 多重载的area函数，计算圆面积，返回类型为double
    double area(int r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        CCircle circle = new CCircle();

        // (d) 分别调用area(2)、area(2.2f)和area(2.2)，并打印返回值
        double result1 = circle.area(2);
        float result2 = circle.area(2.2f);
        double result3 = circle.area(2.2);

        System.out.println("Area (int): " + result1);
        System.out.println("Area (float): " + result2);
        System.out.println("Area (double): " + result3);
    }
}
