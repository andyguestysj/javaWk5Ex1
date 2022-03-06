class Main {
  public static void main(String[] args) {
    Foo f = new Foo ();
    f.x = 42;
    f.y = 55;
    Bar b = new Bar ();
    b.x = 91;
    b.y = 106;
    System .out. println ("F: " + f.x);
    System .out. println ("B: " + b.x + " " + b.y);
  }
}