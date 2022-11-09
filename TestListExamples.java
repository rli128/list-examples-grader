import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class TestListExamples {

  public class ListTests {
    @Test 
    public void testFilter() {
      StringChecker sc = new StringChecker() {
  
          public boolean checkString(String s) {
              if (s.length() > 5) {
                  return true;
              }
  
              return false;
          }
  
      };
      
      
      List<String> input1 = new ArrayList<String>();
      input1.add("Banana");
      input1.add("Red");
      input1.add("Motorcycle");
  
      List<String> output = new ArrayList<String>();
      output.add("Banana");
      output.add("Motorcycle");
  
      assertEquals(output, ListExamples.filter(input1, sc));
    }
      
  }
  
}
