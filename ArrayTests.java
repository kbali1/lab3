import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 2, 1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1, 2, 3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }


@Test
public void testReversed2(){
  int[] input2 = {1, 2, 3};
  assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input2));
}


@Test
public void testwithoutLowest(){
  double[] input = {3.0, 3.0, 3.0, 3.0};
  assertEquals(3.0, ArrayExamples.averageWithoutLowest(input),0.001);

}

}
