package homework.bytecode;

/**
 * @Description:
 * @Author: haijinqi
 * @CreateDate: 2021/6/27 下午4:24
 */
public class ByteCodeTest {

    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        int a = 1;
        int b = 2;
        byte c = 1;
        short d = 2;
        long e = 5L;
        float f = 0.1f;
        double g = 0.01;
        char h = 'H';
        boolean flag = true;
        for (int i = 0; i < 10; i++) {
            if (i > e) {
                System.out.println(a + b);
                System.out.println(a - b);
                System.out.println(a * b);
                System.out.println(a / b);
                mathOperation.divide(a,b);
            }
        }
    }

}
