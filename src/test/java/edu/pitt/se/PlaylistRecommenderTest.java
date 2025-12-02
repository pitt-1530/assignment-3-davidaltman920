package edu.pitt.se;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PlaylistRecommenderTest {
    PlaylistRecommender pr = new PlaylistRecommender();

    @Test
    public void placeholder() {
        assertTrue(true);
    }

    @Test
    public void testClassifyEnergy() {
        assertEquals("HIGH", pr.classifyEnergy(Arrays.asList(140,140,140)));
        assertEquals("MEDIUM", pr.classifyEnergy(Arrays.asList(100,100,100)));
        assertEquals("LOW", pr.classifyEnergy(Arrays.asList(80,80,80)));
    }

    @Test
    public void testIsValidTrackTitle() {
        assertTrue(pr.isValidTrackTitle("My Song"));
        assertFalse(pr.isValidTrackTitle(null));
        assertFalse(pr.isValidTrackTitle("This is gonna be over 30 characters so its gonna be false I'm really making sure this is over 30 characters and I'm pretty sure it is by now"));
    }

    @Test
    public void testNormalizeVolume() {
        assertEquals(100, pr.normalizeVolume(120));
        assertEquals(0, pr.normalizeVolume(-10));
        assertEquals(75, pr.normalizeVolume(75));
    }
}
