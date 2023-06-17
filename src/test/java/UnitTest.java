import com.implementation.businessLogic.BinarySearch;
import com.interfaces.MaxValue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UnitTest {
    @Mock
    MaxValue maxValue;
    @InjectMocks
    BinarySearch search;
    @Test
    public void multipleValues() {
        when(maxValue.findMaxValue()).thenReturn(new int[] {23,54,6,600,2});
        assertEquals(600, search.findMaxValueFromArray());
    }
}