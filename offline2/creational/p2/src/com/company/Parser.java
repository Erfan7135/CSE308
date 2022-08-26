package com.company;

public abstract class Parser {

  public Parser(String filename) {
      parse(filename);
  }

  abstract void parse(String fileName);
}

class cParser extends Parser{
  public cParser(String filename) {
    super(filename);
  }

  @Override
  void parse(String fileName) {
    System.out.println("Parsing c file: " + fileName);
  }
}

class cppParser extends Parser{
  public cppParser(String filename) {
    super(filename);
  }

  @Override
  void parse(String fileName) {
    System.out.println("Parsing cpp file: " + fileName);
  }
}

class pythonParser extends Parser{
  public pythonParser(String filename) {
    super(filename);
  }

  @Override
  void parse(String fileName) {
    System.out.println("Parsing python file: " + fileName);
  }
}
