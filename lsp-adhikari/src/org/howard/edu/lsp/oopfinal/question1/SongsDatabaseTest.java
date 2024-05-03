package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongsDatabaseTest {

    @Test
    @DisplayName("Test for addSong")
    public void testAddSong() {
        SongsDatabase database = new SongsDatabase();
        database.addSong("Rap", "Savage");
        database.addSong("Country", "Sweet Alabama");
        database.addSong("Jazz", "Always There");

        assertTrue(database.getSongs("Rap").contains("Savage"));
        assertTrue(database.getSongs("Country").contains("Sweet Alabama"));
        assertTrue(database.getSongs("Jazz").contains("Always There"));
    }

    @Test
    @DisplayName("Test for getGenreOfSong")
    public void testGetGenreOfSong() {
        SongsDatabase database = new SongsDatabase();
        database.addSong("Rap", "Savage");
        database.addSong("Country", "Sweet Alabama");
        database.addSong("Jazz", "Always There");

        assertEquals("Rap", database.getGenreOfSong("Savage"));
        assertEquals("Country", database.getGenreOfSong("Sweet Alabama"));
        assertEquals("Jazz", database.getGenreOfSong("Always There"));
        assertNull(database.getGenreOfSong("Non-existent Song"));
    }

    @Test
    @DisplayName("Test for getSongs")
    public void testGetSongs() {
        SongsDatabase database = new SongsDatabase();
        database.addSong("Rap", "Savage");
        database.addSong("Country", "Sweet Alabama");
        database.addSong("Jazz", "Always There");

        Set<String> rapSongs = database.getSongs("Rap");
        assertEquals(1, rapSongs.size());
        assertTrue(rapSongs.contains("Savage"));

        Set<String> countrySongs = database.getSongs("Country");
        assertEquals(1, countrySongs.size());
        assertTrue(countrySongs.contains("Sweet Alabama"));

        Set<String> jazzSongs = database.getSongs("Jazz");
        assertEquals(1, jazzSongs.size());
        assertTrue(jazzSongs.contains("Always There"));

        Set<String> emptySet = database.getSongs("Classical");
        assertEquals(0, emptySet.size());
    }
}
