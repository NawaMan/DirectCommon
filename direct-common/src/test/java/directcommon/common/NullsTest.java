package directcommon.common;

import static org.junit.Assert.assertEquals;

import java.util.function.Predicate;

import org.junit.Test;

import lombok.val;
import lombok.experimental.ExtensionMethod;


@SuppressWarnings("javadoc")
@ExtensionMethod({ Nulls.class })
public class NullsTest {
    
    private Predicate<String> contains(String needle) {
        return heystack-> { 
            return heystack.isNotNull()
                && heystack.contains(needle);
        };
    }
    
    @Test
    public void testWhen() {
        val theOriginalString = "The original string";
        val nullString = (String)null;
        
        assertEquals("The original string", theOriginalString.when(contains("original")).or("Another string"));
        assertEquals("Another string",      theOriginalString.when(contains("another" )).or("Another string"));
        assertEquals("Another string",      nullString       .when(contains("original")).or("Another string"));
        assertEquals("Another string",      nullString       .when(contains("another" )).or("Another string"));
    }
    
}
