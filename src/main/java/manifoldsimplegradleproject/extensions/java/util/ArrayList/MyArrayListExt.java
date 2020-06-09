package manifoldsimplegradleproject.extensions.java.util.ArrayList;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import java.util.ArrayList;

@Extension
public class MyArrayListExt {
  public static <E> void myArrayListMethod(@This ArrayList<E>  thiz) {
    System.out.println("hello world!");
  }
}