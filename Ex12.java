class CWin {
    int width;
    int height;
    String name;

    // 设置宽度的函数
    void setW(int w) {
        width = w;
    }

    // 设置高度的函数
    void setH(int h) {
        height = h;
    }

    // 设置视窗名字的函数
    void setName(String s) {
        name = s;
    }

    public void show() {
        System.out.println("Name=" + name);
        System.out.println("W=" + width + ", H=" + height);
    }

    public static void main(String[] args) {
        CWin window = new CWin();

        // 使用setW()设置宽度
        window.setW(800);

        // 使用setH()设置高度
        window.setH(600);

        // 使用setName()设置窗口名称
        window.setName("My Window");

        // 使用show()显示窗口属性
        window.show();
    }
}
