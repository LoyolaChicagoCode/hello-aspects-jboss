package helloworld;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Hello bean = new HelloWorld();
    bean.setMessage("Hola Mundo");
    System.out.println(bean.getMessage());
    System.out.println(bean.getOne());
    System.out.println(new String("abcd").substring(0,2));
    System.out.println(new String("abcd").substring(2));
    List<String> l = new ArrayList<String>();
    l.add("hello");
    l.add("world");
    System.out.println(l.get(0));
  }
}
