package fr.simplifia.input.locale;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.Test;
import java.util.Locale;

import static org.testng.Assert.*;
public class LocaleExtractorTest {
    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testToLocale() throws Exception {
        assertEquals(Locale.FRENCH, LocaleExtractor.toLocale("fr"));
    }

    @Test //TODO
    public void testToLocaleEn() throws Exception {
        assertEquals(Locale.ENGLISH, LocaleExtractor.toLocale("en"));
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testToLocaleNull() throws Exception {
        LocaleExtractor.toLocale(null);
    }

    @Test //TODO
    public void testToLocaleNEmpty() throws Exception {
       LocaleExtractor.toLocale("");
    }


}