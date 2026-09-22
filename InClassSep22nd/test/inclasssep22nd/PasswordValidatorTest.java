/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package inclasssep22nd;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BLAZE
 */
public class PasswordValidatorTest {
    
    @Test
    public void passwordWithLessThanEightCharactersIsInvalid() {

        PasswordValidator validator = new PasswordValidator();

        assertFalse(validator.isValid("abcdefg"));
    }
    @Test
    public void passwordMustContainAnUppercaseLetter() {

        PasswordValidator validator =
            new PasswordValidator();

        assertFalse(validator.isValid("abcdefghijk"));
    }
    
    @Test
    public void passwordMustContainNumber(){
        PasswordValidator validator =
            new PasswordValidator();
        assertFalse(validator.isValid("Abcdefghi"));
    }
    
    /*
    @Test
    public void passwordMustContainSpecial(){
        PasswordValidator validator =
            new PasswordValidator();
        assertFalse(validator.isValid("Abcdefghi123"));
    }
    */
        
    /*
    @Test
    public void passwordFulfillsAllRequirements() {
        PasswordValidator validator =
            new PasswordValidator();
        
        assertTrue(validator.isValid("123Abcdefg"));
    }
    */
    
    
}
