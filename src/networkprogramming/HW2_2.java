package networkprogramming;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class HW2_2 {

  public static void main(String[] args) throws Exception{

    long time = System.currentTimeMillis();

    FileInputStream fis = new FileInputStream ("bird.jpeg");
    FileOutputStream fos = new FileOutputStream("bird2.jpeg");

    byte[] temp = new byte[100];
    int count = fis.read(temp);

    while (count!= -1) {
      fos.write(temp, 0, count);
      count = fis.read(temp);
    }
    fos.close();
    fis.close();

    System.out.println("\n걸린시간 : "+(System.currentTimeMillis()-time));
  }
}
