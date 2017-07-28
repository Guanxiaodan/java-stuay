# Java对象和类
### Java是一种面向对象语言，有以下基本概念： 多态、继承、封装、抽象、类、对象、实例、方法、重载。

## 概念

#### <font color="red">类：</font>类是一个模板，它描述一类对象的行为和状态。
#### <font color="red">对象：</font>对象是类的一个实例，有状态和行为。例如，一条狗是一个对象，它的状态有：颜色、名字、品种；行为有：摇尾巴、叫、吃等。


## 类
```
// 狗类：状态（品种，年龄，颜色）、行为（叫，饿，睡觉）
public class Dog{
  String breed;
  int age;
  String color;
  void barking(){
  }

  void hungry(){
  }

  void sleeping(){
  }
}
```
##### 类中包含的变量：
* <font color="red">局部变量：</font>在 **方法、构造方法、语句块** 中定义的变量称为局部变量，变量的生命和初始化都是在方法中，方法结束后，变量就会自动销毁。
*  <font color="red">成员变量：</font>成员变量是定义在类中，方法体之外的变量。这种变量在创建 **对象** 的时候实例化。
* <font color="red">类变量：</font> 类变量特是声明在类中，方法体之外，但是必须声明是static类型。

##### 构造方法：
每个类都有构造方法（没有构造方法怎么创建对象，是吧），如果没有人为定义的话Java会默认提供一个构造方法。**构造方法的名称必须与类同名，** 一个类可以有多个构造方法。
```
public class Puppy{
    public Puppy(){
    }

    public Puppy(String name){
        // 这个构造器仅有一个参数：name
    }
}
```

## 创建对象
用关键字new一个对象，创建对象有以下三步：
* <font color="red">声明：</font>声明一个对象，包括对象名称和对象类型。
* <font color="red">实例化：</font>使用关键字 **new** 来创建一个对象。
* <font color="red">局部变量：</font>使用new创建对象时，会调用构造方法初始化对象。
```
public class Puppy{
   public Puppy(String name){
      //这个构造器仅有一个参数：name
      System.out.println("小狗的名字是 : " + name );
   }
   public static void main(String []args){
      // 下面的语句将创建一个Puppy对象
      Puppy myPuppy = new Puppy( "tommy" );
   }
}
```

## 源文件声明规则
当一个源文件中定义多个类，并且还有 **import** 语句和**package**语句时，需要注意以下规则：
##### 1. 一个源文件中只能有一个public类,可以有多个非public类。
##### 2. 源文件名称得和public类的类名保持一致。
##### 3. 如果一个类定义在某个包中，那么package语句应该在源文件的首行。
##### 4.如果源文件包含import语句，那么应该放在package语句和类定义之间，日过没有package语句，那么import语句应该放在源文件中最前面。
##### 5. import语句和package语句对应源文件中定义的所有类都有效，在同一源文件中，不能给不同的类不同的包声明

## Java包
包主要用来对类和接口进行分类。<font color="red">接口是什么？？？</font>

## Import 语句

在Java中，如果给出一个完整的限定名，包括包名，类名，那么Java编辑器就可以很容易的定位到源代码或者类。
用import语句来提供一个合理的路径，使得编辑器找到这个类。
```
// 下面的命令行将会命令编译器载入java_installation/java/io路径下的所有类:

import java.io.*;
```

## 代码顺序： puppy ---> dog ---> Employee && EmployeeTest
## <font color="red">疑问：Employee && EmployeeTest 这个demo里面EmployeeTest是在哪里引用的Employee？？？如果说是像这样 **import java.io.*;**  引用进来的话，那是不是说明Java编译完之后的冬衣都存在了这个路径下面？？？？</font>

## 解答：java因强制要求类名（唯一的public类）和文件名统一，因此在引用其它类时无需显式声明。在编译时，编译器会根据类名去寻找同名文件
