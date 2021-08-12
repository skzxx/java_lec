public class Main {
  public static void main(String[] args) {
    byte a = 46;
    byte b;
    byte c;
    String a_bits;
    String b_bits;
    String c_bits;
    a_bits = String.format("%8s", Integer.toBinaryString(a));
    System.out.printf("%8s = %d", a_bits, a);
    //operator shift left
    System.out.println("\n === SHIFT LEFT === \n");
    a = 6;
    a_bits = String.format("%8s", Integer.toBinaryString(a));
    System.out.printf("%8s = %d", a_bits, a);
    b = (byte)(a << 1);
    b_bits = String.format("%8s", Integer.toBinaryString(b));
    System.out.printf("%8s = %d", b_bits, b);
    //operator shift Right
    System.out.println("\n === SHIFT RIGHT === \n");
    a = 8;
     a_bits = String.format("%8s", Integer.toBinaryString(a));
    System.out.printf("%8s = %d", a_bits, a);
    b = (byte)(a >> 1);
    b_bits = String.format("%8s", Integer.toBinaryString(b));
    System.out.printf("%8s = %d", b_bits, b);
    // OPERATOR LOGIKA (OR)
    System.out.println("\n === OPERATOR BITWISE OR === \n");
    a = 24;
     a_bits = String.format("%8s", Integer.toBinaryString(a));
    System.out.printf("%8s = %d", a_bits, a);
    b = 12;
    b_bits = String.format("%8s", Integer.toBinaryString(b));
    System.out.printf("%8s = %d", b_bits, b);
    c = (byte)(a | b);
    c_bits = String.format("%8s", Integer.toBinaryString(c));
    System.out.printf("%8s = %d", c_bits, c);
      // OPERATOR LOGIKA (and)
    System.out.println("\n === OPERATOR BITWISE AND === \n");
    a = 24;
     a_bits = String.format("%8s", Integer.toBinaryString(a));
    System.out.printf("%8s = %d", a_bits, a);
    b = 12;
    b_bits = String.format("%8s", Integer.toBinaryString(b));
    System.out.printf("%8s = %d", b_bits, b);
    c = (byte)(a & b);
    c_bits = String.format("%8s", Integer.toBinaryString(c));
    System.out.printf("%8s = %d", c_bits, c);
      // OPERATOR LOGIKA (XOR)
    System.out.println("\n === OPERATOR BITWISE OR === \n");
    a = 24;
     a_bits = String.format("%8s", Integer.toBinaryString(a));
    System.out.printf("%8s = %d", a_bits, a);
    b = 12;
    b_bits = String.format("%8s", Integer.toBinaryString(b));
    System.out.printf("%8s = %d", b_bits, b);
    c = (byte)(a ^ b);
    c_bits = String.format("%8s", Integer.toBinaryString(c));
    System.out.printf("%8s = %d", c_bits, c);
  }
}

