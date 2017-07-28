// import java.io.*;

public class EmployeeTest{

   public static void main(String args[]){
      /* 使用构造器创建两个对象 */
      Employee empOne = new Employee("小红"); // 会根据这个Employee类名找到编译后的Employee文件，因为类名和文件名是一样的呀！
      Employee empTwo = new Employee("小明");

      // 调用这两个对象的成员方法
      empOne.empAge(26);
      empOne.empDesignation("高级程序员");
      empOne.empSalary(10000);
      empOne.printEmployee();

      empTwo.empAge(21);
      empTwo.empDesignation("菜鸟程序员");
      empTwo.empSalary(8000);
      empTwo.printEmployee();
   }
}
