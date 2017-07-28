public class Dog{
  int dogAge; // 类的成员变量
  public Dog(String name){ // 类的构造方法，构造方法与类同名
    System.out.println("小狗的名字是：" + name);
  }
  public void setAge (int age) { // 类的行为（改变了类的成员变量）
    dogAge = age;
  }
  public int getAge() { // 类的行为
    System.out.println("小狗的年龄为：" + dogAge);
    return dogAge;
  }
  public static void main(String []args)  { // 开始执行Java代码
    // 创建对象
    Dog myDog = new Dog("小狗狗啊"); // 声明一个对象
    // 通过方法来设定age
    myDog.setAge(4); // 调用类的行为
    myDog.getAge(); // 调用类的行为
    // 也可通过下面这种方式访问成员变量
    System.out.println("这样也可以：" + myDog.dogAge);
  }

}
