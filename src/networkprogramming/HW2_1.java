package networkprogramming;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class HW2_1 {

  public static void main(String[] args) throws Exception {

    long time = System.currentTimeMillis();

    FileInputStream fis = new FileInputStream("bird.jpeg");
    FileOutputStream fos = new FileOutputStream("bird1.jpeg");
    int tmp;

    while ((tmp = fis.read()) != -1) {
      fos.write(tmp);
    }

    fis.close();
    fos.close();

    System.out.println("\n걸린시간 : "+(System.currentTimeMillis()-time));
  }

}
