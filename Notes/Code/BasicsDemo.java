class BasicsDemo {
  // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.println("world!!");
  }
  static void go(int[] array){
    System.out.println("array[0]: " + array[0]);
    System.out.println("array[1]: " + array[1]);
    array[1] = 22;
  }
  static void go(int i){
    System.out.println("go (int i)");
  }
  static void go(short s){
    System.out.println("go (short s)");


  }
  static void varargsOverload(boolean b, int i, int j, int k){
    System.out.println("\n Inside varargsOverload without varargs ...");
  }
  static void varargsOverload(boolean b, int ... list){
    System.out.println("\n Inside varargsOverload without varargs ...");
    System.out.println("list.length: " + list.length);

  }
 
    public static void main(String[] args) {	
        // Language Basics 1
      print();	
      int I = 6;
      int j = 2;
      System.out.println( I + j);
      System.out.println( I - j);
      System.out.println( I / j);
      System.out.println( I * j);

				int[] array = new int[2];
        array[0] = 1;
        array[1] = 2;
        go(array);
        System.out.println("array[1]: " + array[1]);

        go(1000);

        byte b = 50;
        go(b);

        varargsOverload(true, 18, 19, 13);
        varargsOverload(true, 1, 2, 3, 4, 5, 6);
        varargsOverload(false);


  }       
}
