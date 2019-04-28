package co.braren.bfs.commons;

import org.junit.Assert;
import org.junit.Test;

public class MockDataTest {

    @Test
    public void shouldInstanceNotNull() {
        MockData mockData = new MockData();
        Assert.assertNotNull(mockData);
    }
}
