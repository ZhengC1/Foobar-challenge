import java.util.Assert.*;

public class ScaleTest {

  @Test
  public void testScale1() {
    int x = 3;
    Scale scale = new Scale();
    String[] answer = {"-", "R"};
    Assert.assertArrayEquals(answer, scale.getBalance(x));
  }

  @Test
  public void testScale2() {
    int x = 8;
    Scale scale = new Scale();
    String[] answer = {"L", "R"};
    Assert.assertArrayEquals(answer, scale.getBalance(x));
  }

  @Test
  public void testScale3() {
    int x = 40;
    // L : 40 
    // R: 27 + 9 (36) + 3 (39) + 1 
    Scale scale = new Scale();
    String[] answer = {"R", "R", "R", "R"};
    Assert.assertArrayEquals(answer, scale.getBalance(x));
  }

  @Test
  public void testScale3() {
    int x = 52;
    // 81 + 1 = 82
    // 52 + 27 (79) + 3 (82)
    Scale scale = new Scale();
    String[] answer = { "L", "R", "-", "R" };
    Assert.assertArrayEquals(answer, scale.getBalance(x));
  }

  @Test
  public void testScale4() {
    int x = 91
    // R: 91
    // L: 81 + 9 + 1 
    Scale scale = new Scale();
    String[] answer = { "R", "-", "R", "-", "R"};
    Assert.assertArrayEquals(answer, scale.getBalance(x));
  }


  @Test
  public void testScale5() {
    int x = 251;
    // 243 + 9 = 252
    // 251 + 1 = 252
    Scale scale = new Scale();
    String[] answer = {"L", "-", "R"};
    Assert.assertArrayEquals(answer, scale.getBalance(x));
  }
}
