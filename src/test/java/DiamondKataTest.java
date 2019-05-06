import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DiamondKataTest {

    private Diamond diamond;
    private Diamond.Writer writer;

    @Before
    public void setUp() {
        diamond = new Diamond();
        writer = mock(Diamond.Writer.class);
    }

    @Test
    public void firstLetterTest() {
        diamond.print('A', writer);

        verify(writer).print("A");
    }

    @Test
    public void secondLetterTest() {
        diamond.print('B', writer);

        verify(writer).print(" A ");
        verify(writer).print("B B");
        verify(writer).print(" A ");
    }
}
