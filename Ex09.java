class CCalculator {
    int a, b, c;

    // (a) 定义set_value函数，用来设置数据成员的值。
    void set_value(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    // (b) 定义show函数，用来打印所有数据成员。
    void show() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    // (c) 定义add函数，用来返回三数之和。
    int add() {
        return a + b + c;
    }

    // (d) 定义sub函数，用来返回a - b - c的值。
    int sub() {
        return a - b - c;
    }

    // (e) 定义mul函数，用来返回三数之积。
    int mul() {
        return a * b * c;
    }

    // (f) 定义avg函数，用来返回三数的平均值（返回类型为double）。
    double avg() {
        return (double)(a + b + c) / 3.0;
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建CCalculator类的对象obj。
        CCalculator obj = new CCalculator();

        // 使用set_value函数设置数据成员的值。
        obj.set_value(25, 3, 7);

        // 调用show函数显示所有数据成员。
        System.out.println("所有数据成员的值：");
        obj.show();

        // 调用add函数，返回三数之和。
        System.out.println("三数之和：" + obj.add());

        // 调用sub函数，返回a - b - c的值。
        System.out.println("a - b - c 的值：" + obj.sub());

        // 调用mul函数，返回三数之积。
        System.out.println("三数之积：" + obj.mul());

        // 调用avg函数，返回三数的平均值。
        System.out.println("三数的平均值：" + obj.avg());
    }
}
