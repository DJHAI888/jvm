## 
Last modified 2021-6-27; size 751 bytes
  MD5 checksum 87640571f1afca18d53b7535f44aed09
  Compiled from "ByteCodeTest.java"
public class homework.bytecode.ByteCodeTest
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #13.#25        // java/lang/Object."<init>":()V
   #2 = Class              #26            // homework/bytecode/MathOperation
   #3 = Methodref          #2.#25         // homework/bytecode/MathOperation."<init>":()V
   #4 = Long               5l
   #6 = Float              0.1f
   #7 = Double             0.01d
   #9 = Fieldref           #27.#28        // java/lang/System.out:Ljava/io/PrintStream;
  #10 = Methodref          #29.#30        // java/io/PrintStream.println:(I)V
  #11 = Methodref          #2.#31         // homework/bytecode/MathOperation.divide:(II)I
  #12 = Class              #32            // homework/bytecode/ByteCodeTest
  #13 = Class              #33            // java/lang/Object
  #14 = Utf8               <init>
  #15 = Utf8               ()V
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               main
  #19 = Utf8               ([Ljava/lang/String;)V
  #20 = Utf8               StackMapTable
  #21 = Class              #34            // "[Ljava/lang/String;"
  #22 = Class              #26            // homework/bytecode/MathOperation
  #23 = Utf8               SourceFile
  #24 = Utf8               ByteCodeTest.java
  #25 = NameAndType        #14:#15        // "<init>":()V
  #26 = Utf8               homework/bytecode/MathOperation
  #27 = Class              #35            // java/lang/System
  #28 = NameAndType        #36:#37        // out:Ljava/io/PrintStream;
  #29 = Class              #38            // java/io/PrintStream
  #30 = NameAndType        #39:#40        // println:(I)V
  #31 = NameAndType        #41:#42        // divide:(II)I
  #32 = Utf8               homework/bytecode/ByteCodeTest
  #33 = Utf8               java/lang/Object
  #34 = Utf8               [Ljava/lang/String;
  #35 = Utf8               java/lang/System
  #36 = Utf8               out
  #37 = Utf8               Ljava/io/PrintStream;
  #38 = Utf8               java/io/PrintStream
  #39 = Utf8               println
  #40 = Utf8               (I)V
  #41 = Utf8               divide
  #42 = Utf8               (II)I
{
  public homework.bytecode.ByteCodeTest();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 8: 0

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=14, args_size=1
         0: new           #2                  // class homework/bytecode/MathOperation
         3: dup
         4: invokespecial #3                  // Method homework/bytecode/MathOperation."<init>":()V （构造方法  创建类的实例化对象）
         7: astore_1                          
         8: iconst_1
         9: istore_2
        10: iconst_2
        11: istore_3
        12: iconst_1
        13: istore        4
        15: iconst_2
        16: istore        5
        18: ldc2_w        #4（常量池）                  // long 5l
        21: lstore        6
        23: ldc           #6                  // float 0.1f
        25: fstore        8
        27: ldc2_w        #7                  // double 0.01d
        30: dstore        9
        32: bipush        72
        34: istore        11
        36: iconst_1
        37: istore        12
        39: iconst_0
        40: istore        13
        42: iload         13
        44: bipush        10                   
        46: if_icmpge     107                (if判断语句 ge 大于比较)
        49: iload         13
        51: i2l
        52: lload         6
        54: lcmp
        55: ifle          101
        58: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
        61: iload_2
        62: iload_3
        63: iadd                                （int类型 加运算）
        64: invokevirtual #10                 // Method java/io/PrintStream.println:(I)V   （方法调用）
        67: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
        70: iload_2
        71: iload_3
        72: isub                                （int类型 减运算）
        73: invokevirtual #10                 // Method java/io/PrintStream.println:(I)V
        76: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
        79: iload_2
        80: iload_3
        81: imul
        82: invokevirtual #10                 // Method java/io/PrintStream.println:(I)V
        85: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
        88: iload_2
        89: iload_3
        90: idiv
        91: invokevirtual #10                 // Method java/io/PrintStream.println:(I)V
        94: aload_1
        95: iload_2
        96: iload_3
        97: invokevirtual #11                 // Method homework/bytecode/MathOperation.divide:(II)I
       100: pop
       101: iinc          13, 1                 
       104: goto          42
       107: return
      LineNumberTable:
        line 11: 0
        line 12: 8
        line 13: 10
        line 14: 12
        line 15: 15
        line 16: 18
        line 17: 23
        line 18: 27
        line 19: 32
        line 20: 36
        line 21: 39
        line 22: 49
        line 23: 58
        line 24: 67
        line 25: 76
        line 26: 85
        line 27: 94
        line 21: 101
        line 30: 107
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class "[Ljava/lang/String;", class homework/bytecode/MathOperation, int, int, int, int, long, float, double, int, int, int ]
          stack = []
        frame_type = 58 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
}
