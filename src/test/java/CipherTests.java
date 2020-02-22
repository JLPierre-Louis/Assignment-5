import static org.junit.Assert.assertEquals;

import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import org.junit.Test;

/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {
  @Test
  public void CaesarCipherTest1() {
    CaesarCipher cipher1 = new  CaesarCipher();
    cipher1.setText("This is a message");
    assertEquals(cipher1.getText(),"Ocdn dn v hznnvbz");
  }

  @Test
  public void CaesarCipherTest2() {
    CaesarCipher cipher2 = new  CaesarCipher();
    cipher2.setText("I am Marshall");
    assertEquals(cipher2.getText(),"D vh Hvmncvgg");
  }

  @Test
  public void ElbonianCipher1() {
    ElbonianCipher cipher3 = new  ElbonianCipher();
    cipher3.setText("I use an Hp");
    assertEquals(cipher3.getText(),"09S211905S0114S0816");
  }

  @Test
  public void ElbonianCipher2() {
    ElbonianCipher cipher4 = new  ElbonianCipher();
    cipher4.setText("Extra  Space");
    assertEquals(cipher4.getText(),"0524201801SS1916010305");
  }
}
