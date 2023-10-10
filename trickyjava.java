//to implement a singleton patter using enums in java
public class Main{
  public static void main(String[] args){
    SingletonEnum singleton = SingletonEnum.INSTANCE;
    singleton.someMethod();    //Both lines below will refer to the same instance
  SingletonEnum anotherInstance = SingletonEnum.INSTANCE;
    System.out.println(singleton == anotherInstance);   //Output: true
  }
}
