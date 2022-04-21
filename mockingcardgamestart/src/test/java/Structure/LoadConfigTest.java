package Structure;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class LoadConfigTest {

    LoadConfig loadConfig = new LoadConfig();

    @Test
    void populatePropertyData() {
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.hasNext()).thenReturn(true);
        when(mockScanner.nextLine()).thenReturn("Alan");
        loadConfig.setPropertyReader(mockScanner);
        loadConfig.populatePropertyData();
        assertEquals("Alan",loadConfig.getConfig());


    }


    @Test
    void getConfig() {
        fail("Not yet implemented"); //Remove
    }
}