package eu.doppel_helix.dev.testjnaloading;

import com.sun.jna.NativeLibrary;
import org.junit.Test;


public class MainTest {

    @Test
    public void testLoading() {
        System.out.println("Loading");
        NativeLibrary.getInstance(null);
        System.out.println("Done");
    }
}
