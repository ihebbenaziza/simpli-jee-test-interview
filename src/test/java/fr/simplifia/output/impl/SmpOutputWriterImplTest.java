package fr.simplifia.output.impl;

import java.io.PrintStream;
import java.util.Locale;

import fr.simplifia.input.locale.LocaleExtractor;
import org.junit.Before;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

/**
 * Created by simplifia on 18/09/17.
 */
public class SmpOutputWriterImplTest {
    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    private PrintStream stream;

    public SmpOutputWriterImplTest(){
        stream = Mockito.mock(PrintStream.class);
       doNothing().when(stream).println(anyString());
    }

    //TODO
    @Test
    public void testPrint() throws Exception {



    }

    //TODO
    @Test
    public void testPrintEmpty() throws Exception {
        stream = Mockito.mock(PrintStream.class);
        assertEquals(stream, "");
    }

    //TODO
    @Test
    public void testPrintNull() throws Exception {
        stream = Mockito.mock(PrintStream.class);
        assertEquals(stream, null);
    }

}