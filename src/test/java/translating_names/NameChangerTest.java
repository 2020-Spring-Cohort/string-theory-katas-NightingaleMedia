package translating_names;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

public class NameChangerTest {
  @Test
  public void translateToSnakeCase_GivenHelloWorld_Returns_hello_world() {
    NameChanger underTest = new NameChanger();
    String result = underTest.translateToSnakeCase("HelloWorld");
    assertThat(result, equalTo("hello_world"));
  }
  
}
