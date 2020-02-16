package translating_names;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class NameChangerTest {
  public NameChanger underTest;

  @BeforeEach
  protected void setUp() {
    underTest = new NameChanger();

  }
  @Test
  public void applicationReturnsALower(){
    underTest.setInput("Hello");
    String result = underTest.translateToSnakeCase();
    assertThat(result).isEqualTo("hello");
  }

  @Test
  public void applicationShouldAddUnderscoreInsteadOfSpace(){
    underTest.setInput("Hello World");
    String result = underTest.translateToSnakeCase();
    assertThat(result).isEqualTo("hello_world");
  }

  @Test
  public void testToSeeIfReturnsUnderscoreAtSpaceOrCapital(){
    underTest.setInput("HelloWorld World");
    String result = underTest.translateToSnakeCase();
    System.out.println(result);
    assertThat(result).isEqualTo("hello_world_world");
  }

  @Test
  public void ComplicatedStringOfCapitalsReturnsSnakeCase() {
    underTest.setInput("Hello This isTheBest place in theWorld to Be");
    String result = underTest.translateToSnakeCase();
    System.out.println(result);
    assertThat(result).isEqualTo("hello_this_is_the_best_place_in_the_world_to_be");
  }


}
