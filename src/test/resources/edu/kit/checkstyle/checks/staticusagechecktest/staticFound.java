package edu.kit.checkstyle.checks.staticusagechecktest;


public class staticFound {

  // error here
  static int i = 0;
  
  // no error here
  static void meth() {} 
}
