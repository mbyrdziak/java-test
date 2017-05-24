import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class FooTest {

    @Test
    public void shouldTest() {

        assertFalse(false);
    }
}

// $JOB_NAME #$BUILD_NUMBER $STATUS after $BUILD_DURATION (<a href="$BUILD_URL">View build</a>) ${HIPCHAT_CHANGES_OR_CAUSE} ${CHANGES,format="%m (%a)"}