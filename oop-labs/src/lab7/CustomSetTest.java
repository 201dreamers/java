package lab7;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import lab6.*;

import static org.junit.Assert.*;

public class CustomSetTest {

    CustomSet musicAlbum;
    MusicTrack track1;
    MusicTrack track2;
    MusicTrack track3;
    int numOfTracks;




    @Before
    public void setUp(){
        musicAlbum = new CustomSet();
        track1 = new PopMusic("Cool song!", 15, "pop");
        track2 = new ClassicMusic("MoonSonat",5, "classic");
        track3 = new RockMusic("Toxicity", 5, "rock");
        numOfTracks = 3;
    }

    @Test
    public void extend(){
        int expected = 24;
        Assert.assertEquals(expected, musicAlbum.extend());
    }

    @Test
    public void size() {

        musicAlbum.add(track1);
        musicAlbum.add(track2);
        musicAlbum.add(track3);
        Assert.assertEquals(numOfTracks, musicAlbum.size());
    }

    @Test
    public void isEmpty() {
        CustomSet musicAlbum = new CustomSet();
        Assert.assertTrue(musicAlbum.isEmpty());
    }

    @Test
    public void contains() {
        musicAlbum.add(track1);
        Assert.assertTrue(musicAlbum.contains(track1));
    }

    @Test
    public void toArray() {
        musicAlbum.add(track1);
        numOfTracks = 1;
        MusicTrack[] expected = {track1};
        Assert.assertArrayEquals(expected, musicAlbum.toArray());
    }

    @Test
    public void toArray1() {
        musicAlbum.add(track1);
        numOfTracks = 1;
        MusicTrack[] expected = {track1};
        Assert.assertArrayEquals(expected, musicAlbum.toArray());
    }

    @Test
    public void add() {
        Assert.assertTrue(musicAlbum.add(track1));
    }

    @Test
    public void remove() {
        musicAlbum.add(track1);
        Assert.assertTrue(musicAlbum.remove(track1));
    }

    @Test
    public void containsAll() {
        CustomSet expected = new CustomSet(track1);
        expected.add(track2);
        //expected.add(track3);
        musicAlbum.add(track1);
        musicAlbum.add(track2);
        musicAlbum.add(track3);
        Assert.assertTrue(musicAlbum.containsAll(expected));
    }

    @Test
    public void addAll() {
        CustomSet expected = new CustomSet(track1);
        expected.add(track2);
        expected.add(track3);
        Assert.assertTrue(musicAlbum.addAll(expected));
    }

    @Test
    public void retainAll() {
        CustomSet expected = new CustomSet();
        expected.add(track1);
        expected.add(track2);
        musicAlbum.add(track1);
        musicAlbum.add(track2);
        musicAlbum.add(track3);
        Assert.assertTrue(musicAlbum.retainAll(expected));
    }

    @Test
    public void removeAll() {
        CustomSet expected = new CustomSet();
        expected.add(track1);
        expected.add(track2);
        musicAlbum.add(track1);
        musicAlbum.add(track2);
        musicAlbum.add(track3);
        Assert.assertTrue(musicAlbum.removeAll(expected));
    }

    @Test
    public void clear() {
        musicAlbum.add(track1);
        musicAlbum.add(track2);
        musicAlbum.add(track3);
        Object[] expected = {null, null, null};
        //for (int i = 0; i < numOfTracks; i++) {
        //    expected.add(null);
        //}
        musicAlbum.clear();
        Assert.assertArrayEquals(expected, musicAlbum.toArray());
    }
    @AfterClass
    public static void theEnd(){
        System.out.println("\n\tAll tests completed. Check the results.");
    }

}