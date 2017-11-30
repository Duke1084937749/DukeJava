public class Person {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.name = "张三";
        demo.show();
        // TODO: 2017/11/30 0030 第一次使用TODO 
    }
}

class Demo{
    String name;
    static String country = "CN";
    public void show(){
        System.out.println(name+":::"+country);
    }
}