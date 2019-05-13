package co.braren.graphs;

import co.braren.graphs.commons.MockData;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldInstanceNotNull() {
        App app = new App();
        Assert.assertNotNull(app);
    }

    @Test
    public void shouldBFSRun() {
        App app = new App();
        Assert.assertEquals(MockData.ALG_BFS_FULL_RESULT, app.initBFS());
    }

    @Test
    public void shouldMainRun() {
        App app = new App();
        app.main(null);
        assertTrue(true);
    }
}
