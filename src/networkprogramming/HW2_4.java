package networkprogramming;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class HW2_4 {

  public static void main(String[] args) throws Exception{

    long time = System.currentTimeMillis();
    FileInputStream fis = new FileInputStream("bird.jpeg");
    BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);

    FileOutputStream fos = new FileOutputStream("bufferBird.jpeg");
    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fos);

    int tmp = 0;
    while((tmp=bufferedInputStream.read())!=-1){

      bufferedOutputStream.write(tmp);
    }

    fis.close();
    fos.close();

    System.out.println("\n걸린시간 : "+(System.currentTimeMillis()-time));
  }

}
