package networkprogramming;

import java.io.FileInputStream;

public class Example {

  public static void main(String[] args) throws Exception {

    FileInputStream fis = new FileInputStream("javalogo.jpg");
    System.out.println(fis.available()+"dfsf");
    byte[] b = new byte[1024];
    int count = fis.read(b);
    fis.close();
    System.out.println("Bytes read: " + count);
    for (int i = 0; i < count; i++) {
      // 127보다 큰 수는 byte 배열에 저장될 때 음수로 바뀌어 저장됨
// 원래의 값을 알기 위해 & 0xff 처리하면 됨
      int alpha = b[i] & 0xff;
      System.out.print(alpha + " ");
// 1줄에 8개 바이트씩 인쇄
      if (i % 8 == 7) {
        System.out.print('\n');
      } else {
        System.out.print('\t');
      }
    }
  }
}