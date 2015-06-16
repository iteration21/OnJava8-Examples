//: generics/GenericsAndCovariance.java
// �2015 MindView LLC: see Copyright.txt
import java.util.*;

public class GenericsAndCovariance {
  public static void main(String[] args) {
    // Wildcards allow covariance:
    List<? extends Fruit> flist = new ArrayList<>();
    // Compile Error: can't add any type of object:
    // flist.add(new Apple());
    // flist.add(new Fruit());
    // flist.add(new Object());
    flist.add(null); // Legal but uninteresting
    // We know that it returns at least Fruit:
    Fruit f = flist.get(0);
  }
} /* Output: (None) *///:~
