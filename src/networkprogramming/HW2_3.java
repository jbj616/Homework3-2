package networkprogramming;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class HW2_3 {

  public static void main(String[] args) throws Exception {

    long time = System.currentTimeMillis();

    FileInputStream fis = new FileInputStream("bird.jpeg");
    FileOutputStream fos = new FileOutputStream("bird3.jpeg");
    int count;

    while (true) {
      count = fis.read();
      if (count == -1) {
        break;
      }

      fos.write(count);
    }

    fos.close();
    fis.close();

    System.out.println("\n걸린시간 : "+(System.currentTimeMillis()-time));
  }

}
