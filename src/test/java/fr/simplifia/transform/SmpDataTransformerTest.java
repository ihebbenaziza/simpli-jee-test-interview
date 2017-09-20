package fr.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;
import org.junit.Before;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import static org.testng.Assert.*;


public class SmpDataTransformerTest {

    private SmpInputValidator validator;
    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    public SmpDataTransformerTest(){
        validator = Mockito.mock(SmpInputValidator.class);
        //TODO : mocking strategy
        String input=anyString();
        when(validator.validateInput(input)).thenReturn(input);
        assertEquals(validator.validateInput(input),input);
    }

    @Test
    public void testTransformOk() throws Exception {

    }

    @Test
    public void testTransformNotOk() throws Exception {

    }


    @Test
    public void testTransformEmpty() throws Exception {

    }

    @Test
    public void testTransformNull() throws Exception {

    }


}