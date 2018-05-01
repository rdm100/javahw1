import gherkin.lexer.Ca;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

  Calculator calculator;

  @Before
  public void before(){
    calculator = new Calculator(4,2);
  }

  @Test
    public void canAdd(){
      assertEquals(6, calculator.add());
  } //calculator.add(4,2)

  @Test
  public void canSubtract(){
    assertEquals(2, calculator.subtract());
  }

  @Test
  public void canMultiply(){
    assertEquals(8, calculator.multiply());
  }
  @Test
  public void canDivide(){
    assertEquals(2, calculator.divide(),0.1);
  }

}
