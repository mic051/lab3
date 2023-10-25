import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test 
  public void testReverseInPlace() {
    int[] input1 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = { 1, 2, 3 };
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest()
  {
    double[] input = { 1.0, 1.0, 2.0, 3.0, 4.0};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input), 0.0001);
  }
}