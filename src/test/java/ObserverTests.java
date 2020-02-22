import static org.junit.Assert.assertEquals;

import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import edu.wpi.cs3733.entity.Message;
import org.junit.Test;

/**
 * Tests for your observer pattern; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class ObserverTests {
  @Test
  public void ObserverTest1() {
    Message message = new Message ();
    ElbonianCipher cipher1 = new ElbonianCipher();
    CaesarCipher cipher2 = new CaesarCipher();
    message.register(cipher1);
    message.register(cipher2);
    message.setText("This is a message");
    assertEquals(cipher2.getText(),"Ocdn dn v hznnvbz");
    assertEquals(cipher1.getText(),"20080919S0919S01S13051919010705");
  }

  @Test
  public void ObserverTest2() {
    Message message = new Message();
    ElbonianCipher cipher1 = new ElbonianCipher();
    message.register(cipher1);
    message.setText("A");
    assertEquals(cipher1.getText(), "01");
  }

  @Test
  public void ObserverTest3() {
    Message message = new Message();
    CaesarCipher cipher1 = new CaesarCipher();
    message.register(cipher1);
    message.setText("A");
    assertEquals(cipher1.getText(), "V");
  }

  @Test
  public void ObserverTest4() {
    Message message = new Message();
    ElbonianCipher cipher1 = new ElbonianCipher();
    CaesarCipher cipher2 = new CaesarCipher();
    message.register(cipher1);
    message.register(cipher2);
    message.setText(".;;'.';123';1.23;'1.23';.12';3. ");
    assertEquals(cipher1.getText(), "S");
    assertEquals(cipher2.getText(), " ");
  }
}
