package word_wrap;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordWrapTest {
    @Test
    public void wrapTextTest() throws Exception {
        WordWrap underTest = new WordWrap();
        String result = underTest.wrapText(4, "Cat in a hat");
        assertThat(result).isEqualTo("Cat \nin a\nhat");
    }
}
