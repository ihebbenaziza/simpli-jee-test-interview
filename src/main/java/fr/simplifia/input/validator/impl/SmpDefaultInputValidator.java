package fr.simplifia.input.validator.impl;

import fr.simplifia.input.exception.InputException;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmpDefaultInputValidator extends AbstractSmpInputValidator {

    private  static Pattern enpattern = Pattern.compile (".[^éèê]*");


    protected SmpDefaultInputValidator(Locale locale) {
        super(locale);
    }

    @Override
    public String validateInput(final String input) throws InputException {
        Matcher matcher = enpattern.matcher (input);
        if(!matcher.matches()&& locale.equals(Locale.ENGLISH)){
            throw new InputException("The input given is not compatible with the default validation strategy");

        }else{
            return input;
        }
    }
}
