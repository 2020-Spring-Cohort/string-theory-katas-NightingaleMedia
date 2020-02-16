package word_wrap;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordWrapTest {
    @Test
    public void wrapTextTest() {
        WordWrap underTest = new WordWrap();
        String result = underTest.wrapText(4, "Cat in a hat");
        assertThat(result).isEqualTo("Cat \nin a\n hat");
    }

    @Test
    public void newLineWithArgs() {
        WordWrap underTest = new WordWrap();
        String result = underTest.wrapText(3, "Cat in a hat");
        assertThat(result).isEqualTo("Cat\n in\n a \nhat");
    }

}
